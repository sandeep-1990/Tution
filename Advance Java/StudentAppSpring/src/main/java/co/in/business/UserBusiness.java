package co.in.business;

import java.util.List;

import co.in.bean.User;

public interface UserBusiness {

	void saveUser(User user);

	User getUser(String rollNo);

	List<User> getAllUsers();
}
