package com;

import exception.AccountCreationException;
import exception.AccountNotFoundException;
import exception.AccountTransactionException;
import exception.CustomException;
import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

public interface AccountDao {
	public void deposit(int accNo, float amt) throws InvalidAmountException, AccountNotFoundException;
	public float withdraw(int accNo, float amt)throws InvalidAmountException, InsufficientBalanceException, AccountNotFoundException;
	public float balanceEnquiry(int accNo)throws AccountNotFoundException;

	public void createAccount(int accNo, float amt, String name)throws AccountCreationException;
	public void  fundTransfer(int fromAccNo, int toAccNo, float amt) throws AccountTransactionException;
	
}
