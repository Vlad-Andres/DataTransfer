package com.doxbit.dataTransfer;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class DocToMigrate {
	private @Id @GeneratedValue Long id;
	private String Title;
	private String Author;
	private Date lastMigrationDate;	
	
	public DocToMigrate(Long id, String title, String author, Date lastMigrationDate) {
		//super();
		this.id = id;
		Title = title;
		Author = author;
		this.lastMigrationDate = lastMigrationDate;
	}
}
