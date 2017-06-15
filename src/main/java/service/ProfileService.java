package service;

import DAO.ProfileDAO;
import model.Profile;

import javax.ejb.Stateless;
import javax.inject.Inject;
import java.util.List;

/**
 * Created by Jeroen0606 on 15-6-2017.
 */
@Stateless
public class ProfileService {
    @Inject
    ProfileDAO profileDAO;

    public ProfileService() {}

    public void saveProfile(String email, String password, String firstname, String lastname, String nickname, String isAdmin) {
        if(isAdmin.equals("Y")) {
            //Y
            profileDAO.addProfile(new Profile(email, password, firstname, lastname, nickname, true));
        } else {
            //N
            profileDAO.addProfile(new Profile(email, password, firstname, lastname, nickname, false));
        }
    }

    public Profile getProfile(String email) {
        return profileDAO.getProfile(email);
    }

    public List<Profile> getAllProfiles() {
        return profileDAO.getAllProfiles();
    }

    public void updatePassword(Profile profile, String password, String oldPassword) {
        profile.setPassword(password, oldPassword);
    }

    public Profile login(String email, String password) {
        Profile profile;
        if(getProfile(email) != null) {
            profile = getProfile(email);
            if(profile.checkPassword(password)) {
                return profile;
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
