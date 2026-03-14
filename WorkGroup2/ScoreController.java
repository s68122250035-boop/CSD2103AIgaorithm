import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.io.FileWriter;
import java.io.IOException;

public class ScoreController {

    @FXML
    private ComboBox<String> subjectComboBox;

    @FXML
    private TextField midtermField;

    @FXML
    private TextField finalField;

    @FXML
    private TextField homeworkField;

    @FXML
    private TextField totalField;

    @FXML
    private Label statusLabel;

    @FXML
    private Label gradeLabel;

    @FXML
    public void initialize() {

        subjectComboBox.getItems().addAll(
                "วิศวกรสังคม",
                "ภาษาอังกฤษเพื่อการดูแลสุขภาพ",
                "การเขียนโปรแกรมคอมพิวเตอร์",
                "การเขียนโปรแกรม Java",
                "คณิตศาสตร์",
                "วิทยาการคอมพิวเตอร์",
                "ภาษาอังกฤษ",
                "ภาษาจีนเบื้องต้น",
                "ภาษาญี่ปุ่น",
                "ภาษาจีนพื้นฐาน",
                "ประวัติศาสตร์",
                "สังคมศึกษา",
                "การงานอาชีพ",
                "ภาษาไทย"
        );

    }

    @FXML
    public void calculateScore() {

        try {

            double mid = Double.parseDouble(midtermField.getText());
            double fin = Double.parseDouble(finalField.getText());
            double hw = Double.parseDouble(homeworkField.getText());

            if(mid > 40 || fin > 50 || hw > 60){
                statusLabel.setText("Score exceeds maximum");
                statusLabel.setStyle("-fx-text-fill: orange;");
                return;
            }

            double total = mid + fin + hw;

            totalField.setText(String.valueOf(total));

            // PASS / FAIL
            if (total >= 50) {
                statusLabel.setText("PASS");
                statusLabel.setStyle("-fx-text-fill: green;");
            } else {
                statusLabel.setText("FAIL");
                statusLabel.setStyle("-fx-text-fill: red;");
            }

            // Grade
            String grade;

            if (total >= 80) {
                grade = "A";
                gradeLabel.setStyle("-fx-text-fill: green;");
            }
            else if (total >= 70) {
                grade = "B";
                gradeLabel.setStyle("-fx-text-fill: green;");
            }
            else if (total >= 60) {
                grade = "C";
                gradeLabel.setStyle("-fx-text-fill: orange;");
            }
            else if (total >= 50) {
                grade = "D";
                gradeLabel.setStyle("-fx-text-fill: orange;");
            }
            else {
                grade = "F";
                gradeLabel.setStyle("-fx-text-fill: red;");
            }

            gradeLabel.setText(grade);

        } catch (Exception e) {

            statusLabel.setText("Invalid input");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }

    @FXML
    public void resetForm() {

        subjectComboBox.setValue(null);
        midtermField.clear();
        finalField.clear();
        homeworkField.clear();
        totalField.clear();

        statusLabel.setText("");
        gradeLabel.setText("");
    }

    @FXML
    public void saveResult() {

        try {

            FileWriter writer = new FileWriter("result.txt");

            writer.write("Subject: " + subjectComboBox.getValue() + "\n");
            writer.write("Total Score: " + totalField.getText() + "\n");
            writer.write("Status: " + statusLabel.getText() + "\n");
            writer.write("Grade: " + gradeLabel.getText() + "\n");

            writer.close();

            statusLabel.setText("Save successflly. Thank you!");
            statusLabel.setStyle("-fx-text-fill: blue;");

        } catch (IOException e) {

            statusLabel.setText("Error saving file");
            statusLabel.setStyle("-fx-text-fill: red;");
        }
    }
}