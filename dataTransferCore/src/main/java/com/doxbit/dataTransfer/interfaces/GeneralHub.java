package com.doxbit.dataTransfer.interfaces;

public interface GeneralHub {

	public String config(String type);
	public void register(long docId);
	public String commit(Long docId);
	//public void addBacklog(Backlog b);

}
