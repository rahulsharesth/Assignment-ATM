/**
 * 
 */
package com.bank.handler.auth;

import com.bank.constant.AuthenticationStatus;
import com.bank.constant.ChannelType;
import com.bank.constant.FactoryType;
import com.bank.factory.FactoryProducer;

/**
 * @author RSharest
 * 
 */
public class AccountAuthHandler implements AuthHandler {

	Integer pin;
	ChannelType channel;
	Long account;

	public AccountAuthHandler(ChannelType channel, Long account, Integer pin) {
		this.channel = channel;
		this.pin = pin;
		this.account = account;
	}

	@Override
	public AuthenticationStatus authenticateCustomer() {
		return FactoryProducer.getFactory(FactoryType.AUTHENTICATION)
				.getAuthnticationService(channel).validateAccount(account, pin);
	}

}
