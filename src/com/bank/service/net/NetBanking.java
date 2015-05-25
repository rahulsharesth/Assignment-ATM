package com.bank.service.net;

import java.math.BigDecimal;

import com.bank.constant.TransactionStatus;
import com.bank.service.Banking;

public class NetBanking implements Banking {

	@Override
	public TransactionStatus withdraw(Long accountNumber, BigDecimal amount) {
		System.out.println(" CoreBanking - withdraw accountNumber "
				+ accountNumber);
		System.out.println(" CoreBanking - withdraw amount " + accountNumber);
		return null;
	}

	@Override
	public TransactionStatus deposit(Long accountNumber, BigDecimal amount) {
		System.out.println(" CoreBanking - deposit accountNumber "
				+ accountNumber);
		System.out.println(" CoreBanking - deposit amount " + accountNumber);
		return null;
	}

}