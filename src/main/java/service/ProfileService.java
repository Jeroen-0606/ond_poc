package service;

import DAO.ProfileDAO;

import javax.ejb.Stateless;
import javax.inject.Inject;

/**
 * Created by Jeroen0606 on 15-6-2017.
 */
@Stateless
public class ProfileService {
    @Inject
    ProfileDAO profileDAO;

    public ProfileService() {};
}
