package com.doxbit.dataTransfer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface MigrationHubReppository extends CrudRepository<MigrationLogs, Long>{
    
    //public List<MigrationLogs> findByFullName(String title);
    //public MigrationLogs findById(long id);
    //List<DocToMigrate> findAllById(Iterable<Long> ids);

}