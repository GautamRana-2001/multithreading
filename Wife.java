package com.jspider.multithreading.thread;

import com.qspider.multithreading.resource.Account;

public class Wife extends Thread {
	private Account account;
	
	public Wife(Account account) 
	{
		this.account=account;
	}
	public void run() {
		account.deposite(2000);
		account.withdraw(10000);
	}

}
