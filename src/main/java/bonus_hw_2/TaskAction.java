package bonus_hw_2;
@FunctionalInterface
public interface TaskAction {
    Task perform(String name, String description, String priority, String deadLine);
}
