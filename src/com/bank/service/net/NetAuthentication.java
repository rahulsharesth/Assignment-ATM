/**
 * 
 */
package com.bank.service.net;

import com.bank.constant.AuthenticationStatus;
import com.bank.service.Authentication;

/**
 * @author RSharest
 * 
 */
public class NetAuthentication implements Authentication {

	@Override
	public AuthenticationStatus validateAccount(Long account, Integer pin) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AuthenticationStatus validateCard(Long cardNumber, Integer pin) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
