package com.juice.orange.Entity;

import java.util.List;

public class StoreEntity {
	private Long storeId;
	private String storeName;
	private String location;
	private List<SkuEntity> skuEntities;
	private int storeTotalPrice;
	public List<SkuEntity> getSkuEntities() {
		return skuEntities;
	}
	public void setSkuEntities(List<SkuEntity> skuEntities) {
		this.skuEntities = skuEntities;
	}
	public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public String getStoreName() {
		return storeName;
	}
	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStoreTotalPrice() {
		return storeTotalPrice;
	}
	public void setStoreTotalPrice(int storeTotalPrice) {
		this.storeTotalPrice = storeTotalPrice;
	}
	
}
