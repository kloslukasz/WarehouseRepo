package pl.lklos.service;

import org.mindrot.jbcrypt.BCrypt;
import pl.lklos.dao.UserDao;
import pl.lklos.dao.UserDaoImpl;
import pl.lklos.model.User;
import pl.lklos.util.PasswordUtil;

import java.util.Optional;

public class UserService {

    private UserDao userDao = new UserDaoImpl();

    public boolean isUserValid(String login, String password) {

        return userDao.getUser(login)
                .map(user -> {
                    boolean doesPasswordMatch = PasswordUtil.checkPassword(password, user.getPassword());
                    return doesPasswordMatch && login.equals(user.getLogin());
                })
                .orElse(false);
    }

    public Optional<User> getUser(String username) {
        return userDao.getUser(username);
    }
}//(user -> password.equals(user.getPassword()) && login.equals(user.getLogin())