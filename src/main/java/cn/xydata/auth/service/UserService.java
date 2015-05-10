package cn.xydata.auth.service;

import cn.xydata.auth.model.UserModel;

public interface UserService {
	
	public int insert(UserModel user);
	
	public UserModel getUser(String username);

}
