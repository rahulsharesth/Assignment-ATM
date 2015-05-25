package com.bank.bean.entity;

import java.io.Serializable;

import com.bank.constant.AccountState;
import com.bank.constant.AccountType;

/**
 * @author RSharest
 * 
 */
public abstract class Account implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Long acctNumber;

	private AccountState state;

	private AccountType type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getNumber() {
		return acctNumber;
	}

	public void setNumber(Long acctNumber) {
		this.acctNumber = acctNumber;
	}

	public AccountState getState() {
		return state;
	}

	public void setState(AccountState state) {
		this.state = state;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}

}
