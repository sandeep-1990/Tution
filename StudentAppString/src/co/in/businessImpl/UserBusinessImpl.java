package co.in.businessImpl;

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

    public List<User> getUser(String name) {
        return userService.getUser(name);
    }

    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<String> getUserNameList(){
        return userService.getUserNameList();
    };

}