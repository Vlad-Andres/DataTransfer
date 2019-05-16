package com.doxbit.dataTransfer.dao;

import com.doxbit.dataTransfer.model.MigrationLogs;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.*;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MigrHubRepImplement implements HubRepositoryCustom {

    //SessionFactory sessionFactory;

    //EntityManager em;

   // public MigrHubRepImplement(EntityManager em){this.em=em;}


    public List<MigrationLogs> findLogsByAuthor(String Author) {

//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<MigrationLogs> cq =cb.createQuery(MigrationLogs.class);
//        Root<MigrationLogs> mgLog = cq.from(MigrationLogs.class);
//
//        List<Predicate>predicates =new ArrayList<Predicate>();
//
//        if(Author!=null){
//            predicates.add(cb.equal(mgLog.get("author"),Author));
//        }
//        cq.where(predicates.toArray(new Predicate[0]));
//        TypedQuery<MigrationLogs> query = em.createQuery(cq);
//
//        return query.getResultList();
        return null;
    }
}
