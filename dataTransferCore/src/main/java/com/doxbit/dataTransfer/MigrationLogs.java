package com.doxbit.dataTransfer;

        import java.util.Date;

        import javax.persistence.Entity;
        import javax.persistence.GeneratedValue;
        import javax.persistence.Id;

        import lombok.Data;

@Data
@Entity
public class MigrationLogs {

    private @Id @GeneratedValue Long id;
    private String Title;
    private String Author;
    private Date lastMigrationDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
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
        Title = title;
        Author = author;
        this.lastMigrationDate = lastMigrationDate;
    }
}
