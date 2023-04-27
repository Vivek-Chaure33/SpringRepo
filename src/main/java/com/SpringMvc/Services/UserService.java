package com.SpringMvc.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringMvc.Model.User;
import com.SpringMvc.UserDao.UserDao;

@Service
public class UserService {
	@Autowired
	UserDao userDao; 
	public int createUser(User user) {
		return this.userDao.saveUser(user); 
	}
}
