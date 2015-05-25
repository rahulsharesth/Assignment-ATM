/**
 * 
 */
package com.bank.bean.entity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * @author RSharest
 * 
 */
public class CreditCard extends Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigDecimal limit;

	private Integer pin;

	public Integer getPin() {
		return pin;
	}

	public void setPin(Integer pin) {
		this.pin = pin;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getLimit() {
		return limit;
	}

	public void setLimit(BigDecimal limit) {
		this.limit = limit;
	}

}
