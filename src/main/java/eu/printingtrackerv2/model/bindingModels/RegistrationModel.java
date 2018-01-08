package eu.printingtrackerv2.model.bindingModels;


import eu.printingtrackerv2.annotations.IsPasswordMatching;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Size;

@IsPasswordMatching
public class RegistrationModel {

    @Email(message = "Username must be a valid e-mail address")
    @NotEmpty
    @Column(unique = true)
    private String username;

    @Size(min = 5, message = "Password too short")
    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
