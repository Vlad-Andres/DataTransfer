package com.doxbit.dataTransfer.dao;

import com.doxbit.dataTransfer.model.MigrationLogs;

import java.util.List;

public interface IMigrationLogsDao {
    MigrationLogs findOne(long id);

    List<MigrationLogs> findAll();

    void create(MigrationLogs entity);

    MigrationLogs update(MigrationLogs entity);

    void delete(MigrationLogs entity);

    void deleteById(long entityId);
}
