package bonus_hw_2;

public class Main {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();
        manager.addTask("Finish homework", "Finish homework on time", "Сorrectness of the task", "23:10:2023");
        manager.addTask("Finish", "Finish homework on time", "Сorrectness of the task", "23:10:2023");
        manager.addTask("Finish homework", "g", "Сorrectness of the task", "23:10:2023");
        manager.addTask(    "Test", "Test Description", "Сorrectness of the task", "23:10:2023");
        manager.addTask("Finish homework", "Finish homework on time", "Сorrectness of the task", "");
        manager.displayingTaskList("Test");
        manager.deleteTask("Test");
        manager.displayingTaskList("Test");
        //manager.completeTask("Finish homework");
        manager.showTasks();
    }
}
