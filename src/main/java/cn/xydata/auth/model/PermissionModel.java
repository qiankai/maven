package cn.xydata.auth.model;

/**
 * @author doodlelook
 * @date 2015-05-10
 * @company xydata
 *
 */
public class PermissionModel {
	
	/**
	 * ����
	 */
	private Long id;
	/**
	 * ����Ȩ�޶Ա�
	 */
	private String name;
	/**
	 * Ȩ������
	 */
	private Long contant_type;
	/**
	 * Ȩ����ʾ����
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
