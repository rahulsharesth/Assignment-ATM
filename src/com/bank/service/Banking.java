/**
 * 
 */
package com.bank.service;

import java.math.BigDecimal;

import com.bank.constant.TransactionStatus;
import com.bank.exception.InsufficientFundsException;

/**
 * @author RSharest
 * 
 */
public interface Banking {

	public TransactionStatus withdraw(Long accountNumber, BigDecimal amount) throws InsufficientFundsException;

	public TransactionStatus deposit(Long accountNumber, BigDecimal amount);

}
