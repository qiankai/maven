package cn.xydata.auth.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.xydata.auth.dao.UserDAO;
import cn.xydata.auth.model.UserModel;
import cn.xydata.auth.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	private UserDAO userDAO;
	
	public int insert(UserModel user){
		return userDAO.insert(user);
	}
	
	public UserModel getUser(String username){
		return userDAO.getuser(username);
	}
	
	public int auth(Map<Object,Object> map){
		return userDAO.auth(map);
	}
	
	public int validateusername(String username){
		return userDAO.validateusername(username);
	}
	
}
