package deu.swe2.tableorder.entity;

public class TableInfo {
    private int id;
    private String number;

    public TableInfo(int id, String number) {
        this.id = id;
        this.number = number;
    }

    public int getId() {
        return id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Table #" + number;
    }
}