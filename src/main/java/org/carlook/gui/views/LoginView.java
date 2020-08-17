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
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;


public class LoginView extends VerticalLayout implements View {

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {


        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);

        if(user == null) {
            this.setUp();
        } else {
            UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
        };
    }

    public LoginView(){};

    public void setUp() {
        this.setSizeFull();
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
        TextFieldWithIcon emailTextField = new TextFieldWithIcon("Email", emailFieldLabel, false);


        Label passwortFieldLabel = new Label();
        passwortFieldLabel.setIcon(VaadinIcons.PASSWORD);
        TextFieldWithIcon passwortTextField = new TextFieldWithIcon("Passwort", passwortFieldLabel, true);

        Button loginButton = new Button("Login");
        loginButton.setStyleName("loginButton");

        Button switchRegister = new Button("Switch to Register");
        switchRegister.setStyleName("switchRegisterButton");

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
