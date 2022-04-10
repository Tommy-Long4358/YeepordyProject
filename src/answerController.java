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

    @FXML
    public void checkAnswer(ActionEvent event) {
        Button checkAnswerButton = (Button)event.getSource();
        String userAnswerID = checkAnswerButton.getId();
        String userAnswer = userAnswerID.substring(userAnswerID.length()-2, userAnswerID.length()-1);
        temp = Question.getInstance();
        
        if(userAnswer.equals(temp.getAnswer()))
        {
            
        }
        else
        {
            
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println(Question.getInstance().getQuestion());
        questionTitle.setText(Question.getInstance().getQuestionType());
        questionText.setText(Question.getInstance().getQuestion());
    }

}
