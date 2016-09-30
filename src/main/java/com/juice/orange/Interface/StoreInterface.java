package com.juice.orange.Interface;

import com.juice.orange.Entity.Message;
import com.juice.orange.Entity.SkuEntity;
import com.juice.orange.Entity.StoreEntity;

public interface StoreInterface {
	public abstract Message computeStorePrice(StoreEntity storeEntity);
	
	public abstract Message computeSkuPrice(SkuEntity skuEntity);
}
