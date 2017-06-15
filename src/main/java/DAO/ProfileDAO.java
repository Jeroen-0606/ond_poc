package DAO;

import model.Profile;

import javax.ejb.Stateless;
import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jeroen0606 on 15-6-2017.
 */
@ApplicationScoped
public class ProfileDAO {
    private List<Profile> profileList;

    public ProfileDAO() {
        profileList = new ArrayList<Profile>();
    }

    public void addProfile(Profile profile) {
        profileList.add(profile);
    }

    public Profile getProfile(String email) {
        for (Profile profile : profileList) {
            if(profile.getEmail().equals(email)) {
                return profile;
            }
        }
        return null;
    }

    public List<Profile> getAllProfiles() {
        return profileList;
    }
}
