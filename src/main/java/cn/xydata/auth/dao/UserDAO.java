package cn.xydata.auth.dao;

import java.util.List;
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
	
	/**
	 * 登陆用户名密码验证
	 * @param map(username=?,password=?)
	 * @return 1 or 0 
	 */
	public int auth(Map<Object,Object> map);
	
	/**
	 * 获取用户详细信息
	 * @param username
	 * @return UserModel
	 */
	public UserModel getUser(String username);
	
	/**
	 * 注册时验证用户名是否被使用
	 * @param username
	 * @return 1 or 0
	 */
	public int validateUsername(String username);
	
	public List<UserModel> listUser();

}
