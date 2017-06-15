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
public class ProfileBean implements Serializable {
    @Inject
    ProfileService profileService;

    private Profile profile;

    public ProfileBean() {}

    public void updateLastname(String lastname) {
        profile.setLastName(lastname);
    }

    public void updateNickname(String nickname) {
        profile.setNickName(nickname);
    }

    public void updatePassword(String oldPassword, String newPassword) {
        profileService.updatePassword(profile, oldPassword, newPassword);
    }
}
