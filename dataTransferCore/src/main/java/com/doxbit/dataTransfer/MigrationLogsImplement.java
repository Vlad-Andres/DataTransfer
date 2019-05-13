
package com.doxbit.dataTransfer;

        import java.util.List;
        import java.util.Optional;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.data.domain.Example;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.domain.Sort;

@Configuration
public class MigrationLogsImplement implements MigrationHubReppository {

    public List<MigrationLogs> findAll() {
        // TODO Auto-generated method stub
        return null;
    }

    public List<MigrationLogs> findAll(Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    public List<MigrationLogs> findAllById(Iterable<Long> ids) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> List<S> saveAll(Iterable<S> entities) {
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

    public void deleteInBatch(Iterable<MigrationLogs> entities) {
        // TODO Auto-generated method stub

    }

    public void deleteAllInBatch() {
        // TODO Auto-generated method stub

    }

    public MigrationLogs getOne(Long id) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> List<S> findAll(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> List<S> findAll(Example<S> example, Sort sort) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> Optional<S> findOne(Example<S> example) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> Page<S> findAll(Example<S> example, Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    public Optional<MigrationLogs> findById(Long aLong) {
        return Optional.empty();
    }

    public <S extends MigrationLogs> long count(Example<S> example) {
        // TODO Auto-generated method stub
        return 0;
    }

    public <S extends MigrationLogs> boolean exists(Example<S> example) {
        // TODO Auto-generated method stub
        return false;
    }

    public Page<MigrationLogs> findAll(Pageable pageable) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> S save(S entity) {
        // TODO Auto-generated method stub
        return null;
    }

    public <S extends MigrationLogs> S saveAndFlush(S s) {
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

    public void delete(MigrationLogs entity) {
        // TODO Auto-generated method stub

    }

    public void deleteAll(Iterable<? extends MigrationLogs> entities) {
        // TODO Auto-generated method stub

    }

    public void deleteAll() {
        // TODO Auto-generated method stub

    }



}
