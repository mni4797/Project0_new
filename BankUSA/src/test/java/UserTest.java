import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.UserDAO;
import dao.UserDAOImp;
import models.User;

public class UserTest {

UserDAO uDao = new UserDAOImp();

	
	@Test
	public void verifyAllUsersExists() {
		List<User> userList = uDao.selectAllUsers();
		assertNotNull(userList);
	}
	
	@Test
	public void verifyUserExists() {
		User user = new User("myTestUser", "testUserPassword", 'c');
		assertNotNull(user);
	}

}
