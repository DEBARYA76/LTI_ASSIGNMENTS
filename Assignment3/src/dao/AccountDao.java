package dao;

import java.util.List;

import atm.Account;

public interface AccountDao {
	String addAnAccount1(Account account);

	void withdraw(int accountNumber, double amount);

	Double checkBalance(int accountNumber);

	void changePassword(int accountNumber, String oldPassword, String newPassword);

	List<Account> viewAllAccounts();

	Account getAccountDetails(int accountNumber);

	String addAnAccount(Account account);
}
