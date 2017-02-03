package com.fusemachine.inventory.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;


//import com.fusemachine.inventory.domain.User;
import com.fusemachine.inventory.domain.UserRole;

public interface UserRolesRepository  extends JpaRepository<UserRole, Long>{
	
	public UserRole findRoleByrole(String role);


}
