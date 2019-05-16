package com.doxbit.dataTransfer;

import java.util.List;
import java.util.Optional;

import com.doxbit.dataTransfer.dao.DocumentsRepository;
import com.doxbit.dataTransfer.model.DocToMigrate;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

@Configuration
public class DocRepImplement implements DocumentsRepository {

	public List<DocToMigrate> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DocToMigrate> findAll(Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<DocToMigrate> findAllById(Iterable<Long> ids) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> List<S> saveAll(Iterable<S> entities) {
		// TODO Auto-generated method stub
		return null;
	}

	public void flush() {
		// TODO Auto-generated method stub
		
	}

	public <S extends DocToMigrate> S saveAndFlush(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteInBatch(Iterable<DocToMigrate> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAllInBatch() {
		// TODO Auto-generated method stub
		
	}

	public DocToMigrate getOne(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> List<S> findAll(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> List<S> findAll(Example<S> example, Sort sort) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> Optional<S> findOne(Example<S> example) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> Page<S> findAll(Example<S> example, Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> long count(Example<S> example) {
		// TODO Auto-generated method stub
		return 0;
	}

	public <S extends DocToMigrate> boolean exists(Example<S> example) {
		// TODO Auto-generated method stub
		return false;
	}

	public Page<DocToMigrate> findAll(Pageable pageable) {
		// TODO Auto-generated method stub
		return null;
	}

	public <S extends DocToMigrate> S save(S entity) {
		// TODO Auto-generated method stub
		return null;
	}

	public Optional<DocToMigrate> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean existsById(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	public long count() {
		// TODO Auto-generated method stub
		return 0;
	}

	public void deleteById(Long id) {
		// TODO Auto-generated method stub
		
	}

	public void delete(DocToMigrate entity) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll(Iterable<? extends DocToMigrate> entities) {
		// TODO Auto-generated method stub
		
	}

	public void deleteAll() {
		// TODO Auto-generated method stub
		
	}
	
	

}
