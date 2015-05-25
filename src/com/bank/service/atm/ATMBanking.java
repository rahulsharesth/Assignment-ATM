/**
 * 
 */
package com.bank.service.atm;

import java.math.BigDecimal;

import com.bank.constant.TransactionStatus;
import com.bank.exception.InsufficientFundsException;
import com.bank.service.Banking;

/**
 * @author RSharest
 * 
 */
public class ATMBanking implements Banking {

	@Override
	public TransactionStatus withdraw(Long accountNumber, BigDecimal amount)
			throws InsufficientFundsException {
		TransactionStatus status = TransactionStatus.FAILED;
		try {
			// TODO: Withdraw Logic from backend
			System.out.println("ATMBanking - withdraw - account no is "
					+ accountNumber + " amount is " + amount);
			status = TransactionStatus.SUCCEED;
		} finally {

		}
		return status;
	}

	@Override
	public TransactionStatus deposit(Long accountNumber, BigDecimal amount) {
		TransactionStatus status = TransactionStatus.FAILED;
		try {
			// TODO: Deposit Logic from backend
			System.out.println("ATMBanking - deposit - account no is "
					+ accountNumber + " amount is " + amount);
			status = TransactionStatus.SUCCEED;
		} finally {

		}
		return status;
	}

}
