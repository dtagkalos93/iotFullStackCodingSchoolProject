package com.codingschool.redIotProject.Services;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.codingschool.redIotProject.Entities.User;

import com.codingschool.redIotProject.Services.UserService;

@Service("userDetailsServiceImpl")
public class UserDetailsServiceImpl implements UserDetailsService{
	
	    @Autowired
	    private UserService userService;

	    @Override
	    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
	        User user = userService.findByUsername(username);
	        if(user == null){
	            throw new UsernameNotFoundException("User not authorized.");
	        }
	        Set<GrantedAuthority> grantedAuthorities = new HashSet<>();
	        if(user!=null) {
	        	grantedAuthorities.add(new SimpleGrantedAuthority(user.getRole().toString()));
	        	System.out.println(">>USERNAME"+user.getUsername());
	        	System.out.println(">>PASS"+user.getPassword());
	        }
	        return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), grantedAuthorities);
	    }
}
