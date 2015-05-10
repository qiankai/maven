package cn.xydata.auth.model;

import java.util.Date;

/**
 * @author doodlelook
 * @date 2015-5-10
 * @company xydata
 *
 */
public class UserModel {
	
    /**
     * ����	
     */
	private Long id;
	/**
	 * �û���
	 */
	private String username;
	/**
	 * ��
	 */
	private String first_name;
	/**
	 * ��
	 */
	private String last_name;
	/**
	 * �����ʼ�
	 */
	private String email;
	/**
	 * ����
	 */
	private String password;
	/**
	 * �Ƿ���ʽ�˺�
	 */
	private Long is_staff;
	/**
	 * �Ƿ񼤻�
	 */
	private Long is_active;
	/**
	 * �Ƿ񳬼��û�
	 */
	private Long is_super;
	/**
	 * �Ƿ�ɾ��
	 */
	private Long is_deleted;
	/**
	 * ����¼ʱ��
	 */
	private Date last_login;
	/**
	 * ����ʱ��
	 */
	private Date date_joined;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Long getIs_staff() {
		return is_staff;
	}
	public void setIs_staff(Long is_staff) {
		this.is_staff = is_staff;
	}
	public Long getIs_active() {
		return is_active;
	}
	public void setIs_active(Long is_active) {
		this.is_active = is_active;
	}
	public Long getIs_super() {
		return is_super;
	}
	public void setIs_super(Long is_super) {
		this.is_super = is_super;
	}
	public Long getIs_deleted() {
		return is_deleted;
	}
	public void setIs_deleted(Long is_deleted) {
		this.is_deleted = is_deleted;
	}
	public Date getLast_login() {
		return last_login;
	}
	public void setLast_login(Date last_login) {
		this.last_login = last_login;
	}
	public Date getDate_joined() {
		return date_joined;
	}
	public void setDate_joined(Date date_joined) {
		this.date_joined = date_joined;
	}
	
	

}
