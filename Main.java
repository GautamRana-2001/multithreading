package com.jspider.multithreading.main;

import com.jspider.multithreading.thread.Husband;
import com.jspider.multithreading.thread.Wife;
import com.qspider.multithreading.resource.Account;

public class Main {
	public static void main(String[] args) {
		Account account = new Account(10000);
		Husband husband = new Husband(account);
		Wife wife = new Wife(account);
		
		husband.start();
		wife.start();
	}

}
