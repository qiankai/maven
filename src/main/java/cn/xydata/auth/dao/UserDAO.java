package cn.xydata.auth.dao;

import java.util.List;
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
	 * ��½�û���������֤
	 * @param map(username=?,password=?)
	 * @return 1 or 0 
	 */
	public int auth(Map<Object,Object> map);
	
	/**
	 * ��ȡ�û���ϸ��Ϣ
	 * @param username
	 * @return UserModel
	 */
	public UserModel getUser(String username);
	
	/**
	 * ע��ʱ��֤�û����Ƿ�ʹ��
	 * @param username
	 * @return 1 or 0
	 */
	public int validateUsername(String username);
	
	public List<UserModel> listUser();

}
