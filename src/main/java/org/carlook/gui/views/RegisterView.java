package org.carlook.gui.views;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.*;
import org.carlook.controller.LoginControl;
import org.carlook.controller.exception.DatabaseException;
import org.carlook.gui.components.Footer;
import org.carlook.gui.components.Header;
import org.carlook.gui.components.TextFieldWithIcon.TextFieldWithIcon;
import org.carlook.model.objects.entities.User;
import org.carlook.services.util.*;

public class RegisterView extends VerticalLayout implements View{


    public void enter(ViewChangeListener.ViewChangeEvent event) {


        User user = (User) UI.getCurrent().getSession().getAttribute(Roles.CURRENT_USER);

        if(user == null) {
            this.setUp();
        } else {
            UI.getCurrent().getNavigator().navigateTo(Views.USERSEARCHVIEW);
        };
    }

    public RegisterView(){};

    public void setUp(){
        addComponent(new Header(false));

        VerticalLayout layout = new VerticalLayout();

        Panel panel = new Panel("Registierung:");
        this.addComponent(panel);
        this.setComponentAlignment(panel, Alignment.MIDDLE_CENTER);
        panel.addStyleName("login");
        panel.setContent(layout);
        panel.setStyleName("panel");
        panel.setSizeUndefined();


        Label emailFieldLabel = new Label();
        emailFieldLabel.setIcon(VaadinIcons.ENVELOPE);
        TextField emailField = new TextField();
        TextFieldWithIcon emailTextField = new TextFieldWithIcon(emailField, OtherMethods.getStringWithFirstUpperLetter(DBTables.User.COL_EMAIL), emailFieldLabel);

        Label vornameFieldLabel = new Label();
        vornameFieldLabel.setIcon(VaadinIcons.USER);
        TextField vornameField = new TextField();
        TextFieldWithIcon vornameTextField = new TextFieldWithIcon(vornameField,OtherMethods.getStringWithFirstUpperLetter(DBTables.User.COL_VORNAME), vornameFieldLabel);

        Label nachnameFieldLabel = new Label();
        nachnameFieldLabel.setIcon(VaadinIcons.USER);
        TextField nachnameField = new TextField();
        TextFieldWithIcon nachnameTextField = new TextFieldWithIcon(nachnameField,OtherMethods.getStringWithFirstUpperLetter(DBTables.User.COL_NACHNAME), nachnameFieldLabel);

        Label passwortFieldLabel = new Label();
        passwortFieldLabel.setIcon(VaadinIcons.PASSWORD);
        PasswordField passwordField = new PasswordField();
        TextFieldWithIcon passwortTextField = new TextFieldWithIcon(passwordField,OtherMethods.getStringWithFirstUpperLetter(DBTables.User.COL_PASSWORD), passwortFieldLabel);

        Label repeatPasswortFieldLabel = new Label();
        repeatPasswortFieldLabel.setIcon(VaadinIcons.PASSWORD);
        PasswordField repeatPassswordField = new PasswordField();
        TextFieldWithIcon repeatPasswortTextField = new TextFieldWithIcon(repeatPassswordField, Parameter.RE_ENTER_PASSWORD_STRING, repeatPasswortFieldLabel);

        Button registerButton = new Button("Register");
        Button switchLogin = new Button("Switch to Login");
        registerButton.setStyleName("buttonBlue");
        registerButton.setId("loginButton");
        switchLogin.setStyleName("buttonBlue");

        layout.addComponent(emailTextField);
        layout.addComponent(vornameTextField);
        layout.addComponent(nachnameTextField);
        layout.addComponent(passwortTextField);
        layout.addComponent(repeatPasswortTextField);
        HorizontalLayout buttonBar = new HorizontalLayout();
        buttonBar.addComponent(switchLogin);
        buttonBar.addComponent(registerButton);
        layout.addComponent(buttonBar);

        this.addComponent(new Footer());


        //Component Logic

        registerButton.addClickListener(e ->{

            String email = emailTextField.getValue();
            String password = passwortTextField.getValue();
            String repeatPassword = repeatPasswortTextField.getValue();
            String vorname = vornameTextField.getValue();
            String nachname = nachnameTextField.getValue();

            if(email.equals("") || password.equals("") || vorname.equals("") || nachname.equals("")){
                Notification.show("Error", "Any field is mandatory. Please try again", Notification.Type.ERROR_MESSAGE);
            return;
            }
            if(!repeatPassword.equals(password)){
                Notification.show("Error", "Passwords dont match", Notification.Type.ERROR_MESSAGE);
                return;
            }
            try{
                LoginControl.register(email,password, vorname, nachname);
            }catch(DatabaseException ex1){
                Notification.show("Error", ex1.getReason(), Notification.Type.ERROR_MESSAGE);
                emailTextField.setValue("");
                passwortTextField.setValue("");
                return;
            }catch(Exception ex){
                Notification.show("Error", ex.getMessage(), Notification.Type.ERROR_MESSAGE);
            }
            Notification.show("Sucessfully", "Sign up scuessfully", Notification.Type.ASSISTIVE_NOTIFICATION);
        });

        switchLogin.addClickListener(e ->{
            UI.getCurrent().getNavigator().navigateTo(Views.LOGIN);
        });

    }


}
