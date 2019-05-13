package com.doxbit.dataTransfer;

import com.doxbit.dataTransfer.interfaces.GeneralHub;

public class HubImplement implements GeneralHub {
    public String config(String type) {
        return null;
    }

    public String register(long docId) {
        System.out.println("[HubImplement.java] Message from Implementation of Hub, curr doc ID = "+ docId);
        return String.valueOf(docId);
    }

    public String commit(long docId) {
        return null;
    }
}
