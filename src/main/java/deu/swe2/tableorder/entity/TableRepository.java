package deu.swe2.tableorder.entity;

import java.util.ArrayList;
import java.util.List;

public class TableRepository {
    private final List<TableInfo> tableList = new ArrayList<>();
    private int idCounter = 1;

    public List<TableInfo> getAll() {
        return tableList;
    }

    public boolean add(String number) {
        for (TableInfo t : tableList) {
            if (t.getNumber().equals(number)) return false;
        }
        tableList.add(new TableInfo(idCounter++, number));
        return true;
    }

    public boolean update(int id, String newNumber) {
        for (TableInfo t : tableList) {
            if (t.getId() != id && t.getNumber().equals(newNumber)) return false;
        }
        for (TableInfo t : tableList) {
            if (t.getId() == id) {
                t.setNumber(newNumber);
                return true;
            }
        }
        return false;
    }
}