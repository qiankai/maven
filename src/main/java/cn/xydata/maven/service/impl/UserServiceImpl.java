package cn.xydata.maven.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xydata.maven.dao.UserDAO;
import cn.xydata.maven.model.User;
import cn.xydata.maven.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;

	public int insertUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.insertUser(user);
	}
	
	public List<User> getUsers(){
		
		return userDAO.getUsers();
	}

}
