package com.juice.orange.Entity;

public class SkuEntity {
	private Long skuid;
	private String skuName;
	private Long skuPrice;
	private int skuNum;
	private int skuTotalPrice;
	public Long getSkuid() {
		return skuid;
	}
	public void setSkuid(Long skuid) {
		this.skuid = skuid;
	}
	public String getSkuName() {
		return skuName;
	}
	public void setSkuName(String skuName) {
		this.skuName = skuName;
	}
	public Long getSkuPrice() {
		return skuPrice;
	}
	public void setSkuPrice(Long skuPrice) {
		this.skuPrice = skuPrice;
	}
	public int getSkuNum() {
		return skuNum;
	}
	public void setSkuNum(int skuNum) {
		this.skuNum = skuNum;
	}
	public int getSkuTotalPrice() {
		return skuTotalPrice;
	}
	public void setSkuTotalPrice(int skuTotalPrice) {
		this.skuTotalPrice = skuTotalPrice;
	}
}
