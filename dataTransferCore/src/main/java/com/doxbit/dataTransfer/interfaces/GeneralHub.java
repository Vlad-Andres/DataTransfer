package com.doxbit.dataTransfer.interfaces;

import com.doxbit.dataTransfer.ReaderImpl;

public interface GeneralHub {
	public String config(String type);
	public String register(long docId);
	public String commit(long docId);
	public ReaderImpl createReader();
	//public void addBacklog(Backlog b);

}
