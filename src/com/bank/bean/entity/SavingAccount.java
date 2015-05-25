package com.bank.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.bank.constant.AccountType;
import com.bank.constant.Currency;

/**
 * @author RSharest
 * 
 */
public class SavingAccount extends Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public SavingAccount() {
		this.setType(AccountType.SAVING);
	}

	private Integer id;

	private BigDecimal ledgerBalance;

	private Currency currency;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLedgerBalance() {
		return ledgerBalance;
	}

	public void setLedgerBalance(BigDecimal ledgerBalance) {
		this.ledgerBalance = ledgerBalance;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

}
