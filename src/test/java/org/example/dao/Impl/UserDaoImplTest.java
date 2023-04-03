package org.example.dao.Impl;

import org.example.model.User;
import org.example.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.*;

class UserDaoImplTest {
    private User PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST = new User("Белов Анатолий Леонидович", 30);
    private User PERSON_WHO_IS_MISSING_IN_LIST = new User("Степанов Сергей Николаевич", 30);
//    @Mock
//    private UserDaoImpl userDao;
//
//    @InjectMocks
//    private UserService out;

    @Test
    void shouldUserByName() {
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.getUserList().add(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST);
        assertEquals(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST, userDao.getUserByName(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST.getName()));
        assertNotNull(userDao.getUserByName(PERSON_WHO_IS_DEFINITELY_PRESENT_IN_LIST.getName()));
    }
    @Test
    void shouldReturnNullIfUserMissingInList(){
        UserDaoImpl userDao = new UserDaoImpl();
        assertNull(userDao.getUserByName(PERSON_WHO_IS_MISSING_IN_LIST.getName()));
    }
}