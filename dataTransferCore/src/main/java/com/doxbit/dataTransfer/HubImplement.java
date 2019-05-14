package com.doxbit.dataTransfer;

import com.doxbit.dataTransfer.interfaces.GeneralHub;
import com.doxbit.dataTransfer.interfaces.Reader;
import org.springframework.beans.factory.annotation.Autowired;

public class HubImplement implements GeneralHub {

//    private final MigrationHubReppository hubReppository;
//
//
//    HubImplement(MigrationHubReppository hubReppository){
//        this.hubReppository = hubReppository;
//    }

    private MigrationLogsImplement hubReppository = new MigrationLogsImplement();

//    @Autowired
//    public HubImplement(MigrationHubReppository hubReppository){
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
        System.out.println("Begining creation of Migration Log..");
        MigrationLogs m1 = new MigrationLogs();
        m1.setAuthor("auth1");
        m1.setLastMigrationDate(null);
        m1.setTitle("title");
        hubReppository.save(m1);
        Iterable<MigrationLogs> all = hubReppository.findAll();

        System.out.println("Migration log saved! - ");
//        for(MigrationLogs s : all){
//            //Do whatever you
//           System.out.println("DASDSA"+s.getAuthor().toString());
//        }
        return String.valueOf(docId);
    }

    public String commit(long docId) {
        return null;
    }
}
