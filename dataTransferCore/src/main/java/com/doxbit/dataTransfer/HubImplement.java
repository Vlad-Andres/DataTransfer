package com.doxbit.dataTransfer;

import com.doxbit.dataTransfer.dao.IMigrationLogsDao;
import com.doxbit.dataTransfer.dao.MigrHubRepImplement;
//import com.doxbit.dataTransfer.dao.MigrationLogsImplement;

import com.doxbit.dataTransfer.interfaces.GeneralHub;
import com.doxbit.dataTransfer.model.MigrationLogs;
import com.doxbit.dataTransfer.service.MigrationLogService;
import org.springframework.beans.factory.annotation.Autowired;

public class HubImplement implements GeneralHub {



    @Autowired
    private MigrationLogService migrationLogService;

//    private IMigrationLogsDao MigrationLogsService;

//    private final MigrationHubReppository hubReppository;
//
//
//    HubImplement(MigrationHubReppository hubReppository){
//        this.hubReppository = hubReppository;
//    }

    //private MigrationLogsImplement hubReppository = new MigrationLogsImplement();

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

        migrationLogService.create(new MigrationLogs((long)1,"titletest","auth",null));

//        MigrationLogs m1 = new MigrationLogs();
//        m1.setAuthor("auth1");
//        m1.setLastMigrationDate(null);
//        m1.setTitle("title");

//        Iterable<MigrationLogs> all = hubReppository.findAll();
//
//        System.out.println("Migration log saved! - ");
//        for(MigrationLogs s : all){
//            //Do whatever you
//           System.out.println("DASDSA"+s.getAuthor().toString());
       // }
        return String.valueOf(docId);
    }

    public String commit(long docId) {
        return null;
    }
}
