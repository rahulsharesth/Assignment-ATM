/**
 * 
 */
package com.bank.factory;

import com.bank.constant.ChannelType;
import com.bank.service.Authentication;
import com.bank.service.Banking;
import com.bank.service.atm.ATMAuthentication;
import com.bank.service.net.NetAuthentication;

/**
 * @author RSharest
 * 
 */
public class AuthenticationFactory extends AbstractServiceFactory {

	@Override
	public Banking getBankingService(ChannelType channel) {
		return null;
	}

	@Override
	public Authentication getAuthnticationService(ChannelType channel) {
		if (channel == null) {
			return null;
		}
		if (ChannelType.ATM.equals(channel)) {
			return new ATMAuthentication();

		} else if (ChannelType.NET.equals(channel)) {
			return new NetAuthentication();
		}

		return null;
	}

}
