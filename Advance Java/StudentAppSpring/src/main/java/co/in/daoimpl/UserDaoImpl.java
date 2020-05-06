package co.in.daoimpl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.stereotype.Component;

import co.in.bean.User;
import co.in.dao.UserDao;
import co.in.springcrud.factory.HibernateConnectionFactory;


@Component
public class UserDaoImpl implements UserDao {

	public void saveUser(User user) {
		try{
			Session session = HibernateConnectionFactory.getSessionFactory().openSession(); 
			session.beginTransaction();
			session.save(user);
			session.getTransaction().commit();
		} catch (HibernateException e) {
			e.printStackTrace();
		}
		
	}

	public User getUser(String rollNo) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return null;
	}

}
