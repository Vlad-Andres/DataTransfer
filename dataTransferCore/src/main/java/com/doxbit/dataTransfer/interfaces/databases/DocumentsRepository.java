package com.doxbit.dataTransfer.interfaces.databases;

import org.springframework.data.jpa.repository.JpaRepository;

import com.doxbit.dataTransfer.DocToMigrate;

interface DocumentsRepository extends JpaRepository<DocToMigrate, Long> {

}