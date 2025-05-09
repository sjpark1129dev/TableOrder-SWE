package deu.swe2.tableorder;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HelloApplication extends Application {
    @Override
    public void start(Stage primaryStage) {
        try {
            // FXML 파일 로드 (파일 이름을 "layout.fxml"로 가정)
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("hello-view.fxml")));

            Scene scene = new Scene(root); // FXML 로드 결과로 Scene 생성

            primaryStage.setTitle("FXML Layout Example");
            primaryStage.setScene(scene);
            primaryStage.show();

        } catch (IOException e) {
            e.printStackTrace(); // 파일 로드 실패 시 오류 출력
        }
    }

    public static void main(String[] args) {
        launch();
    }
}