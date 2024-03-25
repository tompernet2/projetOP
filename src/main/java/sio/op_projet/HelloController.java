package sio.op_projet;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements initialize {

    @FXML
    private AnchorPane mapStart;
    @FXML
    private AnchorPane mapChoixPerso;
    @FXML
    private ImageView btnMarine;
    @FXML
    private ImageView btnPirate;
    @FXML
    private ListView listePersonnage;
    @FXML
    private ImageView btnStart;
    @FXML
    private ImageView btnEquipage;
    @FXML
    private TextArea description;
    @FXML
    private ImageView imagePersonnage;
    @FXML
    private ImageView btnAventure;
    @FXML
    private AnchorPane mapEquipage;
    private String versionGraphique;
    private ImageView imgFond;
    private String mapCourante;
    @FXML
    private AnchorPane mapDebut;

    public void invisible(AnchorPane apCourante) {apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}

    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/Images/"+versionGraphique+linkImage
                        ).toExternalForm()
                )
        );
    }
    @Override
    public void  initialize(URL url, ResourceBundle resourceBundle){
        clearAll();
        visible(mapStart);
    }

    public void clearAll(){
        invisible(mapDebut);
        invisible(mapEquipage);
        invisible(mapChoixPerso);
        invisible(mapStart);
    }

    @FXML
    public void clickedPirate(Event event) {
        clearAll();
        visible(mapChoixPerso);

    }

    @FXML
    public void clickedMarine(Event event) {
        clearAll();
        visible(mapChoixPerso);
    }

    @FXML
    public void clickedAventure(Event event) {
    }

    @FXML
    public void clickedListePersonnage(Event event) {

    }

    @FXML
    public void clickedEquipage(Event event) {
        clearAll();
        visible(mapEquipage);
    }

    @FXML
    public void clickedStart(Event event) {
        clearAll();
        visible(mapDebut);
    }

    public void clickedListePersonnage(MouseEvent mouseEvent) {
    }
}