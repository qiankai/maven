package cn.xydata.auth.service;

import java.util.Map;

import cn.xydata.auth.model.UserModel;

public interface UserService {
	
	public int insert(UserModel user);
	
	public UserModel getUser(String username);
	
	public int auth(Map<Object,Object> map);
	
	public int validateusername(String username);

}
