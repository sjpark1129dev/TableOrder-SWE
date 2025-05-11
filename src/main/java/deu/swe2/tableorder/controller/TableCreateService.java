package deu.swe2.tableorder.controller;

import deu.swe2.tableorder.entity.TableRepository;

public class TableCreateService {
    private final TableRepository repository;

    public TableCreateService(TableRepository repository) {
        this.repository = repository;
    }

    public boolean addTable(String number) {
        return repository.add(number);
    }
}