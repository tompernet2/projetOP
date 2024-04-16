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
    private ImageView ile28;
    @FXML
    private ImageView ile29;
    @FXML
    private ImageView ile22;
    @FXML
    private ImageView ile23;
    @FXML
    private ImageView ile21;
    @FXML
    private ImageView ile26;
    @FXML
    private ImageView ile27;
    @FXML
    private ImageView ile24;
    @FXML
    private ImageView ile25;
    @FXML
    private ImageView ile210;
    @FXML
    private ImageView ile55;
    @FXML
    private ImageView ile56;
    @FXML
    private ImageView ile53;
    @FXML
    private ImageView ile54;
    @FXML
    private ImageView ile410;
    @FXML
    private ImageView ile59;
    @FXML
    private ImageView ile57;
    @FXML
    private ImageView ile411;
    @FXML
    private ImageView ile58;
    @FXML
    private ImageView ile51;
    @FXML
    private ImageView ile52;
    @FXML
    private ImageView ile44;
    @FXML
    private ImageView ile45;
    @FXML
    private ImageView ile42;
    @FXML
    private ImageView ile43;
    @FXML
    private ImageView ile48;
    @FXML
    private ImageView ile49;
    @FXML
    private ImageView ile46;
    @FXML
    private ImageView ile47;
    @FXML
    private ImageView ile41;
    @FXML
    private ImageView ile39;
    @FXML
    private ImageView ile33;
    @FXML
    private ImageView ile34;
    @FXML
    private ImageView ile31;
    @FXML
    private ImageView ile32;
    @FXML
    private ImageView ile37;
    @FXML
    private ImageView ile311;
    @FXML
    private ImageView ile38;
    @FXML
    private ImageView ile310;
    @FXML
    private ImageView ile35;
    @FXML
    private ImageView ile313;
    @FXML
    private ImageView ile36;
    @FXML
    private ImageView ile312;
    @FXML
    private ImageView ileBoss;

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
            10,
            200,
            10,
            100);

    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////           ENNEMIS          ///////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////


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
    Ennemis sentomaruE = new Ennemis("Sentomaru", "pirate/sentomaru.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis magellanE = new Ennemis("Magellan", "pirate/magellan.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis kakuE = new Ennemis("Kaku", "pirate/kaku.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis lucciE = new Ennemis("Lucci", "pirate/lucci.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis fujitoraE = new Ennemis("Fujitora", "pirate/fujitora.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis kizaruE = new Ennemis("Kirzaru", "pirate/kizaru.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis aokijiE = new Ennemis("Aokiji", "pirate/aokiji.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis akainuE = new Ennemis("Akainu", "pirate/akainu.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis garpE = new Ennemis("Garp", "pirate/garp.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis sengokuE = new Ennemis("Sengoku", "pirate/sengoku.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis foxyE = new Ennemis("Foxy", "pirate/foxy.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis morganE = new Ennemis("Morgan", "pirate/morgan.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis monetE = new Ennemis("Monet", "pirate/monet.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis cesarE = new Ennemis("César", "pirate/cesar.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis giantE = new Ennemis("Géant", "pirate/geant.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis trebolE = new Ennemis("Trébol", "pirate/trebol.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis deflamingoE = new Ennemis("Doflamingo", "pirate/doflamingo.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis jinbeE = new Ennemis("Jinbe", "pirate/jinbei.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis moriaE = new Ennemis("Moria", "pirate/moria.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis marcoE = new Ennemis("Marco", "pirate/marco.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis mihawkE = new Ennemis("Mihawk", "pirate/mihawk.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis shanksE = new Ennemis("Shanks", "pirate/shanks.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis shikiE = new Ennemis("Shiki", "pirate/shiki.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis orochiE = new Ennemis("Orochi", "pirate/orochi.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis whoE = new Ennemis("Who's who", "pirate/who.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis drakeE = new Ennemis("X-Drake", "pirate/drake.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis sasakiE = new Ennemis("Sasaki", "pirate/sasaki.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis blackmariaE = new Ennemis("Black Maria", "pirate/blackMaria.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis yamatoE = new Ennemis("Yamato", "pirate/yamato.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis jackE = new Ennemis("Jack", "pirate/jack.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis queenE = new Ennemis("Queen", "pirate/queen.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis kingE = new Ennemis("King", "pirate/king.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis bigmomE = new Ennemis("Bigmom", "pirate/bigmom.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis kaidoE = new Ennemis("Kaido", "pirate/kaido.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis vascoE = new Ennemis("Vasco Shot", "pirate/vasco.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis pizarroE = new Ennemis("Pizarro", "pirate/pizarro.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis wasatsumiE = new Ennemis("Wadatsumi", "pirate/wadatsumi.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis augurE = new Ennemis("Van augur", "pirate/augur.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis devonE = new Ennemis("Devon", "pirate/devon.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis burgessE = new Ennemis("Burgess", "pirate/burgess.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis teachE = new Ennemis("Teach", "pirate/barbeNoir.gif",
            1000,
            100,
            50,
            10,
            100);
    Ennemis vegapunkE = new Ennemis("Vegapunk", "pirate/vegapunk.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis doyensE = new Ennemis("Les 5 doyens", "pirate/5doyen.png",
            1000,
            100,
            50,
            10,
            100);
    Ennemis imuE = new Ennemis("IMU", "pirate/imu.png",
            1000,
            100,
            50,
            10,
            100);

































    Description joueurD ;
    Ennemis e;
    int berryActuel = 0;
    int victoireTotal1 = 0;

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
        changeImageViewVisible(ile21, false);
        changeImageViewVisible(ile22, false);
        changeImageViewVisible(ile23, false);
        changeImageViewVisible(ile24, false);
        changeImageViewVisible(ile25, false);
        changeImageViewVisible(ile26, false);
        changeImageViewVisible(ile27, false);
        changeImageViewVisible(ile28, false);
        changeImageViewVisible(ile29, false);
        changeImageViewVisible(ile210, false);
        changeImageViewVisible(ile31, false);
        changeImageViewVisible(ile32, false);
        changeImageViewVisible(ile33, false);
        changeImageViewVisible(ile34, false);
        changeImageViewVisible(ile35, false);
        changeImageViewVisible(ile36, false);
        changeImageViewVisible(ile37, false);
        changeImageViewVisible(ile38, false);
        changeImageViewVisible(ile39, false);
        changeImageViewVisible(ile310, false);
        changeImageViewVisible(ile311, false);
        changeImageViewVisible(ile312, false);
        changeImageViewVisible(ile313, false);
        changeImageViewVisible(ile41, false);
        changeImageViewVisible(ile42, false);
        changeImageViewVisible(ile43, false);
        changeImageViewVisible(ile44, false);
        changeImageViewVisible(ile45, false);
        changeImageViewVisible(ile46, false);
        changeImageViewVisible(ile47, false);
        changeImageViewVisible(ile48, false);
        changeImageViewVisible(ile49, false);
        changeImageViewVisible(ile410, false);
        changeImageViewVisible(ile411, false);
        changeImageViewVisible(ile51, false);
        changeImageViewVisible(ile52, false);
        changeImageViewVisible(ile53, false);
        changeImageViewVisible(ile54, false);
        changeImageViewVisible(ile55, false);
        changeImageViewVisible(ile56, false);
        changeImageViewVisible(ile57, false);
        changeImageViewVisible(ile58, false);
        changeImageViewVisible(ile59, false);
        changeImageViewVisible(ileBoss, false);
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
            visible(mapCarte);
            joueurD.setVieActuelle(joueurD.getVieMax());
            e.setVieActuelle(e.getVieMax());
            changerVie();
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
            victoireTotal1 += 1;
            if(victoireTotal1 == 1){
                changeImageViewVisible(ile12, true);
                changeImageViewImg(ile11, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 2 ) {
                changeImageViewVisible(ile13, true);
                changeImageViewImg(ile12, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 3 ) {
                changeImageViewVisible(ile14, true);
                changeImageViewImg(ile13, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 4 ) {
                changeImageViewVisible(ile15, true);
                changeImageViewImg(ile14, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 5 ) {
                changeImageViewVisible(ile16, true);
                changeImageViewImg(ile15, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 6 ) {
                changeImageViewVisible(ile17, true);
                changeImageViewImg(ile16, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 7 ) {
                changeImageViewVisible(ile18, true);
                changeImageViewImg(ile17, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 8 ) {
                changeImageViewVisible(ile21, true);
                changeImageViewImg(ile18, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 9 ) {
                changeImageViewVisible(ile22, true);
                changeImageViewImg(ile21, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 10 ) {
                changeImageViewVisible(ile23, true);
                changeImageViewImg(ile22, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 11 ) {
                changeImageViewVisible(ile24, true);
                changeImageViewImg(ile23, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 12 ) {
                changeImageViewVisible(ile25, true);
                changeImageViewImg(ile24, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 13 ) {
                changeImageViewVisible(ile26, true);
                changeImageViewImg(ile25, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 14 ) {
                changeImageViewVisible(ile27, true);
                changeImageViewImg(ile26, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 15 ) {
                changeImageViewVisible(ile28, true);
                changeImageViewImg(ile27, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 16 ) {
                changeImageViewVisible(ile29, true);
                changeImageViewImg(ile28, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 17 ) {
                changeImageViewVisible(ile210, true);
                changeImageViewImg(ile29, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 18 ) {
                changeImageViewVisible(ile31, true);
                changeImageViewImg(ile210, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 19 ) {
                changeImageViewVisible(ile32, true);
                changeImageViewImg(ile31, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 20 ) {
                changeImageViewVisible(ile33, true);
                changeImageViewImg(ile32, "logo/orbeV.png");

            }else if (victoireTotal1 == 21 ) {
                changeImageViewVisible(ile34, true);
                changeImageViewImg(ile33, "logo/orbeV.png");

            }else if (victoireTotal1 == 22 ) {
                changeImageViewVisible(ile35, true);
                changeImageViewImg(ile34, "logo/orbeV.png");

            }else if (victoireTotal1 == 23 ) {
                changeImageViewVisible(ile36, true);
                changeImageViewImg(ile35, "logo/orbeV.png");

            }else if (victoireTotal1 == 24 ) {
                changeImageViewVisible(ile37, true);
                changeImageViewImg(ile36, "logo/orbeV.png");

            }else if (victoireTotal1 == 25 ) {
                changeImageViewVisible(ile38, true);
                changeImageViewImg(ile37, "logo/orbeV.png");

            }else if (victoireTotal1 == 26 ) {
                changeImageViewVisible(ile39, true);
                changeImageViewImg(ile38, "logo/orbeV.png");

            }else if (victoireTotal1 == 27 ) {
                changeImageViewVisible(ile310, true);
                changeImageViewImg(ile39, "logo/orbeV.png");

            }else if (victoireTotal1 == 28 ) {
                changeImageViewVisible(ile311, true);
                changeImageViewImg(ile310, "logo/orbeV.png");

            }else if (victoireTotal1 == 29 ) {
                changeImageViewVisible(ile312, true);
                changeImageViewImg(ile311, "logo/orbeV.png");

            }else if (victoireTotal1 == 30 ) {
                changeImageViewVisible(ile313, true);
                changeImageViewImg(ile312, "logo/orbeV.png");

            }else if (victoireTotal1 == 31 ) {
                changeImageViewVisible(ile41, true);
                changeImageViewImg(ile313, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 32 ) {
                changeImageViewVisible(ile42, true);
                changeImageViewImg(ile41, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 33 ) {
                changeImageViewVisible(ile43, true);
                changeImageViewImg(ile42, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 34 ) {
                changeImageViewVisible(ile44, true);
                changeImageViewImg(ile43, "logo/orbeV.png");

            }else if (victoireTotal1 == 35 ) {
                changeImageViewVisible(ile45, true);
                changeImageViewImg(ile44, "logo/orbeV.png");

            }else if (victoireTotal1 == 36 ) {
                changeImageViewVisible(ile46, true);
                changeImageViewImg(ile45, "logo/orbeV.png");

            }else if (victoireTotal1 == 37 ) {
                changeImageViewVisible(ile47, true);
                changeImageViewImg(ile46, "logo/orbeV.png");

            }else if (victoireTotal1 == 38 ) {
                changeImageViewVisible(ile48, true);
                changeImageViewImg(ile47, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 39 ) {
                changeImageViewVisible(ile49, true);
                changeImageViewImg(ile48, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 40 ) {
                changeImageViewVisible(ile410, true);
                changeImageViewImg(ile49, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 41 ) {
                changeImageViewVisible(ile411, true);
                changeImageViewImg(ile410, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 42 ) {
                changeImageViewVisible(ile51, true);
                changeImageViewImg(ile411, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 43 ) {
                changeImageViewVisible(ile52, true);
                changeImageViewImg(ile51, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 44 ) {
                changeImageViewVisible(ile53, true);
                changeImageViewImg(ile52, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 45 ) {
                changeImageViewVisible(ile54, true);
                changeImageViewImg(ile53, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 46 ) {
                changeImageViewVisible(ile55, true);
                changeImageViewImg(ile54, "logo/orbeV.png");

            }else if (victoireTotal1 ==  47) {
                changeImageViewVisible(ile56, true);
                changeImageViewImg(ile55, "logo/orbeV.png");

            }else if (victoireTotal1 == 48 ) {
                changeImageViewVisible(ile57, true);
                changeImageViewImg(ile56, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 49 ) {
                changeImageViewVisible(ile58, true);
                changeImageViewImg(ile57, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 50 ) {
                changeImageViewVisible(ile59, true);
                changeImageViewImg(ile58, "logo/orbeV.png");
            }
            else if (victoireTotal1 == 51 ) {
                changeImageViewVisible(ileBoss, true);
                changeImageViewImg(ile59, "logo/orbeV.png");
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
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////    ILES      /////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////

    //////////////////////
    //////    1    ///////
    //////////////////////
    @FXML
    public void clickedIle11(Event event) {
        if (victoireTotal1 ==0){
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
        if (victoireTotal1 ==1){
            System.out.println("oui");
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
        if (victoireTotal1 ==2){
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
        if (victoireTotal1 ==3){
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
        if (victoireTotal1 ==4){
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
        if (victoireTotal1 ==5){
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
        if (victoireTotal1 ==6){
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
        if (victoireTotal1 ==7){
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat11.gif");
            e=enerE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    //////////////////////
    //////    2    ///////
    //////////////////////

    @FXML
    public void clickedIle21(Event event) {
        if (victoireTotal1 ==8){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=sentomaruE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }

    @FXML
    public void clickedIle22(Event event) {
        if (victoireTotal1 ==9){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat7.gif");
            e=magellanE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle23(Event event) {
        if (victoireTotal1 ==10){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat8.gif");
            e=kakuE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle24(Event event) {
        if (victoireTotal1 ==11){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat9.gif");
            e=lucciE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle25(Event event) {
        if (victoireTotal1 ==12){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat10.gif");
            e=fujitoraE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle26(Event event) {
        if (victoireTotal1 ==13){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat11.gif");
            e=kizaruE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle27(Event event) {
        if (victoireTotal1 ==14){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat12.gif");
            e=aokijiE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle28(Event event) {
        if (victoireTotal1 ==15){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat13.gif");
            e=akainuE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle29(Event event) {
        if (victoireTotal1 ==16){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat14.gif");
            e=garpE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }

    @FXML
    public void clickedIle210(Event event) {
        if (victoireTotal1 ==17){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat15.gif");
            e=sengokuE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    //////////////////////
    //////    3    ///////
    //////////////////////
    @FXML
    public void clickedIle31(Event event) {
        if (victoireTotal1 ==18){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat1.gif");
            e=foxyE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle32(Event event) {
        if (victoireTotal1 ==19){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat2.gif");
            e=morganE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle33(Event event) {
        if (victoireTotal1 ==20){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat3.gif");
            e=monetE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle34(Event event) {
        if (victoireTotal1 ==21){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat4.gif");
            e=cesarE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle35(Event event) {
        if (victoireTotal1 ==22){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat5.gif");
            e=giantE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle36(Event event) {
        if (victoireTotal1 ==23){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=trebolE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle37(Event event) {
        if (victoireTotal1 ==24){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat7.gif");
            e=deflamingoE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle38(Event event) {
        if (victoireTotal1 ==25){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat8.gif");
            e=jinbeE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle39(Event event) {
        if (victoireTotal1 ==26){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat9.gif");
            e=moriaE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle310(Event event) {
        if (victoireTotal1 ==27){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat10.gif");
            e=marcoE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle311(Event event) {
        if (victoireTotal1 ==28){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat11.gif");
            e=mihawkE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle312(Event event) {
        if (victoireTotal1 ==29){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat12.gif");
            e=shanksE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle313(Event event) {
        if (victoireTotal1 ==30){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat13.gif");
            e=shikiE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    //////////////////////
    //////    4    ///////
    //////////////////////

    @FXML
    public void clickedIle41(Event event) {
        if (victoireTotal1 ==31){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=orochiE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle42(Event event) {
        if (victoireTotal1 ==32){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=whoE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle43(Event event) {
        if (victoireTotal1 ==33){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=drakeE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle44(Event event) {
        if (victoireTotal1 ==34){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=sasakiE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle45(Event event) {
        if (victoireTotal1 ==35){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=blackmariaE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle46(Event event) {
        if (victoireTotal1 ==36){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=yamatoE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle47(Event event) {
        if (victoireTotal1 ==37){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=jackE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle48(Event event) {
        if (victoireTotal1 ==38){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=queenE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle49(Event event) {
        if (victoireTotal1 ==39){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=kingE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle410(Event event) {
        if (victoireTotal1 ==40){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=bigmomE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle411(Event event) {
        if (victoireTotal1 ==41){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=kaidoE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    //////////////////////
    //////    5    ///////
    //////////////////////
    @FXML
    public void clickedIle51(Event event) {
        if (victoireTotal1 ==42){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=vascoE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle52(Event event) {
        if (victoireTotal1 ==43){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=pizarroE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle53(Event event) {
        if (victoireTotal1 ==44){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=wasatsumiE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle54(Event event) {
        if (victoireTotal1 ==45){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=augurE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle55(Event event) {
        if (victoireTotal1 ==46){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=devonE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle56(Event event) {
        if (victoireTotal1 ==47){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=burgessE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle57(Event event) {
        if (victoireTotal1 ==48){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=teachE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle58(Event event) {
        if (victoireTotal1 ==49){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=vegapunkE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    @FXML
    public void clickedIle59(Event event) {
        if (victoireTotal1 ==50){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=doyensE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
    //////////////////////
    //////    BOSS    ///////
    //////////////////////
    @FXML
    public void clickedIleBoss(Event event) {
        if (victoireTotal1 ==51){
            System.out.println("oui");
            clearAll();
            visible(mapCombat);
            changeImageViewImg(imageFond, "map/bonFondCombat6.gif");
            e=imuE;
            changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
            afficherEnnemis(e);
        }
    }
}