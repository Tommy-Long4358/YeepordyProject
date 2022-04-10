import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.text.Text;

public class answerController implements Initializable { //extends Question

    @FXML
    private Button answerA;

    @FXML
    private Button answerB;

    @FXML
    private Button answerC;

    @FXML
    private Button answerD;

    @FXML
    private Text questionText;

    @FXML
    private Text questionTitle;

    private Question temp;
    
    public void initData(Question question) {
        questionChoice = question;
        questionTitle.setText(questionChoice.getQuestionType() + " " + questionChoice.getPointValue());
        questionText.setText(questionChoice.getQuestion());
    }

    @FXML
    public void checkAnswer(ActionEvent event) {
        Button checkAnswerButton = (Button)event.getSource();
        String userAnswerID = checkAnswerButton.getId();
        String userAnswer = userAnswerID.substring(6, 7);

        System.out.println("Correct answer: " + questionChoice.getAnswer());
        System.out.println("User answer: " + userAnswer);
        if (userAnswer.toLowerCase().equals(questionChoice.getAnswer().toLowerCase()))
        {
            System.out.println("Correct!");
            
        }
        else
        {
            System.out.println("Wrong!");
        }
    }
}
