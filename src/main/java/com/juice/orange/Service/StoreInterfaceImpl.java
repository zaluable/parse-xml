package com.juice.orange.Service;



import java.util.List;

import com.juice.orange.Entity.Message;
import com.juice.orange.Entity.Result;
import com.juice.orange.Entity.SkuEntity;
import com.juice.orange.Entity.StoreEntity;
import com.juice.orange.Interface.StoreInterface;

public class StoreInterfaceImpl implements StoreInterface{

	@Override
	public Message computeStorePrice(StoreEntity storeEntity) {
		List<SkuEntity> skuEntities = storeEntity.getSkuEntities();
		int totalPri = 0;
		for (SkuEntity skuEntity : skuEntities){
			totalPri += (skuEntity.getSkuPrice() * skuEntity.getSkuNum());
		}
		storeEntity.setStoreTotalPrice(totalPri);
		Message msg = new Message();
		Result result = new Result();
		result.setStoreEntity(storeEntity);
		msg.setFlag("sucess");
		msg.setReson("");
		msg.setResult(result);
		return msg;
	}

	@Override
	public Message computeSkuPrice(SkuEntity skuEntity) {
		return null;
	}
	
}
