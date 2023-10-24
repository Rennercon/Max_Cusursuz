package bonus_hw_2;

public class Task {
    private String name;
    private String description;
    private String priority;
    private String deadLine;
    private boolean status;
    public Task(String name, String description, String priority, String deadLine, boolean status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.deadLine = deadLine;
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getPriority() {
        return priority;
    }

    public String getDeadLine() {
        return deadLine;
    }

    public boolean getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public void setDeadLine(String deadLine) {
        this.deadLine = deadLine;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }
}
