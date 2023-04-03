package org.example.dao.Impl;

import org.example.dao.UserDao;
import org.example.model.User;

import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {

    private List<User> userList = new ArrayList<>();



    @Override
    public User getUserByName(String userName) {
        for (int i = 0; i < userList.size(); i++) {
            if (userList.get(i).getName().equals(userName)) {
                return userList.get(i);
            }

        }  return null;
    }

    public List<User> findAllUsers(){
        return userList;
    }


    public List<User> getUserList() {
        return userList;
    }

}
