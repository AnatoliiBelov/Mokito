package org.example;

import org.example.dao.Impl.UserDaoImpl;
import org.example.model.User;
import org.example.service.Impl.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("Белов Анатолий Леонидович", 30);
        User user2 = new User("Белова Екатерина Александровна", 29);
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.getUserList().add(user1);
        userDao.getUserList().add(user2);
    }
}