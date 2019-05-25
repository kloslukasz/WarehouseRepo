package pl.lklos.dao;

import pl.lklos.model.User;

import java.util.Optional;

public interface UserDao {
    Optional<User> getUser(String login);
}
