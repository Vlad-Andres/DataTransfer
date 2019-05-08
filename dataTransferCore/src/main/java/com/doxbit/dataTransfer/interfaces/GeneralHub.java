package com.doxbit.dataTransfer.interfaces;

public interface GeneralHub {
	public String config(String type);
	public String register(String type);
	public String commit(Long docId);
	//public void addBacklog(Backlog b);

}
