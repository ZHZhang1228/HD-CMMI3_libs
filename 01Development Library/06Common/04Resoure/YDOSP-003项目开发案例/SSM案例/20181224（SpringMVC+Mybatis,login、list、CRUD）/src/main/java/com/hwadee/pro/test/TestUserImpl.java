package com.hwadee.pro.test;

import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.junit.BeforeClass;
import org.junit.Test;

import com.hwadee.pro.dao.UserDaoI;
import com.hwadee.pro.dao.impl.UserImpl;
import com.hwadee.pro.model.users;

public class TestUserImpl {

	static UserDaoI userDao;

    @BeforeClass
    public static void beforeClass() {
    	userDao = new UserImpl();
    }

    @Test
    public void testGetAllUserTypes(){
        List<users> userss = userDao.getAllUser();
        for(users user:userss){
            System.out.println(user.getUsername());
        }
        assertNotNull(userss);
    }
    
/*    public static void main(String[] args) {
    	List<users> userss = userDao.getAllUser();
    	System.out.println("1234567890");
    
        for(users users:userss){            
            System.out.println(users.getUsername());
        }
    	
    }*/
}
