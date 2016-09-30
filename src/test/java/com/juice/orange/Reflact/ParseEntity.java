package com.juice.orange.Reflact;

import java.lang.reflect.Method;

public class ParseEntity {
	Class<?> clazz;
	public void parseField(String className){
		try {
			clazz = Class.forName(className);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Method[] methods = clazz.getMethods();
		
	}

}
