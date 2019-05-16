//
//package com.doxbit.dataTransfer.dao;
//
//        import java.util.List;
//        import java.util.Optional;
//
//        import com.doxbit.dataTransfer.model.MigrationLogs;
//        import org.springframework.data.domain.Example;
//        import org.springframework.data.domain.Page;
//        import org.springframework.data.domain.Pageable;
//        import org.springframework.data.domain.Sort;
//        import org.springframework.data.jpa.domain.Specification;
//        import org.springframework.stereotype.Component;
//
//        import javax.persistence.EntityManager;
//        import javax.persistence.PersistenceContext;
//        import javax.persistence.criteria.CriteriaBuilder;
//
//
//@Component
//public class MigrationLogsImplement implements MigrationHubReppository {
//    @PersistenceContext
//    private EntityManager em;
//
//    public List<MigrationLogs> findLogsByName(String name) {
//        return null;
//    }
//
//    public List<MigrationLogs> findAll() {
//        return null;
//    }
//
//    public List<MigrationLogs> findAll(Sort sort) {
//        return null;
//    }
//
//    public List<MigrationLogs> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    public <S extends MigrationLogs> List<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    public void flush() {
//
//    }
//
//    public <S extends MigrationLogs> S saveAndFlush(S entity) {
//        return null;
//    }
//
//    public void deleteInBatch(Iterable<MigrationLogs> entities) {
//
//    }
//
//    public void deleteAllInBatch() {
//
//    }
//
//    public MigrationLogs getOne(Long aLong) {
//        return null;
//    }
//
//    public <S extends MigrationLogs> List<S> findAll(Example<S> example) {
//        return null;
//    }
//
//    public <S extends MigrationLogs> List<S> findAll(Example<S> example, Sort sort) {
//        return null;
//    }
//
//    public Optional<MigrationLogs> findOne(Specification<MigrationLogs> spec) {
//        return Optional.empty();
//    }
//
//    public List<MigrationLogs> findAll(Specification<MigrationLogs> spec) {
//        return null;
//    }
//
//    public Page<MigrationLogs> findAll(Specification<MigrationLogs> spec, Pageable pageable) {
//        return null;
//    }
//
//    public List<MigrationLogs> findAll(Specification<MigrationLogs> spec, Sort sort) {
//        return null;
//    }
//
//    public long count(Specification<MigrationLogs> spec) {
//        return 0;
//    }
//
//    public Page<MigrationLogs> findAll(Pageable pageable) {
//        return null;
//    }
//
//    public <S extends MigrationLogs> S save(S entity) {
//        return null;
//    }
//
//    public Optional<MigrationLogs> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    public long count() {
//        return 0;
//    }
//
//    public void deleteById(Long aLong) {
//
//    }
//
//    public void delete(MigrationLogs entity) {
//
//    }
//
//    public void deleteAll(Iterable<? extends MigrationLogs> entities) {
//
//    }
//
//    public void deleteAll() {
//
//    }
//
//    public <S extends MigrationLogs> Optional<S> findOne(Example<S> example) {
//        return Optional.empty();
//    }
//
//    public <S extends MigrationLogs> Page<S> findAll(Example<S> example, Pageable pageable) {
//        return null;
//    }
//
//    public <S extends MigrationLogs> long count(Example<S> example) {
//        return 0;
//    }
//
//    public <S extends MigrationLogs> boolean exists(Example<S> example) {
//        return false;
//    }
//}
