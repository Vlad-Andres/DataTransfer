package com.doxbit.dataTransfer;

import com.doxbit.dataTransfer.interfaces.GeneralHub;

public class HubInstance implements GeneralHub {
    public String config(String type) {
        return null;
    }

    public void register(long docId) {
        System.out.println("Testing register method from hub to DB, DOC ID="+docId);
        //
    }

    public String commit(Long docId) {
        return null;
    }
}
