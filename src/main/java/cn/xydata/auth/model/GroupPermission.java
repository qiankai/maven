package cn.xydata.auth.model;

/**
 * @author doodlelook
 * @date 2015-05-10
 *
 */
public class GroupPermission {
	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 组ID
	 */
	private Long groupid;
	/**
	 * 权限ID
	 */
	private Long permissionid;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getGroupid() {
		return groupid;
	}
	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}
	public Long getPermissionid() {
		return permissionid;
	}
	public void setPermissionid(Long permissionid) {
		this.permissionid = permissionid;
	}
	
	

}
