package deu.swe2.tableorder.boundary;

import deu.swe2.tableorder.controller.*;
import deu.swe2.tableorder.entity.TableInfo;
import deu.swe2.tableorder.entity.TableRepository;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;

import java.util.List;

public class TableManagerBoundary {

    @FXML private GridPane tableGrid;
    @FXML private TextField tableNumberField;

    private final TableRepository repository = new TableRepository();
    private final TableQueryService queryService = new TableQueryService(repository);
    private final TableCreateService createService = new TableCreateService(repository);
    private final TableUpdateService updateService = new TableUpdateService(repository);

    private int currentRow = 0;
    private int currentCol = 0;

    @FXML
    public void initialize() {
        refreshTableGrid();
    }

    @FXML
    public void onAddButtonClick() {
        String number = tableNumberField.getText();
        if (number.isEmpty()) {
            showAlert("입력 오류", "테이블 번호를 입력하세요.");
            return;
        }

        boolean added = createService.addTable(number);
        if (!added) {
            showAlert("중복 오류", "이미 존재하는 테이블 번호입니다.");
        } else {
            refreshTableGrid();
            tableNumberField.clear();
        }
    }

    @FXML
    public void onSaveButtonClick() {
        showAlert("저장", "현재 구조에서는 수정 기능은 미구현입니다. (선택된 항목 수정 필요)");
    }

    private void refreshTableGrid() {
        tableGrid.getChildren().clear();
        List<TableInfo> tables = queryService.getTables();
        currentRow = 0;
        currentCol = 0;

        for (int i = 0; i < tables.size(); i++) {
            TableInfo table = tables.get(i);
            TitledPane pane = new TitledPane("테이블 " + table.getNumber(), null);
            pane.setPrefSize(200, 200);
            tableGrid.add(pane, currentCol, currentRow);

            currentCol++;
            if (currentCol > 1) {
                currentCol = 0;
                currentRow++;
            }
        }
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
