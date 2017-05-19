package ua.org.javadevs.dao;

import ua.org.javadevs.entity.User;

/**
 * Created by okhelenyuk on 19.05.2017.
 */
public interface UserDao {
    boolean saveNewAccount(User user);
}
