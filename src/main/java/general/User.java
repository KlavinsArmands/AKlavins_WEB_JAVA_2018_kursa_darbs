package general;

import lombok.Data;

import static utils.RandomGenerator.*;

@Data
public class User {


    private String firstName;
    private String lastName;
    private String mobileNumber;
    private String emailAddress;
    private String password;
    private String address;


    public User() {
        this.firstName = generateRandomString();
        this.lastName = generateRandomString();
        this.mobileNumber  = generateRandomPhoneNumber();
        this.emailAddress = generateRandomEmail();
        this.password = generateRandomString();
        this.address =generateRandomAddress();
    }

}
