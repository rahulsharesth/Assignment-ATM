/**
 * 
 */
package com.bank.service.atm;

import com.bank.constant.AuthenticationStatus;
import com.bank.service.Authentication;

/**
 * @author RSharest
 * 
 */
public class ATMAuthentication implements Authentication {

	@Override
	public AuthenticationStatus validateAccount(Long account, Integer pin) {
		AuthenticationStatus status = AuthenticationStatus.FAILED;
		try {
			// TODO: Validation Logic
			System.out
					.println("ATMAuthentication - validateAccount - account no is "
							+ account + " pin is " + pin);
			status = AuthenticationStatus.SUCCESSFULL;
		} finally {

		}
		return status;
	}

	@Override
	public AuthenticationStatus validateCard(Long cardNumber, Integer pin) {
		AuthenticationStatus status = AuthenticationStatus.FAILED;
		try {
			// TODO: Validation Logic
			System.out
					.println("ATMAuthentication - validateCard - cardNumber no is "
							+ cardNumber + " pin is " + pin);
			status = AuthenticationStatus.SUCCESSFULL;
		} finally {

		}
		return status;
	}

}
