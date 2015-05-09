package cn.xydata.maven.service;

import java.util.List;

import cn.xydata.maven.model.User;

public interface UserService {
	
	public int insertUser(User user);

	public List<User> getUsers();
}
