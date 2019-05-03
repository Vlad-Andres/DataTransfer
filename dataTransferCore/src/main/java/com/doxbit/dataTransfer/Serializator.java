package com.doxbit.dataTransfer;

import com.google.gson.Gson;

public class Serializator {
	Gson gson = null;
	
	public String toSerialize(Object o) {
		gson = new Gson();
		String output = gson.toJson(o);
		return output;
	}
}
