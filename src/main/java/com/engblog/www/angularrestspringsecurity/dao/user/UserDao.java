package com.engblog.www.angularrestspringsecurity.dao.user;

import com.engblog.www.angularrestspringsecurity.dao.Dao;
import com.engblog.www.angularrestspringsecurity.entity.User;

import org.springframework.security.core.userdetails.UserDetailsService;


public interface UserDao extends Dao<User, Long>, UserDetailsService
{

	User findByName(String name);

}