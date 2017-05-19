package ua.org.javadevs.service;

import ua.org.javadevs.entity.User;

/**
 * Created by okhelenyuk on 19.05.2017.
 */
public interface UserService {
    boolean saveNewAccount(User user);
}
