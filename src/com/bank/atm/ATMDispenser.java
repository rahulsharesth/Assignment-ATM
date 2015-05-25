/**
 * 
 */
package com.bank.atm;

import java.math.BigDecimal;

import com.bank.exception.InsufficientFundsException;

/**
 * @author RSharest
 * 
 */
public class ATMDispenser {

	private BigDecimal amount;

	private static ATMDispenser dispenser = new ATMDispenser();;

	private ATMDispenser() {

	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}

	public BigDecimal getAmount() {
		return this.amount;
	}

	public static synchronized ATMDispenser getInstance() {

		return dispenser;

	}

	public Boolean checkAvailability(BigDecimal amount) {
		Boolean available;
		try {
			if (amount.subtract(this.amount).doubleValue() <= 0) {
				this.amount.subtract(amount);
				available = true;
			} else
				throw new InsufficientFundsException();
		} catch (InsufficientFundsException e) {
			available = false;
		}
		return available;
	}

	public void dispense(BigDecimal amount) throws InsufficientFundsException {
		try {
			if (amount.subtract(this.amount).doubleValue() <= 0) {
				this.amount.subtract(amount);
			} else
				throw new InsufficientFundsException(amount.subtract(this.amount).doubleValue());
		} catch (InsufficientFundsException e) {
			throw e;
		}

	}

	public void dispenseRollback(BigDecimal amount) {

		this.amount.add(amount);

	}
}
