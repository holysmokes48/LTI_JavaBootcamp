package com;

import exception.AccountCreationException;
import exception.AccountNotFoundException;
import exception.AccountTransactionException;
import exception.CustomException;
import exception.InsufficientBalanceException;
import exception.InvalidAmountException;

public class AccountDaoImpl implements AccountDao {

	static float totalAmount[][]=new float[10][10];
	public void deposit(int accNo, float amt) throws InvalidAmountException, AccountNotFoundException {
		//System.out.println("amount saved for "+accNo);
		boolean found = false;
		
		if(amt <= 0)
			throw new InvalidAmountException("Depositing amount should be greater than Zero");
		for(int i=0; i< totalAmount.length; i++)
		{	
			if(totalAmount[i][0]==accNo)
			{
				totalAmount[i][1] +=amt;
				System.out.println("Amount saved for "+accNo);
				found = true;
				break;
			}
			else if(totalAmount[i][0]==0)
			{
				throw new AccountNotFoundException("Account does not exist");
			}
		}
		if(!found) {
			throw new AccountNotFoundException("Account does not exist");
		}
		else {
			System.out.println("amount saved for "+accNo);
		}
	}

	public float withdraw(int accNo, float amt) throws InvalidAmountException, InsufficientBalanceException, AccountNotFoundException{
		if(amt <=0)
			throw new InvalidAmountException("Withdrawing amount should be greater than Zero");
		
		boolean found = false;
		
		for(int i=0; i< totalAmount.length; i++)
		{	
			if(totalAmount[i][0]==accNo) {
				if(totalAmount[i][1] - amt < 0)
					throw new InsufficientBalanceException("Insufficient Balance to Withdraw");
				if(amt <= totalAmount[i][1])
					totalAmount[i][1] -=amt;
					found = true;
					break;
			}
			else if(totalAmount[i][0] == 0) {
				throw new AccountNotFoundException("Account not found");
			}
		}
		if(!found) {
			throw new AccountNotFoundException("Account does not exist");
		}
		else {
			System.out.println(amt+" amount withdrawn from acount No :"+accNo);
		}
		return amt;
	}

	public float balanceEnquiry(int accNo) throws AccountNotFoundException {
		float result=0;
		boolean found = false;
		for(int i=0; i< totalAmount.length; i++)
		{	
			if(totalAmount[i][0]==accNo)
			{
				result= totalAmount[i][1];
				found = true;
				break;
			}
			else if(totalAmount[i][0] == 0) {
				throw new AccountNotFoundException("Account does not exist");
			}
		}
		if(!found) {
			throw new AccountNotFoundException("Account does not exist");
		}
		return result;
	}

	public void createAccount(int accNo, float amt, String name) throws AccountCreationException{
		if(accNo <= 0) {
			throw new AccountCreationException("Please input a valid account number");
		}
		if(amt < 0) {
			throw new AccountCreationException("Please input a valid initial balance");
		}

		boolean found = false;
		for(int i=0; i< totalAmount.length; i++)
		{
			if(totalAmount[i][0] == accNo) {
				throw new AccountCreationException("Account already exists");
			}
			else if(totalAmount[i][0]==0)
			{
				totalAmount[i][0]=accNo;
				totalAmount[i][1]=amt;
				found = true;
				break;
			}
		}
		
		if(!found) {
			throw new AccountCreationException("Sorry, database is full, cannot create new account");
		}
		else {
			System.out.println("account created successfully");
		}
	}
	
	public void  fundTransfer(int fromAccNo, int toAccNo, float amt) throws AccountTransactionException
	{
		boolean transfer = false;
		if(fromAccNo < 0 || toAccNo < 0) {
			throw new AccountTransactionException("Please input valid account numbers");
		}
		
		if(fromAccNo == toAccNo) {
			throw new AccountTransactionException("Error: cannot transfer funds to the same account");
		}
		
		for(int i=0; i< totalAmount.length; i++)
		{
			if(totalAmount[i][0]== fromAccNo)
			{
				for(int j=0; j< totalAmount.length; j++)
				{
					if(totalAmount[j][0]== toAccNo)
					{
						if(amt <= 0)
							throw new AccountTransactionException("Transfer Amount should be greater than Zero");
							
						if(totalAmount[i][1] - amt < 0)
							throw new AccountTransactionException("Insufficient Balance to Withdraw from Source Account No.");
						totalAmount[i][1] -=amt;
						totalAmount[j][1] +=amt;
						transfer = true;
						System.out.println("Successfully transfered");
						break;
					}
				}
			}
		}
		if(!transfer) {
			throw new AccountTransactionException("Please enter valid account numbers");
		}
	}
	
	
}
