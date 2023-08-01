package com.rays.thread;

public class AccountRC {
	private int Balance= 0;
	public void setBalance(int Balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.Balance= Balance;
	}public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return Balance;
		
	}
	public synchronized void deposit(String name, int Amount) {
		int total = getBalance()+ Amount;
		setBalance(total);
	}
		
		}                   
