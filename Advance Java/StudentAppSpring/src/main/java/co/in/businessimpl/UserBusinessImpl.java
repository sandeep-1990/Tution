package co.in.businessimpl;

import org.springframework.stereotype.Component;

import co.in.bean.User;
import co.in.business.UserBusiness;

@Component
public class UserBusinessImpl implements UserBusiness{

	public String saveUser(User user) {
	
		return "Connect";
		
	}

}
