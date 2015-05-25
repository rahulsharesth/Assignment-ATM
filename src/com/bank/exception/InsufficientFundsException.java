/**
 * 
 */
package com.bank.exception;

/**
 * @author RSharest
 * 
 */
public class InsufficientFundsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private double amount;

	public InsufficientFundsException(double amount) {
		this.amount = amount;
	}

	public InsufficientFundsException() {
	}

	public double getAmount() {
		return amount;
	}

}
