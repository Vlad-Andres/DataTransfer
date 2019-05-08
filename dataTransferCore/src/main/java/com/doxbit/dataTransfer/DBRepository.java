package com.doxbit.dataTransfer;

import org.springframework.data.jpa.repository.JpaRepository;

interface DBRepository extends JpaRepository<DBDataEntity, Long> {

}