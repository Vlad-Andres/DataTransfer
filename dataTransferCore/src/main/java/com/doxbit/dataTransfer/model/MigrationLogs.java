package com.doxbit.dataTransfer.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

//@Data
@Entity
@Cacheable
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class MigrationLogs implements Serializable {

    private @Id @GeneratedValue Long id;
    private String title;
    private String author;
    private Date lastMigrationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        author = author;
    }

    public Date getLastMigrationDate() {
        return lastMigrationDate;
    }

    public void setLastMigrationDate(Date lastMigrationDate) {
        this.lastMigrationDate = lastMigrationDate;
    }



    public MigrationLogs(Long id, String title, String author, Date lastMigrationDate) {
        //super();
        this.id = id;
        title = title;
        author = author;
        this.lastMigrationDate = lastMigrationDate;
    }
}
