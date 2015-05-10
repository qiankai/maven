package cn.xydata.auth.model;

/**
 * @author doodlelook
 * @date 2015-05-10
 * @despriction: 用户角色表
 *
 */
public class UserGroupModel {
	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 用户id
	 */
	private Long userid;
	/**
	 * 组id
	 */
	private Long groupid;
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
	public Long getGroupid() {
		return groupid;
	}
	public void setGroupid(Long groupid) {
		this.groupid = groupid;
	}
	
	
	
	

}
