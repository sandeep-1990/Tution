package co.in.business;

import java.util.List;

import co.in.bean.User;

public interface UserBusiness {

    void saveUser(User user);

    List<User> getUser(String name);

    List<String> getUserNameList();

}