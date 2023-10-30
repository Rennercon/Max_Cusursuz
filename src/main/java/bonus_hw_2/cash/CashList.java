package bonus_hw_2.cash;

import bonus_hw_2.dto.TaskDTO;

import java.util.ArrayList;
import java.util.List;

public class CashList<T extends TaskDTO> {
    private List<T> list = new ArrayList<>();

    public void addToLIst(T t) {
        this.list.add(t);
    }

    public T getByName(String name) {
        for (T element:list) {
            if (element.getName() == name){
                return element;
            }
        }
       return null;
    }

    public boolean deleteByName(String name) {
        return this.list.removeIf(f -> f.getName().equals(name));
    }

    public List<T> getList() {
        return list;
    }
}
