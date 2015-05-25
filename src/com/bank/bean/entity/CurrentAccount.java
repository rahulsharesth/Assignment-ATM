package com.bank.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import com.bank.constant.AccountType;
import com.bank.constant.Currency;

/**
 * @author RSharest
 * 
 */
public class CurrentAccount extends Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CurrentAccount() {
		this.setType(AccountType.CURRENT);
	}

	private Integer id;

	private BigDecimal creditLimit;

	private Boolean leanMarked;

	private Currency currency;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Currency getCurrency() {
		return currency;
	}

	public void setCurrency(Currency currency) {
		this.currency = currency;
	}

	public BigDecimal getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(BigDecimal creditLimit) {
		this.creditLimit = creditLimit;
	}

	public Boolean getLeanMarked() {
		return leanMarked;
	}

	public void setLeanMarked(Boolean leanMarked) {
		this.leanMarked = leanMarked;
	}

}
