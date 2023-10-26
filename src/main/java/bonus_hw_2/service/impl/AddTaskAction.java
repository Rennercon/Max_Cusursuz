package bonus_hw_2.service.impl;

import bonus_hw_2.dto.TaskDTO;
import bonus_hw_2.enums.Status;
import bonus_hw_2.cash.CashList;
import bonus_hw_2.service.TaskAction;

public class AddTaskAction implements TaskAction {

    @Override
    public void perform(String name, String description, String priority, String deadLine, CashList<TaskDTO> list) {
        list.addToLIst(new TaskDTO(name, description, priority, deadLine, Status.IN_PROGRESS));
    }
}
