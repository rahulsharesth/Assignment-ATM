/**
 * 
 */
package com.bank.bean.entity;

import java.io.Serializable;

import com.bank.constant.CardState;
import com.bank.constant.CardType;
import com.bank.constant.Provider;

/**
 * @author RSharest
 * 
 */
public abstract class Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private Long cardnumber;

	private Long chipNumber;

	private CardState state;

	private Provider provider;

	private CardType type;

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	}

	public CardType getType() {
		return type;
	}

	public void setType(CardType type) {
		this.type = type;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Long getCardnumber() {
		return cardnumber;
	}

	public void setCardnumber(Long cardnumber) {
		this.cardnumber = cardnumber;
	}

	public Long getChipNumber() {
		return chipNumber;
	}

	public void setChipNumber(Long chipNumber) {
		this.chipNumber = chipNumber;
	}

	public CardState getState() {
		return state;
	}

	public void setState(CardState state) {
		this.state = state;
	}

}
