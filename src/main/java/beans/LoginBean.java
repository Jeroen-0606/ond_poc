package beans;

import model.Profile;
import service.ProfileService;

import javax.enterprise.context.SessionScoped;
import javax.inject.Inject;
import java.io.Serializable;

/**
 * Created by Jeroen0606 on 15-6-2017.
 */
@SessionScoped
public class LoginBean implements Serializable {
    private Profile profile;

    @Inject
    ProfileService profileService;

    public LoginBean() {}

    public boolean login(String email, String password) {
        profile = profileService.login(email, password);
        if(profile != null) {
            return true;
        } else {
            return false;
        }
    }

    public Profile getCurrentProfile() {
        return profile;
    }
}
