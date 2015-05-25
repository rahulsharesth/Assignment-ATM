/**
 * 
 */
package com.bank.factory;

import com.bank.constant.ChannelType;
import com.bank.service.Authentication;
import com.bank.service.Banking;
import com.bank.service.atm.ATMBanking;
import com.bank.service.net.NetBanking;

/**
 * @author RSharest
 * 
 */
public class BankingFactory extends AbstractServiceFactory {

	@Override
	public Banking getBankingService(ChannelType channel) {

		if (channel == null) {
			return null;
		}
		if (ChannelType.ATM.equals(channel)) {
			return new ATMBanking();

		} else if (ChannelType.NET.equals(channel)) {
			return new NetBanking();
		}

		return null;

	}

	@Override
	public Authentication getAuthnticationService(ChannelType channel) {
		return null;
	}

}
