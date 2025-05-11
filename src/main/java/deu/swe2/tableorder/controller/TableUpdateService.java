package deu.swe2.tableorder.controller;

import deu.swe2.tableorder.entity.TableRepository;

public class TableUpdateService {
    private final TableRepository repository;

    public TableUpdateService(TableRepository repository) {
        this.repository = repository;
    }

    public boolean updateTable(int id, String newNumber) {
        return repository.update(id, newNumber);
    }
}