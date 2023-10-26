package bonus_hw_2.service.impl;

import bonus_hw_2.dto.TaskDTO;
import bonus_hw_2.enums.Status;
import bonus_hw_2.cash.CashList;
import bonus_hw_2.service.TaskAction;

public class CompleteTaskAction implements TaskAction {
    @Override
    public void perform(String name, String description, String priority, String deadLine, CashList<TaskDTO> list) {
        TaskDTO task = list.getByName(name);
        if (task == null){
            list.addToLIst(new TaskDTO("", "description", "priority", "deadLine", Status.COMPLETED));
            return;
        }
        task.setStatus(Status.COMPLETED);
    }
}
