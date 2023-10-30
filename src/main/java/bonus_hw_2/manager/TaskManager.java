package bonus_hw_2.manager;

import bonus_hw_2.dto.TaskDTO;
import bonus_hw_2.cash.CashList;
import bonus_hw_2.service.TaskAction;
import bonus_hw_2.service.impl.AddTaskAction;
import bonus_hw_2.service.impl.CompleteTaskAction;

public class TaskManager {

    private final CashList<TaskDTO> list = new CashList<>();
    private final TaskAction addAction = new AddTaskAction();
    private final TaskAction completedAction = new CompleteTaskAction();


    public void addTask(String name, String description, String priority, String deadLine ) {
        this.addAction.perform(name, description, priority, deadLine, this.list);
    }

    public CashList<TaskDTO> getList() {
        return list;
    }

    public void completeAction(String name, String description, String priority, String deadLine ) {
        completedAction.perform(name, description, priority, deadLine, getList());
    }

    public boolean delete(String name) {
        return this.list.deleteByName(name);
    }
    public void showTasks () {
        for (TaskDTO element:list.getList()) {
            System.out.println(element.getName());
            System.out.println(element.getDescription());
            System.out.println(element.getStatus());
            System.out.println("---------------");
        }
    }


}
