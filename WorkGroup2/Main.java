import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("view.fxml"));

        // กำหนดขนาดหน้าต่าง
        Scene scene = new Scene(fxmlLoader.load(), 450, 350);

        stage.setTitle("โปรแกรมคำนวณเกรด");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}