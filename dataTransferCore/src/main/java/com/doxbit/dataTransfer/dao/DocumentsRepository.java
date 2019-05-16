package com.doxbit.dataTransfer.dao;

import com.doxbit.dataTransfer.model.DocToMigrate;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentsRepository extends JpaRepository<DocToMigrate, Long> {

	//List<DocToMigrate> findAllById(Iterable<Long> ids);
	
}