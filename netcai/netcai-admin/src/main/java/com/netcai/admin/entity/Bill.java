package com.netcai.admin.entity;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 卖家账单实体类
 * 
 * @author administrator
 *
 */
public class Bill implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	/**
	 * 卖家id
	 */
	private Long sellerId;
	/**
	 * 今日应收款
	 */
	private BigDecimal expectIncome;
	/**
	 * 今日扣款
	 */
	private BigDecimal deductMoney;
	/**
	 * 今日实收款
	 */
	private BigDecimal realIncome;
	/**
	 * 账单周期时间
	 */
	private Date period;
	/**
	 * 账单交易状态，0为待结算，1为已结算
	 */
	private Integer status;
	/**
	 * 账单创建时间
	 */
	private Date createTime;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getSellerId() {
		return sellerId;
	}

	public void setSellerId(Long sellerId) {
		this.sellerId = sellerId;
	}

	public BigDecimal getExpectIncome() {
		return expectIncome;
	}

	public void setExpectIncome(BigDecimal expectIncome) {
		this.expectIncome = expectIncome;
	}

	public BigDecimal getDeductMoney() {
		return deductMoney;
	}

	public void setDeductMoney(BigDecimal deductMoney) {
		this.deductMoney = deductMoney;
	}

	public BigDecimal getRealIncome() {
		return realIncome;
	}

	public void setRealIncome(BigDecimal realIncome) {
		this.realIncome = realIncome;
	}

	public Date getPeriod() {
		return period;
	}

	public void setPeriod(Date period) {
		this.period = period;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

}
