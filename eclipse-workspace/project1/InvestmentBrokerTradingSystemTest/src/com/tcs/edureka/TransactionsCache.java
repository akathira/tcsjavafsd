package com.tcs.edureka;

import java.util.ArrayList;
import java.util.Iterator;

import com.tcs.edureka.Investor;
import com.tcs.edureka.Transactions;

public class TransactionsCache {

	ArrayList<Transactions> transactions = new ArrayList();

	public static void main(String[] args) {

		Transactions t1 = new Transactions(101, "01-jan-24", 1000, 1);
		Transactions t2 = new Transactions(102, "02-jan-24", 2000, 2);
		Transactions t3 = new Transactions(103, "03-jan-24", 3000, 5);
		Transactions t4 = new Transactions(104, "04-jan-24", 4000, 4);
		Transactions t5 = new Transactions(105, "05-jan-24", 5000, 5);

		System.out.println("Need to store transactions for the following transactionId: 101, 102, 103, 104, 105 ");
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		System.out.println(t4);
		System.out.println(t5);

		ArrayList<Investor> list = getInvestorList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Investor created for" + list.get(i));
		}
		TransactionsCache transactionsCache = new TransactionsCache();
		transactionsCache.addTransaction(t1);
		transactionsCache.addTransaction(t2);
		transactionsCache.addTransaction(t3);
		transactionsCache.addTransaction(t4);
		transactionsCache.addTransaction(t5);

		transactionsCache.showAllTransactions();

	}

	private boolean validateInvestorId(ArrayList<Investor> investorsList, Transactions t) {

		boolean res = false;
		for (int i = 0; i < investorsList.size(); i++) {
			if (t.getInvesterId() == investorsList.get(i).getId()) {
				System.out.println("Transaction created for transactionId: " + t.getTransactionId());
				res = true;
			}
		}
		return res;

	}

	public boolean addTransaction(Transactions t) {
		boolean flag = false;
		ArrayList<Investor> investorList = getInvestorList();
		boolean setflag = validateInvestorId(investorList, t);
		if (setflag) {
			transactions.add(t);
		}
		return flag;

	}

	private static ArrayList<Investor> getInvestorList() {
		ArrayList<Investor> investorsList = new ArrayList();

		Investor i1 = new Investor(1, "xxx", "chennai", 10000);
		Investor i2 = new Investor(2, "yyyc", "hyd", 20000);
		Investor i4 = new Investor(4, "aaa", "delhi", 40000);

		investorsList.add(i1);
		investorsList.add(i2);
		investorsList.add(i4);

		return investorsList;

	}

	public void showAllTransactions() {

		Iterator<Transactions> iter = transactions.iterator();
		while (iter.hasNext()) {
			Transactions t = iter.next();
			System.out.println(t);
		}

	}

}
