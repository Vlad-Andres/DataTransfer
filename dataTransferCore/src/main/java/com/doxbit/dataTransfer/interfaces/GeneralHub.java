package com.doxbit.dataTransfer.interfaces;

public interface GeneralHub {
	public String config(String type);
	public String register(long docId);
	public String commit(long docId);
	//public void addBacklog(Backlog b);

}
