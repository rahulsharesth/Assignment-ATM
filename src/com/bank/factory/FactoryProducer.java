/**
 * 
 */
package com.bank.factory;

import com.bank.constant.FactoryType;

/**
 * @author RSharest
 * 
 */
public class FactoryProducer {
	public static AbstractServiceFactory getFactory(FactoryType fType) {

		if (FactoryType.BANKING.equals(fType)) {
			return new BankingFactory();

		} else if (FactoryType.AUTHENTICATION.equals(fType)) {
			return new AuthenticationFactory();
		}

		return null;
	}

}
