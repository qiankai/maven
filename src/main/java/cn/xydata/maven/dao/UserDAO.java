package cn.xydata.maven.dao;

import java.util.List;

import cn.xydata.maven.model.User;

public interface UserDAO {
	/**
     * ������û�
     * @param user
     * @return
     */
    public int insertUser(User user);
    
    public List<User> getUsers();
}
