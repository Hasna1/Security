//package com.fusemachine.inventory.service.impl;
//
//import java.util.HashSet;
//import java.util.Set;
//
////import javax.management.relation.Role;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.fusemachine.inventory.domain.User;
//import com.fusemachine.inventory.domain.UserRole;
//import com.fusemachine.inventory.repository.UserRepository;
//
//@Service
//public class UserDetailsServiceImpl implements UserDetailsService{
//    @Autowired
//    private UserRepository userRepository;
//
//    @Override
//    @Transactional(readOnly = true)
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(username);
//
//        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
//        for (UserRole role : user.getRoles()){
//            grantedAuthorities.add(new SimpleGrantedAuthority(role.getName()));
//        }
//
//        return new org.springframework.security.core.userdetails.User(user.getUserName(), user.getPassword(), grantedAuthorities);
//    }
//}