package model;

/**
 * Created by Jeroen0606 on 15-6-2017.
 */
public class Profile {
    private String email;
    private String password;
    private String firstName;
    private String lastName;
    private String nickName;
    private Boolean isAdmin;

    public Profile(String email, String password, String firstName, String lastName, String nickName, Boolean isAdmin) {
        this.email = email;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.isAdmin = isAdmin;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

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

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setPassword(String password, String oldPassword) {
        if(oldPassword.equals(this.password)) {
            this.password = password;
        } else {
            //Do Nothing
        }
    }

    public boolean checkPassword(String password) {
        return this.password.equals(password);
    }
}
