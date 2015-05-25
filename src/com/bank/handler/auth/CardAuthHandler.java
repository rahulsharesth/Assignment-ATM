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
public class CardAuthHandler implements AuthHandler {

	Integer pin;
	ChannelType channel;
	Long cardNumber;

	public CardAuthHandler(ChannelType channel, Long cardNumber, Integer pin) {
		this.channel = channel;
		this.pin = pin;
		this.cardNumber = cardNumber;
	}

	@Override
	public AuthenticationStatus authenticateCustomer() {
		return FactoryProducer.getFactory(FactoryType.AUTHENTICATION)
				.getAuthnticationService(channel).validateCard(cardNumber, pin);
	}

}
