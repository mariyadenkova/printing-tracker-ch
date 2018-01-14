package eu.printingtrackerv2.model.bindingModels;


import eu.printingtrackerv2.annotations.IsPasswordMatching;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

import javax.persistence.Column;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@IsPasswordMatching
public class RegistrationModel {

    @NotEmpty (message = "First name required!")
    private String firstName;

    @NotEmpty (message = "Last name required!")
    private String lastName;

    @Pattern(regexp = "^[(0)]\\d{3}-\\d{3}-\\d{3}$", message = "Phone number must match the pattern 0555-555-555")  //^[(0)]\d{3}-\d{2}-\d{4}$
    private String phoneNumber;

    @Email(message = "Username must be a valid e-mail address")
    @NotEmpty
    @Column(unique = true)
    private String username;

    @Size(min = 5, message = "Password too short")
    @NotEmpty
    private String password;

    @NotEmpty
    private String confirmPassword;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

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
