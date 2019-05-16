package com.doxbit.dataTransfer.dao;

import com.doxbit.dataTransfer.model.MigrationLogs;

import java.util.List;

public interface HubRepositoryCustom {
    List<MigrationLogs> findLogsByAuthor(String Author);
}
