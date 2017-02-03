package com.fusemachine.inventory.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_roles")
public class UserRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userRoleId;
	private Long userid;
	private String role;
	
	public UserRole() {
		super();
	}
	
	public UserRole(Long userRoleId, Long userid, String role) {
		super();
		this.userRoleId = userRoleId;
		this.userid = userid;
		this.role = role;
	}
	
	@NotNull
	@Column(name = "user_role_id")
	public Long getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(Long userRoleId) {
		this.userRoleId = userRoleId;
	}
	
	@NotNull
	@Column(name = "userid")
	public Long getUserid() {
		return userid;
	}
	public void setUserid(Long userid) {
		this.userid = userid;
	}
	
	@NotNull
	@Column(name = "role")
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	

}
