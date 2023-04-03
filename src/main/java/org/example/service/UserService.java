package org.example.service;


import org.example.dao.Impl.UserDaoImpl;
import org.example.model.User;

public class UserService {
    private UserDaoImpl userDao;

    public UserService(UserDaoImpl userDao) {
        this.userDao = userDao;
    }

    public UserDaoImpl getUserDao() {
        return userDao;
    }

public boolean checkUserExist(User user){
    return userDao.getUserList().contains(user);
}
}
