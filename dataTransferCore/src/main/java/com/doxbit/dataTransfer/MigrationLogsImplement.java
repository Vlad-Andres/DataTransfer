
package com.doxbit.dataTransfer;

        import java.util.List;
        import java.util.Optional;

        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.context.annotation.Configuration;
        import org.springframework.data.domain.Example;
        import org.springframework.data.domain.Page;
        import org.springframework.data.domain.Pageable;
        import org.springframework.data.domain.Sort;
        import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
        import org.springframework.stereotype.Component;

        import javax.persistence.EntityManager;
        import javax.persistence.PersistenceContext;

@Component
public class MigrationLogsImplement implements MigrationHubReppository {
    @PersistenceContext
    private EntityManager em;

    public <S extends MigrationLogs> S save(S entity) {
        em.persist(entity);
        return entity;
    }

    public <S extends MigrationLogs> Iterable<S> saveAll(Iterable<S> entities) {
        return null;
    }

    public Optional<MigrationLogs> findById(Long aLong) {
        return Optional.empty();
    }

    public boolean existsById(Long aLong) {
        return false;
    }

    public Iterable<MigrationLogs> findAll() {
        return null;
    }

    public Iterable<MigrationLogs> findAllById(Iterable<Long> longs) {
        return null;
    }

    public long count() {
        return 0;
    }

    public void deleteById(Long aLong) {

    }

    public void delete(MigrationLogs entity) {

    }

    public void deleteAll(Iterable<? extends MigrationLogs> entities) {

    }

    public void deleteAll() {

    }
}
