package com.doxbit.dataTransfer.service;

import com.doxbit.dataTransfer.dao.IMigrationLogsDao;
import com.doxbit.dataTransfer.model.MigrationLogs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class MigrationLogService {
    @Autowired
    private IMigrationLogsDao dao;

    public MigrationLogService() {
        super();
    }

    // API

    public void create(final MigrationLogs entity) {
        dao.create(entity);
    }

    public MigrationLogs findOne(final long id) {
        return dao.findOne(id);
    }

    public List<MigrationLogs> findAll() {
        return dao.findAll();
    }
}
