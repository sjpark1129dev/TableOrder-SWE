package deu.swe2.tableorder.controller;

import deu.swe2.tableorder.entity.TableInfo;
import deu.swe2.tableorder.entity.TableRepository;
import java.util.List;

public class TableQueryService {
    private final TableRepository repository;

    public TableQueryService(TableRepository repository) {
        this.repository = repository;
    }

    public List<TableInfo> getTables() {
        return repository.getAll();
    }
}