package com.bank.factory;

import com.bank.constant.ChannelType;
import com.bank.service.Authentication;
import com.bank.service.Banking;

public abstract class AbstractServiceFactory {

	public abstract Banking getBankingService(ChannelType channel);

	public abstract Authentication getAuthnticationService(ChannelType channel);

}
