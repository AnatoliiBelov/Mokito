package org.example.service;

import org.example.dao.Impl.UserDaoImpl;
import org.example.model.User;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

class UserServiceTest {
    private User PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST = new User("Белов Анатолий Леонидович", 30);
    private User PERSON_WHO_IS_MISSING_IN_LIST = new User("Степанов Сергей Николаевич", 30);


    @Mock
    private UserDaoImpl userDao;
    @InjectMocks
    private UserService out;

    @BeforeEach
    public void iniMocks(){
        MockitoAnnotations.initMocks(this);
    }
    @Test
    void checkUserExist() {
        List<User> users = new ArrayList<>();
        users.add(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST);
        when(userDao.getUserList()).thenReturn(users);
//        userDao.getUserList().add(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST);
//        when(userDao.getUserList().contains(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST)).thenReturn(true);
        assertEquals(true,out.checkUserExist(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST));
//        when(userDao.getUserList().contains(PERSON_WHO_IS_MISSING_IN_LIST)).thenReturn(false);
        assertEquals(false,out.checkUserExist(PERSON_WHO_IS_MISSING_IN_LIST));
    }
}