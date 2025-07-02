package Desepticon.Monya.demoSpring.taskList;

import java.time.LocalDateTime;

public class Task {
    private Long id;
    private String name;
    private String description;
    private boolean completed;
    private LocalDateTime buildTime;
    private LocalDateTime changeTime;

    public Task() {
    }

    public Task(Long id, String name, String description, boolean completed) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.completed = completed;
        this.buildTime = LocalDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public boolean isCompleted() {
        return completed;
    }

    public LocalDateTime getBuildTime() {
        return buildTime;
    }

    public LocalDateTime getChangeTime() {
        return changeTime;
    }

    public void setId(Long id) {
        this.id = id;
        setBuildTime();
    }

    public void setName(String name) {
        this.name = name;
        setChangeTime();
    }

    public void setDescription(String description) {
        this.description = description;
        setChangeTime();
    }

    public void setCompleted(boolean completed) {
        this.completed = completed;
        setChangeTime();
    }

    public void setBuildTime() {
        this.buildTime = LocalDateTime.now();
    }

    public void setChangeTime() {
        this.changeTime = LocalDateTime.now();;
    }
}
