import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;

import dao.AccountDAO;
import dao.AccountDAOImp;
import models.Account;

public class AccountTest {

AccountDAO aDao = new AccountDAOImp();
	
	@Test
	public void verifyAccountExists() {
		Account account = new Account(50000.00);
		assertNotNull(account);
	}
	@Test
	public void verifyAccountPending() {	
		List<Account> pendingAccounts = aDao.selectAllPendingAccounts();
		assertNotNull(pendingAccounts);
	}
	@Test
	public void verifyAccountApproved() {
		List<Account> approvedAccounts = aDao.selectAllApprovedAccounts();
		assertNotNull(approvedAccounts);
	}
	@Test
	public void verifyAccountDenied() {
		List<Account> approvedAccounts = aDao.selectAllDeniedAccounts();
		assertNotNull(approvedAccounts);
	}

}
