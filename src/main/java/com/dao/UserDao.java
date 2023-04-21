package com.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.bean.UserBean;

@Repository
public class UserDao {
	
	@Autowired
	JdbcTemplate stmt;
	
		public void addUser(UserBean user) {
			
			String insertUser = "insert into users(firstName,lastName,email,password,gender) values(?,?,?,?,?)";
			
			stmt.update(insertUser,user.getFirstName(),user.getLastName(),user.getEmail(),user.getPassword(),user.getGender());

		}

}
