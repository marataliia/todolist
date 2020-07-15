package kg.itacademy.securitylesson.service;

import kg.itacademy.securitylesson.entity.User;
import kg.itacademy.securitylesson.model.UserAuth;

import java.util.List;
import java.util.Optional;

public interface UserService {
    List<User> getAll();
    User create(User user);
    User getById(Long id);
    String getToken(UserAuth userAuth);
    User getByLogin(String login);
}
