package bonus_hw_2;

import java.util.ArrayList;
import java.util.List;

public class TaskManager {
    private static List<Task> tasksList = new ArrayList<>();


    public void addTask(String name, String description, String priority, String deadLine) {
        AddTaskAction t1 = new AddTaskAction();
        tasksList.add(t1.perform(name, description, priority, deadLine));
    }
    public void displayingTaskList(String name) {
        for (Task element:
             tasksList) {
            if (element != null){
                if (element.getName().equals(name)) System.out.println(element.getDescription());
                //Добавить проверку на отсутствие ответа
            }
        }
    }
    public void completeTask(String name) {
        for (Task element:
                tasksList) {
            if (element != null){
                if (element.getName().equals(name)){
                    deleteTask(name);
                    addTask(element.getName(), element.getDescription(), element.getPriority(), element.getDeadLine());
                }
            }
        }
    }
    public void deleteTask(String name){
        for (Task element:
                tasksList) {
            if (element != null) {
                if (element.getName().equals(name)) {
                    tasksList.remove(element);
                }
            }
        }
    }
    public void showTasks () {
        for (Task element:
                tasksList) {
            if (element != null) {
                System.out.println("---------------");
                System.out.println(element.getName() + ":");
                System.out.println("Description" + element.getDescription());
                System.out.println("Priority" + element.getPriority());
                System.out.println("DeadLine" + element.getDeadLine());
                System.out.println("Status: " + element.getStatus());
            }
        }
    }
}
