package co.in.businessimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.in.bean.User;
import co.in.business.UserBusiness;
import co.in.service.UserService;

@Component
public class UserBusinessImpl implements UserBusiness{

	@Autowired
	UserService userService;
	
	
	public void saveUser(User user) {
		
		userService.saveUser(user);
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
