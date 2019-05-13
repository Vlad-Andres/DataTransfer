package com.doxbit.dataTransfer;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocumentsRepository extends JpaRepository<DocToMigrate, Long> {

	//List<DocToMigrate> findAllById(Iterable<Long> ids);
	
}