package sio.op_projet;

import javafx.collections.FXCollections;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
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
    private ImageView btnEquipage;
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
    private ImageView imageP;
    @FXML
    private ImageView imagePC;
    @FXML
    private ImageView imageCarte;
    @FXML
    private ImageView choiWB;
    @FXML
    private ImageView choixLuffy;
    @FXML
    private ImageView choixRoger;
    @FXML
    private AnchorPane mapChoixCapitaine;
    @FXML
    private ImageView choixDoflamingo;
    @FXML
    private ImageView btnStart1;
    @FXML
    private Label nomPerso;
    @FXML
    private ImageView imagePerso;
    @FXML
    private AnchorPane mapDes;
    @FXML
    private Label lblVieMaxE;
    @FXML
    private Label lblVieActuelleE;
    @FXML
    private Label lblVieMaxP;
    @FXML
    private Label lblVieActuelleP;
    @FXML
    private ImageView imageChoixCap;
    @FXML
    private Label nomCap;
    @FXML
    private Label lblFuiteD;
    @FXML
    private Label lblAttaqueD;
    @FXML
    private Label lblDefenseD;
    @FXML
    private Label lblVieD;

    public void invisible(AnchorPane apCourante) {apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}

    Description crocodileD = new Description("Crocodile",
            "pirate/crocodile.gif",
            1000,
            20,
            50,
            50);
    Description doflamingoD = new Description("Doflamingo", "pirate/doflamingoG.gif",
            1000,
            20,
            50,
            50);
    Description bnD = new Description("Barbe Noire", "pirate/barbeNoir.gif",
            1000,
            20,
            50,
            50);
    Description wbD = new Description("Barbe Blanche", "pirate/barbeBlanche.gif",
            9000,
            20,
            50,
            50);
    Description rogerD = new Description("Roger", "pirate/roger.gif",
            1000,
            1000,
            1000,
            1000);
    Description luffyD = new Description("Luffy", "pirate/gear5G.gif",
            5000,
            20,
            50,
            50);
    Description baggyD = new Description("Baggy", "pirate/baggy.gif",
            1000,
            50,
            0,
            100);
    Ennemis enerE = new Ennemis("Ener", "pirate/ener.gif",
            1000,
            100,
            50);
    Description joueurD ;
    Ennemis e;
    @Override
    public void  initialize(URL url, ResourceBundle resourceBundle){
        clearAll();
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

    public void clearAll(){
        invisible(mapDebut);
        invisible(mapEquipage);
        invisible(mapStart);
        invisible(mapCarte);
        invisible(mapCombat);
        invisible(mapChoixCapitaine);
        invisible(mapDes);
    }

    @FXML
    public void clickedStart1(Event event) {
        clearAll();
        visible(mapChoixCapitaine);
        afficherPersonnage(luffyD);
    }

    @FXML
    public void clickedAventure(Event event) {
        clearAll();
        visible(mapCarte);
    }

    @FXML
    public void clickedEquipage(Event event) {
        clearAll();
        visible(mapEquipage);

    }

    @Deprecated
    public void clickedStart(Event event) {
        clearAll();
        visible(mapDebut);
    }

    @Deprecated
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
    public void changerText(Label lblTexte, int intTexte){
        lblTexte.setText(Integer.toString(intTexte));
    }
    public void changerVie(){
        changerText(lblVieActuelleP, joueurD.getVieActuelle());
        changerText(lblVieActuelleE, e.getVieActuelle());
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////                    COMBAT           /////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////




    @FXML
    public void clickedAttaque(Event event) {
        e.vieE(joueurD.attaque());
        joueurD.vie(e.attaqueE());
        changerVie();
        mort();
        mortE();
    }

    @FXML
    public void clickedDefense(Event event) {
        joueurD.defense(e.attaqueE());
        changerVie();
        mort();
        mortE();
    }

    @FXML
    public void clickedFuite(Event event) {
        if(joueurD.fuite() == true){
            Alert taFuit = new Alert(Alert.AlertType.INFORMATION);
            taFuit.setContentText("Tu as fuit !");
            taFuit.setHeaderText("FUITE");
            taFuit.showAndWait();
            clearAll();
            visible(mapCarte);
        }
        joueurD.vie(e.attaqueE());
        changerVie();
        mort();
        mortE();
    }
    public boolean mort(){
        if (joueurD.getVieActuelle()<=0){
            Alert tMort = new Alert(Alert.AlertType.INFORMATION);
            tMort.setContentText("Tu es mort !");
            tMort.setHeaderText("DEFAITE");
            tMort.showAndWait();
            clearAll();
            visible(mapChoixCapitaine);
            return true;
        }
        return false;
    }

    public boolean mortE(){
        if (e.getVieActuelle()<=0){
            Alert victoire = new Alert(Alert.AlertType.INFORMATION);
            victoire.setContentText("Tu as gagné!!!");
            victoire.setHeaderText("VICTOIRE");
            victoire.showAndWait();
            return true;
        }
        return false;
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////                  CAPITAINE        /////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    public void clickedChoixRoger(Event event) {
        afficherPersonnage(rogerD);
        joueurD = rogerD;
    }

    @FXML
    public void clickedChoixLuffy(Event event) {
        afficherPersonnage(luffyD);
        joueurD = luffyD;
    }

    @FXML
    public void clickedChoixWB(Event event) {
        afficherPersonnage(wbD);
        joueurD = wbD;
    }

    @FXML
    public void clickedhoixDoflamingo(Event event) {
        afficherPersonnage(doflamingoD);
        joueurD = doflamingoD;
    }

    @FXML
    public void clickedChoixBN(Event event) {
        afficherPersonnage(bnD);
        joueurD = bnD;
    }

    @FXML
    public void clickedChoixCrocodile(Event event) {
        afficherPersonnage(crocodileD);
        joueurD = crocodileD;
    }
    @FXML
    public void clickedChoixBaggy(Event event) {
        afficherPersonnage(baggyD);
        joueurD = baggyD;
    }
    @FXML
    public void clickedChoixCap(Event event) {
        clearAll();
        visible(mapDebut);
    }
    public void afficherEnnemis(Ennemis ennemis){
        changeImageViewImg(imageEnnemis, "personnages/"+ennemis.getImage());
        lblVieActuelleE.setText(String.valueOf(ennemis.getVieActuelle()));
        lblVieMaxE.setText(String.valueOf(ennemis.getVieMax()));
    }
    public void afficherPersonnage(Description description){
        nomCap.setText(description.getNom());
        changeImageViewImg(imageChoixCap,"personnages/"+description.getImage() );
        changeImageViewImg(imageP, "personnages/"+description.getImage());
        changeImageViewImg(imageCarte, "personnages/"+description.getImage());
        changeImageViewImg(imagePC, "personnages/"+description.getImage());
        changeImageViewImg(imageP, "personnages/"+description.getImage());
        changeImageViewImg(imageCarte, "personnages/"+description.getImage());
        changeImageViewImg(imagePC, "personnages/"+description.getImage());
        changeImageViewImg(imagePerso, "personnages/"+description.getImage());
        nomPerso.setText(description.getNom());
        lblVieActuelleP.setText(String.valueOf(description.getVieActuelle()));
        lblVieMaxP.setText(String.valueOf(description.getVieMax()));
        lblVieD.setText(String.valueOf(description.getVieMax()));
        lblAttaqueD.setText(String.valueOf(description.getAttaque()));
        lblDefenseD.setText(String.valueOf(description.getDefense()));
        lblFuiteD.setText(String.valueOf(description.getFuite()));
    }
    @FXML
    public void clickedRetourDebut(Event event) {
        clearAll();
        visible(mapChoixCapitaine);
    }
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////    ILES      /////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    public void clickedIle11(Event event) {
        clearAll();
        visible(mapCombat);
        e=enerE;
        changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
        afficherEnnemis(enerE);
    }
    @FXML
    public void clickedIle15(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedIle14(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedIle13(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedIle12(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedIle18(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedIle17(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedIle16(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedCap(Event event) {
        clearAll();
        visible(mapDes);
    }

    @FXML
    public void clickedRetourDes(Event event) {
        clearAll();
        visible(mapEquipage);
    }



}