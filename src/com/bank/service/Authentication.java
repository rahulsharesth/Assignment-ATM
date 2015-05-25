/**
 * 
 */
package com.bank.service;

import com.bank.constant.AuthenticationStatus;

/**
 * @author RSharest
 * 
 */
public interface Authentication {

	public AuthenticationStatus validateAccount(Long account, Integer pin);

	public AuthenticationStatus validateCard(Long cardNumber, Integer pin);

}
