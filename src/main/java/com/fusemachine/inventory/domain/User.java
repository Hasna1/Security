package com.fusemachine.inventory.domain;

import java.util.Set;

//import javax.management.relation.Role;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "users")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long userId;
	private String userName;
	private String password;
	

	
	private int enabled;
	public User() {
		super();
	}
	
	
	


	public User(Long userId, String userName, String password,
			Set<UserRole> roles, int enabled) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		//this.roles = roles;
		this.enabled = enabled;
	}





	@Column(name = "userid")
	public Long getUserId() {
		return userId;
	}


	public void setUserId(Long userId) {
		this.userId = userId;
	}

	@NotNull
	@Column(name = "username")
	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}

	@NotNull
	@Column(name = "password")
	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	@NotNull
	@Column(name = "enabled")
	public int getEnabled() {
		return enabled;
	}


	public void setEnabled(int enabled) {
		this.enabled = enabled;
	}


//	@ManyToMany
//    @JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "userid"), inverseJoinColumns = @JoinColumn(name = "user_role_id"))
//    public Set<UserRole> getRoles() {
//        return roles;
//    }
//
//    public void setRoles(Set<UserRole> roles) {
//        this.roles = roles;
//    }
	

}
