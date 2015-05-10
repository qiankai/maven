package cn.xydata.auth.test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.xydata.auth.model.UserModel;
import cn.xydata.auth.service.UserService;



public class UserTest {
	
	private UserService userService;
    
    @Before
    public void before(){                                                                   
        @SuppressWarnings("resource")
        ApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"classpath:conf/spring.xml"
                ,"classpath:conf/spring-mybatis.xml"});
        userService = (UserService) context.getBean("userServiceImpl");
    }
     
//    @Test
//    public void addUser(){
//        UserModel user = new UserModel();
//        user.setUsername("hello");
//        user.setPassword("hdsssjskd");
//        user.setFirst_name("fiets");
//        user.setEmail("en@email.com");
//        user.setLast_login(new Date());
//        user.setDate_joined(new Date());
//        user.setLast_name("lsta");
//        System.out.println(userService.insert(user));
//    }
//    
    @Test
    public void select(){
    	UserModel user = userService.getUser("hello");
    	System.out.println(user.getPassword());
    }
    
    @Test
    public void auth(){
    	Map map = new HashMap();
    	map.put("username", "hello");
    	map.put("password", "hdsssjskd");
    	System.out.println(userService.auth(map));
    	
    }
    
    @Test
    public void validate(){
    	System.out.println("validate!");
    	System.out.println(userService.validateusername("hello"));
    }
    

}
