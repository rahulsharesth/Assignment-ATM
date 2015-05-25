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
public class DebitCard extends Card implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

	private BigDecimal perDayLimit;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public BigDecimal getPerDayLimit() {
		return perDayLimit;
	}

	public void setPerDayLimit(BigDecimal perDayLimit) {
		this.perDayLimit = perDayLimit;
	}

}
