package cn.xydata.auth.model;

/**
 * @author doodlelook
 * @date 2015-05-10
 *
 */
public class UserPermissionModel {
	
	/**
	 * ����
	 */
	private Long id;
	/**
	 * �û�ID
	 */
	private Long userid;
	/**
	 * Ȩ��ID
	 */
	private Long permissionid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	public Long getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(Long permissionid) {
		this.permissionid = permissionid;
	}
	
	

}
