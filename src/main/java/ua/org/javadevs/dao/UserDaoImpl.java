package ua.org.javadevs.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import ua.org.javadevs.entity.User;

import java.util.List;
//import javax.transaction.Transactional;

@Repository
public class UserDaoImpl implements UserDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public boolean saveNewAccount(User user) {
        Session session = sessionFactory.getCurrentSession();
        if (checkIfUserExists(user.getLogin())) {
            return false;
        }
        session.persist(user);
        return true;
    }

    private boolean checkIfUserExists(String login2) {
        Session session = sessionFactory.getCurrentSession();

        List result = session.createQuery("from User u where u.login = :login2").setParameter("login2", login2).list();
        if (result.size() < 1) {
            return false;
        } else return true;
    }
}
