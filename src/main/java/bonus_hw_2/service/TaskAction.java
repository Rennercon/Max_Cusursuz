package bonus_hw_2.service;

import bonus_hw_2.dto.TaskDTO;
import bonus_hw_2.cash.CashList;

public interface TaskAction {
    void perform(String name, String description, String priority, String deadLine, CashList<TaskDTO> list);

}
