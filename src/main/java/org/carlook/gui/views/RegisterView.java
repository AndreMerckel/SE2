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
import org.carlook.services.util.Roles;
import org.carlook.services.util.Views;

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
        this.setSizeFull();
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
        emailFieldLabel.setIcon(VaadinIcons.USER);
        TextField emailField = new TextField();
        TextFieldWithIcon emailTextField = new TextFieldWithIcon(emailField,"Email", emailFieldLabel);

        Label vornameFieldLabel = new Label();
        vornameFieldLabel.setIcon(VaadinIcons.USER);
        TextField vornameField = new TextField();
        TextFieldWithIcon vornameTextField = new TextFieldWithIcon(vornameField,"Vorname", vornameFieldLabel);

        Label nachnameFieldLabel = new Label();
        nachnameFieldLabel.setIcon(VaadinIcons.USER);
        TextField nachnameField = new TextField();
        TextFieldWithIcon nachnameTextField = new TextFieldWithIcon(nachnameField,"Nachname", nachnameFieldLabel);

        Label passwortFieldLabel = new Label();
        passwortFieldLabel.setIcon(VaadinIcons.PASSWORD);
        PasswordField passwordField = new PasswordField();
        TextFieldWithIcon passwortTextField = new TextFieldWithIcon(passwordField,"Passwort", passwortFieldLabel);

        Label repeatPasswortFieldLabel = new Label();
        repeatPasswortFieldLabel.setIcon(VaadinIcons.PASSWORD);
        PasswordField repeatPassswordField = new PasswordField();
        TextFieldWithIcon repeatPasswortTextField = new TextFieldWithIcon(repeatPassswordField,"Passwort", repeatPasswortFieldLabel);

        Button registerButton = new Button("Register");
        Button switchLogin = new Button("Switch to Login");
        registerButton.setStyleName("login_button");
        registerButton.setId("loginButton");

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

            if(!repeatPassword.equals(password)){
                Notification.show("Error", "Passwords dont match", Notification.Type.ERROR_MESSAGE);
                return;
            }
                try{
                LoginControl.register(email,password, vorname, nachname);
            }catch(DatabaseException ex1){
                Notification.show("Error", "Db Error", Notification.Type.ERROR_MESSAGE);
                emailTextField.setValue("");
                passwortTextField.setValue("");
            }
            Notification.show("Sucessfully", "Sign up scuessfully", Notification.Type.ASSISTIVE_NOTIFICATION);
        });

        switchLogin.addClickListener(e ->{
            UI.getCurrent().getNavigator().navigateTo(Views.LOGIN);
        });

    }


}
