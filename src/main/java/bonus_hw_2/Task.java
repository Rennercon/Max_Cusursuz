package bonus_hw_2;

import bonus_hw_2.enums.Status;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Task {

    private String name;
    private String description;
    private String priority;
    private String deadLine;
    private Status status;

    public Task(String name, String description, String priority, String deadLine, Status status) {
        this.name = name;
        this.description = description;
        this.priority = priority;
        this.deadLine = deadLine;
        this.status = status;
    }
}
