package model;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.xml.stream.events.DTD;
import java.util.Date;

@Component
@Configuration
public class Homework {
    private long id;
    private String title;
    private String content;
    private Date create_time;
    private Date update_time;

    public Homework() {
    }

    public Homework(long id, String title, String content, Date create_time, Date update_time) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.create_time = create_time;
        this.update_time = update_time;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(Date update_time) {
        this.update_time = update_time;
    }
}
