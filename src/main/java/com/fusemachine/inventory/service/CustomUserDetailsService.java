//package com.fusemachine.inventory.service;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//
//import com.fusemachine.inventory.domain.User;
//import com.fusemachine.inventory.repository.UserRepository;
//import com.fusemachine.inventory.repository.UserRolesRepository;
//
//
//@Service
//public class CustomUserDetailsService  implements UserDetailsService{
//	
//	private final UserRepository userRepository;
//	private final UserRolesRepository userRolesRepository;
//	
//	@Autowired
// public CustomUserDetailsService(UserRepository userRepository,UserRolesRepository userRolesRepository) {
//		// TODO Auto-generated constructor stub
//		this.userRepository=userRepository;
//		this.userRolesRepository=userRolesRepository;
//	}
//
//	@Override
//	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		// TODO Auto-generated method stub
//		
//		User user = userRepository.findByUserName(username);
//		if(null == user){
//			throw new UsernameNotFoundException("No user present with username:" +username);
//		}
//		else{
//			
//			List<String> userRoles=userRolesRepository.findRoleByUserName(username);
//		}
//			
//		}
//		return null;
//	}
//
//}
