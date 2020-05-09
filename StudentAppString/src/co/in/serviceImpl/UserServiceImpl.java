package co.in.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.in.bean.User;
import co.in.dao.UserDao;
import co.in.service.UserService;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    public void saveUser(User user) {
        userDao.saveUser(user);
    }

    public List<User> getUser(String name) {
        return userDao.getUser(name);
    }

    public List<User> getAllUsers() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<String> getUserNameList() {
        return userDao.getUserNameList();
    }

}