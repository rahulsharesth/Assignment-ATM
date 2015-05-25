package com.bank.handler.auth;

import com.bank.constant.AuthenticationStatus;

public class Context {
	private AuthHandler strategy;

	public Context(AuthHandler strategy) {
		this.strategy = strategy;
	}

	public AuthenticationStatus authenticateCustomer() {
		return strategy.authenticateCustomer();
	}
}