package com.example.TaskMan.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "Task")
public class TaskModel {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    private String title;
    private String description;
    private Boolean isDone;
    private Date lastUpdate = null;
    private Boolean isActive = true;

    public TaskModel(UUID id, String title, String description, Boolean isDone, Date lastUpdate, Boolean isActive) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.isDone = isDone;
        this.lastUpdate = lastUpdate;
        this.isActive = isActive;
    }

    public TaskModel() {
    }

    public UUID getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Boolean getDone() {
        return isDone;
    }

    public Date getLastUpdate() {
        return lastUpdate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setDone(Boolean done) {
        isDone = done;
    }

    public void setLastUpdate(Date lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }
}
