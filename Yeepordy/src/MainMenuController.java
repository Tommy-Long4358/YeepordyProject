import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;

public class MainMenuController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private AnchorPane background;

    @FXML
    private Button playButton;

    @FXML
    private Button quitButton;

    @FXML
    private Slider volumeSlider;

    @FXML
    private ImageView imageView;

    private Media backgroundMusic;
    private MediaPlayer mediaPlayer;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            backgroundMusic = new Media(Main.class.getResource("resources/sounds/theme.wav").toURI().toString());
        } catch (URISyntaxException e) {}
        mediaPlayer = new MediaPlayer(backgroundMusic);
        mediaPlayer.play();

        volumeSlider.setValue(mediaPlayer.getVolume() * 100);
        volumeSlider.valueProperty().addListener(new InvalidationListener() {

            @Override
            public void invalidated(Observable observable) {
                mediaPlayer.setVolume(volumeSlider.getValue() / 100);
            }
        });
    }

    @FXML
    void quitGame(ActionEvent event) {

    }

    @FXML
    void startGame(ActionEvent event) {
        
    }
}
