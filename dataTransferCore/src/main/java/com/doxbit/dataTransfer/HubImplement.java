package com.doxbit.dataTransfer;

import com.doxbit.dataTransfer.interfaces.GeneralHub;
import com.doxbit.dataTransfer.interfaces.Reader;

public class HubImplement implements GeneralHub {

//    private final MigrationHubReppository hubReppository;
//
//
//    HubImplement(MigrationHubReppository hubReppository){
//        this.hubReppository = hubReppository;
//    }

    public String config(String type) {
        return null;
    }

    public ReaderImpl createReader() {
        return new ReaderImpl();
    }

    public String register(long docId) {
        System.out.println("[HubImplement.java] Message from Implementation of Hub, curr doc ID = "+ docId);
        return String.valueOf(docId);
    }

    public String commit(long docId) {
        return null;
    }
}
