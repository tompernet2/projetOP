package sio.op_projet;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

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
    @FXML
    private ImageView btnRetourCarte;
    @FXML
    private AnchorPane mapCarte;
    @FXML
    private AnchorPane mapCombat;
    @FXML
    private ImageView imageEnnemis;
    @FXML
    private ImageView imageFond;
    @FXML
    private ImageView imageLogo;
    @FXML
    private Label lblNomPersonnage;
    @FXML
    private ImageView imageP;
    @FXML
    private ImageView imagePC;
    @FXML
    private ImageView imageCarte;
    @FXML
    private Label lblParchemin;

    public void invisible(AnchorPane apCourante) {apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}
    private ArrayList<String> pirates = new ArrayList<>();
    private ArrayList<String> marines = new ArrayList<>();
    private ArrayList<String> affichage2page = new ArrayList<>();
    Description zoroD = new Description("Zoro", "pirate/zoro.gif", "Roronoa Zoro est le redoutable sabreur de l'équipage du Chapeau de Paille. Maître dans l'art du Santoryu, il manie trois sabres avec une habileté mortelle. Son objectif est de devenir le plus grand sabreur du monde, et il est prêt à affronter n'importe quel défi pour y parvenir.");
    Description usoppD = new Description("Usopp", "pirate/usopp.gif", "Usopp est le tireur d'élite de l'équipage du Chapeau de Paille, connu pour ses mensonges exagérés et ses incroyables talents d'inventeur. Bien qu'il soit souvent craintif et lâche face au danger, Usopp montre un courage sans faille quand il s'agit de protéger ses amis.");
    Description namiD = new Description("Nami", "pirate/nami.gif", "Nami est la navigatrice experte de l'équipage du Chapeau de Paille. Elle est incroyablement habile en cartographie et en navigation, et elle rêve de tracer une carte complète du monde. Bien qu'elle soit initialement motivée par l'argent, elle se soucie profondément de ses amis et est prête à tout pour les protéger.");
    Description luffyD = new Description("Luffy", "pirate/gear5G.gif","Monkey D. Luffy est le capitaine intrépide et excentrique de l'équipage du Chapeau de Paille. Doté du fruit du démon Gomu Gomu, il possède une élasticité incroyable qui lui permet d'étirer son corps comme du caoutchouc. Son rêve est de devenir le Roi des Pirates en trouvant le légendaire trésor One Piece.");
    Description joueurD ;
    Personnage p;

    @Override
    public void  initialize(URL url, ResourceBundle resourceBundle){
        clearAll();
        pirates.add("Luffy");
        pirates.add("Nami");
        pirates.add("Usopp");
        pirates.add("Zoro");
        marines.add("Garp");
        marines.add("Sengoku");
        marines.add("Smoker");
        marines.add("Akainu");
        visible(mapStart);
    }
    public void changeImageViewImg(ImageView imgView, String linkImage){
        imgView.setImage(
                new Image(
                        getClass().getResource(
                                "/projetOP/"+linkImage
                        ).toExternalForm()
                )
        );
    }
    public void setDescripton(Description descripton){
        lblParchemin.setText(descripton.getDescription());
        changeImageViewImg(imagePersonnage, "personnages/"+descripton.getImage());
        lblNomPersonnage.setText(descripton.getNom());
    }

    public void clearAll(){
        invisible(mapDebut);
        invisible(mapEquipage);
        invisible(mapChoixPerso);
        invisible(mapStart);
        invisible(mapCarte);
        invisible(mapCombat);
    }

    @FXML
    public void clickedPirate(Event event) {
        clearAll();
        visible(mapChoixPerso);
        affichage2page = pirates;


        listePersonnage.setItems(FXCollections.observableArrayList(pirates));
        changeImageViewImg(imageLogo, "logo/pirate.png");
        changeImageViewImg(btnEquipage,"logo/pirate.png");
    }

    @FXML
    public void clickedMarine(Event event) {
        clearAll();
        visible(mapChoixPerso);
        affichage2page = marines;

        listePersonnage.setItems(FXCollections.observableArrayList(marines));
        changeImageViewImg(imageLogo, "logo/marine.png");
        changeImageViewImg(btnEquipage,"logo/marine.png" );
    }

    @FXML
    public void clickedAventure(Event event) {
        clearAll();
        visible(mapCarte);
    }

    @FXML
    public void clickedListePersonnage(Event event) {
        if ("Luffy".equals(listePersonnage.getSelectionModel().getSelectedItem().toString()) ) {
            setDescripton(luffyD);
            joueurD = luffyD;
        }
        else if ("Nami".equals(listePersonnage.getSelectionModel().getSelectedItem().toString()) ) {
            setDescripton(namiD);
            joueurD = namiD;
        }
        else if ("Usopp".equals(listePersonnage.getSelectionModel().getSelectedItem().toString()) ) {
            setDescripton(usoppD);
            joueurD = usoppD;
        }
        else if ("Zoro".equals(listePersonnage.getSelectionModel().getSelectedItem().toString()) ) {
            setDescripton(zoroD);
            joueurD = zoroD;
        }
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
        changeImageViewImg(imageP, "personnages/"+joueurD.getImage());
        changeImageViewImg(imageCarte, "personnages/"+joueurD.getImage());
        changeImageViewImg(imagePC, "personnages/"+joueurD.getImage());
    }

    public void clickedListePersonnage(MouseEvent mouseEvent) {
    }

    @FXML
    public void clickedRetourEquipage(Event event) {
        clearAll();
        visible(mapDebut);
    }

    @FXML
    public void clickedRetourCarte(Event event) {
        clearAll();
        visible(mapDebut);
    }

    @FXML
    public void clickedAttaque(Event event) {
    }

    @FXML
    public void clickedDefense(Event event) {
    }

    @FXML
    public void clickedFuite(Event event) {
        clearAll();
        visible(mapCarte);
    }

    @FXML
    public void clickedIle1(Event event) {
        clearAll();
        visible(mapCombat);
    }
}