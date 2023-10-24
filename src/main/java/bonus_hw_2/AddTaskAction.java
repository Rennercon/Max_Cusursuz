package bonus_hw_2;

public class AddTaskAction implements TaskAction{
    @Override
    public Task perform(String name, String description, String priority, String deadLine ) {
        if (name.isEmpty() || description.isEmpty()) {
            System.out.println("Введите правильное название и описание для задачи!!!");
            return null;
        } else if (deadLine.isEmpty()) {
            System.out.println("Задача " + name + " не ограничена по времени");
        }
        return new Task(name, description, priority, deadLine, false);
    }
}
