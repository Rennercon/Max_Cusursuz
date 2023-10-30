package bonus_hw_2;

import bonus_hw_2.manager.TaskManager;

public class Main {
    public static void main(String[] args) {

        TaskManager manager = new TaskManager();


        manager.addTask("Finish Homework", "Finish homework on time", "Сorrectness of the task", "23:10:2023");
        manager.addTask("Test1", "Finish homework on time", "Сorrectness of the task", "23:10:2023");
        manager.addTask("Test2", "g", "Сorrectness of the task", "23:10:2023");
        manager.addTask(    "Test3", "Test Description", "Сorrectness of the task", "23:10:2023");
        manager.addTask("Test4", "Nothing", "More nothing here", "");
        manager.delete("Test");
        manager.showTasks();
        manager.completeAction("Test3", "Test Description", "Сorrectness of the task", "23:10:2023");
        manager.showTasks();
    }
}
