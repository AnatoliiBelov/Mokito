package org.example.dao;

import org.example.model.User;

public interface UserDao {
    User getUserByName(String userName);
}
