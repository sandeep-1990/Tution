package co.in.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.springframework.stereotype.Component;

import co.in.bean.User;
import co.in.dao.UserDao;
import co.in.springcrud.factory.HibernateConnectionFactory;


@Component
public class UserDaoImpl implements UserDao {

    public void saveUser(User user) {
        try {
            Session session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            session.save(user);
            session.getTransaction().commit();
        } catch (HibernateException e) {
            e.printStackTrace();
        }

    }

    public List<User> getUser(String name) {
        try {
            Session session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            Criteria criteria = session.createCriteria(User.class);
            criteria.add(Restrictions.eq("name", name));
            List<User> users = criteria.list();
            return users;
        } catch (HibernateException e) {
            e.printStackTrace();
            return null;
        }
    }

    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<String> getUserNameList() {
        try {
            Session session = HibernateConnectionFactory.getSessionFactory().openSession();
            session.beginTransaction();
            Criteria criteria = session.createCriteria(User.class);
            criteria.setProjection(Projections.property("name"));
            List<String> userNameList = criteria.list();
            return userNameList;
        } catch (HibernateException e) {
            return null;
        }
    }

    ;

}