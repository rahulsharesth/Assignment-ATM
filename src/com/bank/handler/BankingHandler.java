/**
 * 
 */
package com.bank.handler;

import java.math.BigDecimal;

import com.bank.atm.ATMDispenser;
import com.bank.constant.ChannelType;
import com.bank.constant.FactoryType;
import com.bank.constant.TransactionStatus;
import com.bank.exception.InsufficientFundsException;
import com.bank.factory.FactoryProducer;

/**
 * @author RSharest
 * 
 */
public class BankingHandler {

	Long accountNumber;
	BigDecimal amount;
	ChannelType channel;

	public BankingHandler(ChannelType channel, Long accountNumber,
			BigDecimal amount) {
		this.channel = channel;
		this.accountNumber = accountNumber;
		this.amount = amount;
	}

	public TransactionStatus withdrawRequest() {

		TransactionStatus status = TransactionStatus.FAILED;

		try {
			if (ATMDispenser.getInstance().checkAvailability(amount)) {
				ATMDispenser.getInstance().dispense(amount);
				status = FactoryProducer.getFactory(FactoryType.BANKING)
						.getBankingService(channel)
						.withdraw(accountNumber, amount);
				if (TransactionStatus.FAILED.equals(status)) {
					ATMDispenser.getInstance().dispenseRollback(amount);
				}

			}
		} catch (InsufficientFundsException e) {
			status = TransactionStatus.FAILED;
		}
		return status;

	}

	public TransactionStatus depositRequest() {
		return FactoryProducer.getFactory(FactoryType.BANKING)
				.getBankingService(channel).deposit(accountNumber, amount);
	}

}
