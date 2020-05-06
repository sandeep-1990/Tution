package co.in.dao;

import java.util.List;

import co.in.bean.User;

public interface UserDao {

	void saveUser(User user);

	User getUser(String rollNo);

	List<User> getAllUsers();

}
