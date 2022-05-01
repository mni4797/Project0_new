package dao;

import java.util.List;

import models.User;

public interface UserDAO {
	
	// SELECT
		public List<User> selectAllUsers();
		
		public User selectUserById(int id);
		public User selectUserByUsername(String username);
		public List<User> selectUsersByAccountId(int account_id);
		//Insert
		public User insertUser(User u);
		
		//update
		public void updateUser(User u);
		
		//delete
		public void deleteUser(User u);
		

}
