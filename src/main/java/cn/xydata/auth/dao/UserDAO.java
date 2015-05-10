package cn.xydata.auth.dao;

import java.util.Map;

import cn.xydata.auth.model.UserModel;



public interface UserDAO {
	
	/**
	 * 插入用户
	 * @param user
	 * @return
	 */
	public int insert(UserModel user);
	
	/**
	 * 更新用户
	 * @param user
	 * @return
	 */
	public int update(UserModel user);
	
	/**
	 * 删除用户
	 * @param user
	 * @return
	 */
	public int delete(UserModel user);
	
	public UserModel auth(Map<Object,Object> map);
	
	public UserModel getuser(String username);
	

}
