package deu.swe2.tableorder.boundary;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class TableViewBoundary {
    @FXML
    private void openTableManager(ActionEvent event) throws IOException {
        Parent newRoot = FXMLLoader.load(getClass().getResource("/deu/swe2/tableorder/TableManagerUI.fxml"));
        Scene newScene = new Scene(newRoot, 800, 500); // 새 창 크기 지정

        Stage newStage = new Stage(); // 새 창 생성
        newStage.setTitle("테이블 관리");
        newStage.setScene(newScene);
        newStage.show(); // 새 창 띄우기
    }
}