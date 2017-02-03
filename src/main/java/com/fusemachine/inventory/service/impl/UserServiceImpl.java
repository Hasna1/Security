//package com.fusemachine.inventory.service.impl;
//
//import java.util.HashSet;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//
//import com.fusemachine.inventory.domain.User;
//import com.fusemachine.inventory.repository.UserRepository;
//import com.fusemachine.inventory.repository.UserRolesRepository;
//import com.fusemachine.inventory.service.UserService;
//
//public class UserServiceImpl implements UserService {
//	
//	   @Autowired
//	    private UserRepository userRepository;
//	    @Autowired
//	    private UserRolesRepository userrolesRepository;
//	    @Autowired
//	    private BCryptPasswordEncoder bCryptPasswordEncoder;
//
//	@Override
//	public void save(User user) {
//		// TODO Auto-generated method stub
//		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
//        user.setRoles(new HashSet<>(userrolesRepository.findAll()));
//        userRepository.save(user);
//		
//	}
//
//	@Override
//	public User findByUsername(String username) {
//		// TODO Auto-generated method stub
//		return userRepository.findByUserName(username);
//	}
//
//}
