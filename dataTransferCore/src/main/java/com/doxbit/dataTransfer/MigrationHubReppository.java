package com.doxbit.dataTransfer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface MigrationHubReppository extends JpaRepository<MigrationLogs, Long> {

    //List<DocToMigrate> findAllById(Iterable<Long> ids);

}