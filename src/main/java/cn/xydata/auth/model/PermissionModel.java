package cn.xydata.auth.model;

/**
 * @author doodlelook
 * @date 2015-05-10
 * @company xydata
 *
 */
public class PermissionModel {
	
	/**
	 * 主键
	 */
	private Long id;
	/**
	 * 用于权限对比
	 */
	private String name;
	/**
	 * 权限内容
	 */
	private Long contant_type;
	/**
	 * 权限显示名称
	 */
	private String codename;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getContant_type() {
		return contant_type;
	}
	public void setContant_type(Long contant_type) {
		this.contant_type = contant_type;
	}
	public String getCodename() {
		return codename;
	}
	public void setCodename(String codename) {
		this.codename = codename;
	}
	
	

}
