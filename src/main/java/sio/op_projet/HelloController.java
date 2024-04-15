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
    @FXML
    private Label lblNomD;
    @FXML
    private Label lblNomE;
    @FXML
    private Label lblChoixCapDef;
    @FXML
    private Label lblChoixCapFuite;
    @FXML
    private Label lblChoixCapVie;
    @FXML
    private Label lblChoixCapAtt;
    @FXML
    private Label lblBerry2;
    @FXML
    private Label lblBerry1;
    @FXML
    private ImageView ile17;
    @FXML
    private ImageView ile18;
    @FXML
    private ImageView ile11;
    @FXML
    private ImageView ile12;
    @FXML
    private ImageView ile15;
    @FXML
    private ImageView ile16;
    @FXML
    private ImageView ile13;
    @FXML
    private ImageView ile14;
    @FXML
    private ImageView ile11119;
    @FXML
    private ImageView ile11118;
    @FXML
    private ImageView ile11117;
    @FXML
    private ImageView ile11116;
    @FXML
    private ImageView ile11115;
    @FXML
    private ImageView ile11114;
    @FXML
    private ImageView ile11113;
    @FXML
    private ImageView ile11112;
    @FXML
    private ImageView ile11111;
    @FXML
    private ImageView ile1111;
    @FXML
    private ImageView ile1110;
    @FXML
    private ImageView ile111110;
    @FXML
    private ImageView ile111111;
    @FXML
    private ImageView ile111112;
    @FXML
    private ImageView ile111;
    @FXML
    private ImageView ile117;
    @FXML
    private ImageView ile116;
    @FXML
    private ImageView ile119;
    @FXML
    private ImageView ile118;
    @FXML
    private ImageView ile113;
    @FXML
    private ImageView ile112;
    @FXML
    private ImageView ile115;
    @FXML
    private ImageView ile114;
    @FXML
    private ImageView ile1111271;
    @FXML
    private ImageView ile111117;
    @FXML
    private ImageView ile111118;
    @FXML
    private ImageView ile111119;
    @FXML
    private ImageView ile111113;
    @FXML
    private ImageView ile111114;
    @FXML
    private ImageView ile111115;
    @FXML
    private ImageView ile111116;
    @FXML
    private ImageView ile111128;
    @FXML
    private ImageView ile111129;
    @FXML
    private ImageView ile111124;
    @FXML
    private ImageView ile111125;
    @FXML
    private ImageView ile111126;
    @FXML
    private ImageView ile111127;
    @FXML
    private ImageView ile111120;
    @FXML
    private ImageView ile111121;
    @FXML
    private ImageView ile111122;
    @FXML
    private ImageView ile111123;
    @FXML
    private ImageView ile111131;
    @FXML
    private ImageView ile111130;

    public void invisible(AnchorPane apCourante) {apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}
    public int alea() { return (int)(Math.random() * 101 );}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////           PERSONNAGE          ///////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////




    Description luffyD = new Description("Luffy", "pirate/luffy.gif",
            5000,
            2000,
            200,
            50);
    Description kiddD = new Description("Kidd",
            "pirate/kid.gif",
            4000,
            300,
            100,
            50);
    Description baggyD = new Description("Baggy", "pirate/baggy.gif",
            6000,
            150,
            50,
            100);
    Description lawD = new Description("Law", "pirate/law.gif",
            4000,
            150,
            150,
            80);
    Description boaD = new Description("Boa Hancok", "pirate/boa.gif",
            4000,
            150,
            300,
            60);
    Description crocodileD = new Description("Crocodile",
            "pirate/crocodile.gif",
            4000,
            200,
            200,
            20);

    Ennemis cobyE = new Ennemis("Coby", "pirate/coby.gif",
            1500,
            100,
            70,
            10,
            100);
    Ennemis smokerE = new Ennemis("Smoker", "pirate/smoker.gif",
            2000,
            70,
            30,
            10,
            100);
    Ennemis namiE = new Ennemis("Nami", "pirate/nami.gif",
            2000,
            70,
            30,
            10,
            100);
    Ennemis chopperE = new Ennemis("Chopper", "pirate/chopper.gif",
            2000,
            70,
            30,
            10,
            100);
    Ennemis brookE = new Ennemis("Brook", "pirate/brook.gif",
            2000,
            70,
            30,
            10,
            100);
    Ennemis robinE = new Ennemis("Robin", "pirate/robinG.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis zoroE = new Ennemis("Zoro", "pirate/zoro.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis enerE = new Ennemis("Ener", "pirate/ener.gif",
            1000,
            100,
            50,
            10,
            100);

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








    Ennemis kizaruE = new Ennemis("Kizaru", "pirate/kizaru.gif",
            3000,
            80,
            50,
            10,
            100);
    Ennemis akainuE = new Ennemis("Akainu", "pirate/akainu.gif",
            3500,
            90,
            70,
            10,
            100);
    Ennemis doflamingoE = new Ennemis("Doflamingo", "pirate/doflamingo.gif",
            2800,
            80,
            40,
            10,
            100);
    Ennemis crocodileE = new Ennemis("Crocodile", "pirate/crocodile.gif",
            2500,
            70,
            60,
            10,
            100);
    Ennemis moriaE = new Ennemis("Gecko Moria", "pirate/moria.gif",
            2200,
            60,
            50,
            10,
            100);
    Ennemis hancockE = new Ennemis("Boa Hancock", "pirate/hancock.gif",
            1800,
            50,
            80,
            10,
            100);
    Ennemis enelE = new Ennemis("Enel", "pirate/enel.gif",
            3200,
            90,
            60,
            10,
            100);
    Ennemis kaidoE = new Ennemis("Kaido", "pirate/kaido.gif",
            4000,
            100,
            80,
            10,
            100);
    Ennemis bigMomE = new Ennemis("Big Mom", "pirate/bigMom.gif",
            3800,
            90,
            70,
            10,
            100);

    Description joueurD ;
    Ennemis e;
    int berryActuel = 0;
    int victoireTotal = 0;
    @Override
    public void  initialize(URL url, ResourceBundle resourceBundle){
        clearAll();
        visible(mapStart);
        changeImageViewVisible(ile12, false);
        changeImageViewVisible(ile13, false);
        changeImageViewVisible(ile14, false);
        changeImageViewVisible(ile15, false);
        changeImageViewVisible(ile16, false);
        changeImageViewVisible(ile17, false);
        changeImageViewVisible(ile18, false);
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
    public void changeImageViewVisible(ImageView imageView, boolean visible) {
        if (visible) {
            // Rendre l'imageView visible en chargeant une image
            imageView.setImage(
                    new Image(
                            getClass().getResource(
                                    "/projetOP/logo/orbe.png"
                            ).toExternalForm()
                    )
            );
        } else {
            // Rendre l'imageView invisible en chargeant une image vide
            imageView.setImage(null);
        }
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
        joueurD = luffyD;
        afficherPersonnage(luffyD);
        lblBerry1.setText(String.valueOf(berryActuel));
        lblBerry2.setText(String.valueOf(berryActuel));
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
    public void changerBerry(){
        changerText(lblBerry1, berryActuel);
        changerText(lblBerry2, berryActuel);
    }
    public void ajoutBerry(int berry){
        berryActuel = berryActuel + berry;
        changerBerry();
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////                    COMBAT           /////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////




    @FXML
    public void clickedAttaque(Event event) {
        int auPif = alea();
        if (auPif<50){
            joueurD.vie(e.attaqueE());
            System.out.println("Ennemi Attaque");
        }
        else {
            e.defenseE(joueurD.attaque());
            System.out.println("Ennemie Defend");
        }
        e.vieE(joueurD.attaque());
        changerVie();
        mort();
        mortE();
    }

    @FXML
    public void clickedDefense(Event event) {
        int auPif = alea();
        if (auPif<50){
            joueurD.defense(e.attaqueE());
            System.out.println("Ennemi Attaque mais degat divisé");
        }
        else {
            System.out.println("Ennemie Defend donc rien ne se passe");
        }
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
        }else {
            int auPif = alea();
            if (auPif < 50) {
                joueurD.vie(e.attaqueE());
                System.out.println("Ennemi Attaque");
            } else {
                System.out.println("Ennemie Defend");
            }
        }
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
            ajoutBerry(e.getBerryE());
            Alert victoire = new Alert(Alert.AlertType.INFORMATION);
            victoire.setContentText("Tu as gagné!!!");
            victoire.setHeaderText("VICTOIRE");
            victoire.showAndWait();
            clearAll();
            visible(mapCarte);
            e.setVieActuelle(e.getVieMax());
            victoireTotal += 1;
            if(victoireTotal == 1){
                changeImageViewVisible(ile12, true);
                changeImageViewImg(ile11, "logo/orbeV.png");
            }
            else if (victoireTotal == 2 ) {
                changeImageViewVisible(ile13, true);
                changeImageViewImg(ile12, "logo/orbeV.png");
            }
            else if (victoireTotal == 3 ) {
                changeImageViewVisible(ile14, true);
                changeImageViewImg(ile13, "logo/orbeV.png");
            }
            else if (victoireTotal == 4 ) {
                changeImageViewVisible(ile15, true);
                changeImageViewImg(ile14, "logo/orbeV.png");
            }
            else if (victoireTotal == 5 ) {
                changeImageViewVisible(ile16, true);
                changeImageViewImg(ile15, "logo/orbeV.png");
            }
            else if (victoireTotal == 6 ) {
                changeImageViewVisible(ile17, true);
                changeImageViewImg(ile16, "logo/orbeV.png");
            }
            else if (victoireTotal == 7 ) {
                changeImageViewVisible(ile18, true);
                changeImageViewImg(ile17, "logo/orbeV.png");
            }
            else if (victoireTotal == 8 ) {
                changeImageViewImg(ile18, "logo/orbeV.png");
            }

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
    public void clickedChoixLuffy(Event event) {
        afficherPersonnage(luffyD);
        joueurD = luffyD;
    }
    @FXML
    public void clickedChoixKidd(Event event) {
        afficherPersonnage(kiddD);
        joueurD = kiddD;
    }
    @FXML
    public void clickedChoixBaggy(Event event) {
        afficherPersonnage(baggyD);
        joueurD = baggyD;
    }
    @FXML
    public void clickedChoixLaw(Event event) {
        afficherPersonnage(lawD);
        joueurD = lawD;
    }

    @FXML
    public void clickedChoixBoa(Event event) {
        afficherPersonnage(boaD);
        joueurD = boaD;
    }
    @FXML
    public void clickedChoixCrocodile(Event event) {
        afficherPersonnage(crocodileD);
        joueurD = crocodileD;
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
        lblNomE.setText(String.valueOf(ennemis.getNom()));
    }
    public void afficherPersonnage(Description description){
        nomCap.setText(description.getNom());
        lblChoixCapVie.setText(String.valueOf(description.getVieMax()));
        lblChoixCapAtt.setText(String.valueOf(description.getAttaque()));
        lblChoixCapDef.setText(String.valueOf(description.getDefense()));
        lblChoixCapFuite.setText(String.valueOf(description.getFuite()));
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
        lblNomD.setText(String.valueOf(description.getNom()));
    }
    @Deprecated
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
        if (victoireTotal <1){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat13.gif");
            e=cobyE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle12(Event event) {
        if (victoireTotal <2){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat15.gif");
            e=smokerE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle13(Event event) {
        if (victoireTotal <3){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat1.gif");
            e=namiE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }



    @FXML
    public void clickedIle14(Event event) {
        if (victoireTotal <4){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat2.gif");
            e=chopperE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }

    @FXML
    public void clickedIle15(Event event) {
        if (victoireTotal <5){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat3.gif");
            e=brookE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }

    @FXML
    public void clickedIle16(Event event) {
        if (victoireTotal <6){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat4.gif");
            e=robinE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle17(Event event) {
        if (victoireTotal <7){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat5.gif");
            e=zoroE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle18(Event event) {
        if (victoireTotal <8){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat11.gif");
            e=enerE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }

    @FXML
    public void clickedRetourDes(Event event) {
        clearAll();
        visible(mapEquipage);
    }


    @FXML
    public void clickedCapInfo(Event event) {
        clearAll();
        visible(mapDes);
    }
}