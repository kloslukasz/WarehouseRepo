package pl.lklos.service;

import pl.lklos.dao.UserDao;
import pl.lklos.dao.UserDaoImpl;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public boolean isUserValid(String login, String password) {

        return userDao.getUser(login)
                .map(user -> password.equals(user.getPassword()) && login.equals(user.getLogin()))
                .orElse(false);

    }
}
