package com.doxbit.dataTransfer;

import com.google.gson.Gson;

public class Serializator {
	Gson gson = null;
	
	public Serializator(){
		gson = new Gson();
	}
	
	public String toSerialize(Object o) {
		String output = gson.toJson(o);
		return output;
	}
	
	public Object toDeserialize(String json, Object object) {
		return gson.fromJson(json, object.getClass());
	}
}
