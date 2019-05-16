package com.doxbit.dataTransfer.dao;

import com.doxbit.dataTransfer.model.MigrationLogs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;

public interface MigrationHubReppository extends JpaRepository<MigrationLogs,Long> , HubRepositoryCustom, JpaSpecificationExecutor<MigrationLogs> {
    
    //public List<MigrationLogs> findByFullName(String title);
    //public MigrationLogs findById(long id);
    //List<DocToMigrate> findAllById(Iterable<Long> ids);

}