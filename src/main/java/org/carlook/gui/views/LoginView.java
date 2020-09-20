package org.carlook.gui.views;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import org.carlook.controller.LoginControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.controller.exception.NoSuchUserOrPassword;
import org.carlook.gui.components.*;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.objects.entities.User;
import org.carlook.services.util.*;

/**
 * Landingpage
 */
public class LoginView extends VerticalLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {


        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);

        if(user == null) {
            this.setUp();
        } else if(UI.getCurrent().getSession().getAttribute(Roles.STATUS) == StatusUser.KUNDE) {
            UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
        } else if(UI.getCurrent().getSession().getAttribute(Roles.STATUS) == StatusUser.VERTRIEBLER ){
            UI.getCurrent().getNavigator().navigateTo(Views.SALESVIEW);
        };
    }

    public LoginView(){};

    public void setUp() {
        addComponent(new Header(false));

        VerticalLayout layout = new VerticalLayout();

        Panel panel = new Panel("Bitte einloggen:");
        this.addComponent(panel);
        this.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
        panel.addStyleName("login");
        panel.setContent(layout);
        panel.setStyleName("panel");
        panel.setSizeUndefined();


        Label emailFieldLabel = new Label();
        emailFieldLabel.setIcon(VaadinIcons.USER);
        TextField textField = new TextField();
        TextFieldWithIcon emailTextField = new TextFieldWithIcon(textField, OtherMethods.getStringWithFirstUpperLetter(DBTables.User.COL_EMAIL), emailFieldLabel);

        Label passwortFieldLabel = new Label();
        passwortFieldLabel.setIcon(VaadinIcons.PASSWORD);
        PasswordField passwordField = new PasswordField();
        TextFieldWithIcon passwortTextField = new TextFieldWithIcon(passwordField,OtherMethods.getStringWithFirstUpperLetter(DBTables.User.COL_PASSWORD), passwortFieldLabel);

        Button loginButton = new Button("Login");
        loginButton.setStyleName("loginButton");

        Button switchRegister = new Button("Switch to Register");
        switchRegister.setStyleName("buttonBlue");

        layout.addComponent(emailTextField);
        layout.addComponent(passwortTextField);
        HorizontalLayout buttonBar = new HorizontalLayout();
        buttonBar.addComponent(switchRegister);
        buttonBar.addComponent(loginButton);
        layout.addComponent(buttonBar);

        addComponent(new Footer());


        //Component Logic

        loginButton.addClickListener(e ->{
            String email = emailTextField.getValue();
            String password = passwortTextField.getValue();

            try{
                LoginControl.checkAuthentication(email,password);
            }catch(NoSuchUserOrPassword ex1){
                Notification.show("Error", "Wrong Email or Password. Please try again.", Notification.Type.ERROR_MESSAGE);
                emailTextField.setValue("");
                passwortTextField.setValue("");            }
            catch (DatabaseException ex2) {
                Notification.show("DB-Fehler", ex2.getReason(), Notification.Type.ERROR_MESSAGE);
                emailTextField.setValue("");
                passwortTextField.setValue("");        }
        });

        switchRegister.addClickListener(e ->{
            UI.getCurrent().getNavigator().navigateTo(Views.REGISTER);
        });
    }


}
