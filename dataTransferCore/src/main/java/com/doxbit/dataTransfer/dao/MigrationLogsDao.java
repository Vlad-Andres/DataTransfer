package com.doxbit.dataTransfer.dao;

import com.doxbit.dataTransfer.model.MigrationLogs;
import org.springframework.stereotype.Repository;

@Repository
public class MigrationLogsDao extends AbstractJpaDao<MigrationLogs> implements IMigrationLogsDao {
    public MigrationLogsDao(){
        super();
        setClazz(MigrationLogs.class);
    }
}
