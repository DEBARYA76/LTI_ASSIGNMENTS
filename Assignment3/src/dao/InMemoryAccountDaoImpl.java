package dao;

import java.util.ArrayList;
import java.util.List;

import atm.Account;

public class InMemoryAccountDaoImpl implements AccountDao {

	List<Account> accounts = new ArrayList<Account>();
	@Override
	public String addAnAccount(Account account) {
		boolean val =accounts.add(account);
		if(val)
		{
			return "insertion succesful";
		}
		else {
			return "Error occured while insertion. ";
		}
		
	}

	@Override
	public void withdraw(int accountNumber, double amount) {
		// TODO Auto-generated method stub
		Account acc = accounts.stream().filter(ac->ac.getAccountNo()==accountNumber && ac.getAccountBalance()== amount).findFirst().orElse(null);
		double wd = acc.getAccountBalance()- amount; 
		acc.setAccountBalance(wd);
		System.out.println("Withdrawed Money Successfully Current Balance:"+wd);
	}

	@Override
	public Double checkBalance(int accountNumber) {
		Account ac = getAccountDetails1(accountNumber);
		return ac.getAccountBalance();
	}

	@Override
	public void changePassword(int accountNumber, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		Account ac = getAccountDetails1(accountNumber);
		ac.setAccountPassword(newPassword);
		System.out.println("Password Changed Successfully");

	}

	@Override
	public List<Account> viewAllAccounts() {
		// TODO Auto-generated method stub
		return ((Object) accounts.stream()).toList();
	}

	public Account getAccountDetails1(int accountNumber) {
		// TODO Auto-generated method stub
		return accounts.stream().filter(ac -> ac.getAccountNo() == accountNumber ).findFirst().orElse(null);
	}

	public String addAnAccount(AccountDao account) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Account getAccountDetails(int accountNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String addAnAccount1(Account account) {
		// TODO Auto-generated method stub
		return null;
	}

}
