package ua.org.javadevs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ua.org.javadevs.dao.UserDao;
import ua.org.javadevs.entity.User;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public boolean saveNewAccount(User user) {
        if(userDao.saveNewAccount(user))
            return true;
        return false;
    }
}
