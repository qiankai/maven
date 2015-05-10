package cn.xydata.auth.dao;

import java.util.Map;

import cn.xydata.auth.model.UserModel;



public interface UserDAO {
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public int insert(UserModel user);
	
	/**
	 * �����û�
	 * @param user
	 * @return
	 */
	public int update(UserModel user);
	
	/**
	 * ɾ���û�
	 * @param user
	 * @return
	 */
	public int delete(UserModel user);
	
	/**
	 * 
	 * @param map(username=?,password=?)
	 * @return 1 or 0 
	 */
	public int auth(Map<Object,Object> map);
	
	public UserModel getuser(String username);
	
	public int validateusername(String username);
	

}
