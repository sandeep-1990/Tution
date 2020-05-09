package co.in.service;

import java.util.List;

import co.in.bean.User;

public interface UserService {

    void saveUser(User user);

    List<User> getUser(String rollNo);

    List<User> getAllUsers();

    List<String> getUserNameList();

}