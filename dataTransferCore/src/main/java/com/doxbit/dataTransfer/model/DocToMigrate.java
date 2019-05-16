package com.doxbit.dataTransfer.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DocToMigrate {
	
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
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public Date getLastMigrationDate() {
		return lastMigrationDate;
	}

	public void setLastMigrationDate(Date lastMigrationDate) {
		this.lastMigrationDate = lastMigrationDate;
	}


	
	public DocToMigrate(Long id, String title, String author, Date lastMigrationDate) {
		//super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.lastMigrationDate = lastMigrationDate;
	}
}
