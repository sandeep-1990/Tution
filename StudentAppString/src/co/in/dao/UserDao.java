package co.in.dao;

import java.util.List;

import co.in.bean.User;

public interface UserDao {

    void saveUser(User user);

    List<User> getUser(String rollNo);

    List<User> getAllUsers();

    List<String> getUserNameList();

}