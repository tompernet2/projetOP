package sio.op_projet;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

import java.net.URL;
import java.util.*;

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
    @FXML
    private Label lblBerryTot;
    @FXML
    private Label lblBerryAjout;
    @FXML
    private AnchorPane mapWin;
    @FXML
    private AnchorPane mapLose;
    @FXML
    private Label lblBerryRetirer;
    @FXML
    private Label lblBerryTot1;
    @FXML
    private Label lblBerry3;
    @FXML
    private ImageView animationDefPersonnage;
    @FXML
    private ImageView animationAttPersonnage;
    @FXML
    private ImageView animationAttEnnemi;
    @FXML
    private ImageView animationDefEnnemi;
    @FXML
    private Label lblPrixVie;
    @FXML
    private Label lblPrixAtt;
    @FXML
    private Label lblPrixFuite;
    @FXML
    private Label lblPrixDef;
    @FXML
    private AnchorPane mapPersonnageEquipage;
    @FXML
    private ImageView imagePersonnage1;
    @FXML
    private ImageView image2C;
    @FXML
    private ImageView image1C;
    @FXML
    private AnchorPane mapChangerPersonnage;
    @FXML
    private AnchorPane mapRecrutement;
    @FXML
    private ImageView imageRecrutementEnnemi;
    @FXML
    private ImageView imagePersonnage2;
    @FXML
    private ImageView imagePersonnage3;
    @FXML
    private ImageView imagePersonnage4;
    @FXML
    private ImageView image4C;
    @FXML
    private ImageView image3C;

    public void invisible(AnchorPane apCourante) {apCourante.setVisible(false);return;}
    public void visible(AnchorPane apCourante){apCourante.setVisible(true);return;}
    public int alea() { return (int)(Math.random() * 101 );}
    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////           PERSONNAGE          ///////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////

    Description luffyD = new Description("Luffy", "pirate/luffy.gif",
            100000,
            10000,
            10,
            0);
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
            10,
            100);
    Description aceD = new Description("Ace",
            "pirate/ace.gif",
            3000,
            200,
            200,
            50);
    Description frankyD = new Description("Franky",
            "pirate/franky.gif",
            4500,
            200,
            100,
            70);


    ////////////////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////           ENNEMIS          ///////////////////////////////////////////
    ///////////////////////////////////////////////////////////////////////////////////////////////////////


    Ennemis cobyE = new Ennemis("Coby", "pirate/coby.gif",
            1500,
            100,
            50,
            10,
            100);
    Description cobyD = new Description("Coby",
            "pirate/coby.gif",
            4000,
            300,
            100,
            50);
    Ennemis smokerE = new Ennemis("Smoker", "pirate/smoker.gif",
            2000,
            150,
            80,
            10,
            200);
    Description smokerD = new Description("Smoker",
            "pirate/smoker.gif",
            4000,
            300,
            100,
            50);
    Ennemis namiE = new Ennemis("Nami", "pirate/nami.gif",
            2500,
            200,
            100,
            10,
            300);
    Description namiD = new Description("Nami",
            "pirate/nami.gif",
            4000,
            300,
            100,
            50);
    Ennemis chopperE = new Ennemis("Chopper", "pirate/chopper.gif",
            3000,
            250,
            150,
            10,
            350);
    Ennemis brookE = new Ennemis("Brook", "pirate/brook.gif",
            3500,
            250,
            500,
            10,
            400);
    Ennemis robinE = new Ennemis("Robin", "pirate/robin.png",
            4000,
            250,
            300,
            10,
            450);
    Ennemis zoroE = new Ennemis("Zoro", "pirate/zoro.gif",
            4500,
            300,
            500,
            10,
            500);
    Ennemis enerE = new Ennemis("Ener", "pirate/ener.gif",
            5000,
            350,
            1000,
            10,
            600);




    Ennemis sentomaruE = new Ennemis("Sentomaru", "pirate/sentomaru.gif",
            4000,
            300,
            1000,
            10,
            600);
    Ennemis magellanE = new Ennemis("Magellan", "pirate/magellan.gif",
            4500,
            300,
            1100,
            10,
            650);
    Ennemis kakuE = new Ennemis("Kaku", "pirate/kaku.gif",
            5000,
            350,
            1200,
            10,
            700);
    Ennemis lucciE = new Ennemis("Lucci", "pirate/lucci.gif",
            6000,
            400,
            1400,
            10,
            750);
    Ennemis fujitoraE = new Ennemis("Fujitora", "pirate/fujitora.png",
            5500,
            400,
            1200,
            10,
            800);
    Ennemis kizaruE = new Ennemis("Kirzaru", "pirate/kizaru.gif",
            5500,
            450,
            10000,
            10,
            800);
    Ennemis aokijiE = new Ennemis("Aokiji", "pirate/aokiji.gif",
            55000,
            500,
            1300,
            10,
            800);
    Ennemis akainuE = new Ennemis("Akainu", "pirate/akainu.gif",
            7000,
            550,
            1500,
            10,
            1000);
    Ennemis garpE = new Ennemis("Garp", "pirate/garp.gif",
            7000,
            600,
            2000,
            10,
            1100);
    Ennemis sengokuE = new Ennemis("Sengoku", "pirate/sengoku.gif",
            8000,
            700,
            2500,
            10,
            1200);





    Ennemis foxyE = new Ennemis("Foxy", "pirate/foxy.gif",
            500,
            10,
            0,
            10,
            1);
    Ennemis morganE = new Ennemis("Morgan", "pirate/morgan.png",
            3000,
            1000,
            800,
            10,
            400);
    Ennemis monetE = new Ennemis("Monet", "pirate/monet.png",
            4000,
            1200,
            1000,
            10,
            500);
    Ennemis cesarE = new Ennemis("César", "pirate/cesar.png",
            5000,
            1100,
            1500,
            10,
            1000);
    Ennemis giantE = new Ennemis("Géant", "pirate/geant.png",
            6000,
            2000,
            2000,
            10,
            1100);
    Ennemis trebolE = new Ennemis("Trébol", "pirate/trebol.png",
            5000,
            1500,
            1500,
            10,
            1200);
    Ennemis doflamingoE = new Ennemis("Doflamingo", "pirate/doflamingo.gif",
            10000,
            3000,
            2000,
            10,
            1400);
    Ennemis jinbeE = new Ennemis("Jinbe", "pirate/jinbei.gif",
            8000,
            2000,
            3000,
            10,
            1400);
    Ennemis moriaE = new Ennemis("Moria", "pirate/moria.gif",
            7000,
            2000,
            4000,
            10,
            1400);
    Ennemis marcoE = new Ennemis("Marco", "pirate/marco.gif",
            10000,
            4000,
            7000,
            10,
            1500);
    Ennemis mihawkE = new Ennemis("Mihawk", "pirate/mihawk.gif",
            10000,
            5000,
            5000,
            10,
            1800);
    Ennemis shanksE = new Ennemis("Shanks", "pirate/shanks.gif",
            10000,
            10000,
            10000,
            10,
            2000);
    Ennemis shikiE = new Ennemis("Shiki", "pirate/shiki.gif",
            11000,
            11000,
            11000,
            10,
            2500);




    Ennemis orochiE = new Ennemis("Orochi", "pirate/orochi.png",
            11000,
            10000,
            10000,
            10,
            1000);
    Ennemis whoE = new Ennemis("Who's who", "pirate/who.png",
            11000,
            10000,
            10000,
            10,
            1000);
    Ennemis drakeE = new Ennemis("X-Drake", "pirate/drake.png",
            11000,
            10000,
            10000,
            10,
            1000);
    Ennemis sasakiE = new Ennemis("Sasaki", "pirate/sasaki.png",
            11000,
            10000,
            10000,
            10,
            1000);
    Ennemis blackmariaE = new Ennemis("Black Maria", "pirate/blackMaria.png",
            13000,
            12000,
            14000,
            10,
            1500);
    Ennemis yamatoE = new Ennemis("Yamato", "pirate/yamato.png",
            15000,
            15000,
            15000,
            10,
            3000);
    Ennemis jackE = new Ennemis("Jack", "pirate/jack.png",
            14000,
            14000,
            14000,
            10,
            4000);
    Ennemis queenE = new Ennemis("Queen", "pirate/queen.png",
            15000,
            15000,
            18000,
            10,
            4000);
    Ennemis kingE = new Ennemis("King", "pirate/king.png",
            18000,
            18000,
            18000,
            10,
            5000);
    Ennemis bigmomE = new Ennemis("Bigmom", "pirate/bigmom.png",
            19000,
            17000,
            19000,
            10,
            7000);
    Ennemis kaidoE = new Ennemis("Kaido", "pirate/kaido.png",
            20000,
            20000,
            20000,
            10,
            10000);



    Ennemis vascoE = new Ennemis("Vasco Shot", "pirate/vasco.png",
            18000,
            18000,
            18000,
            10,
            7000);
    Ennemis pizarroE = new Ennemis("Pizarro", "pirate/pizarro.png",
            18000,
            18000,
            18000,
            10,
            8000);
    Ennemis wasatsumiE = new Ennemis("Wadatsumi", "pirate/wadatsumi.png",
            18000,
            18000,
            18000,
            10,
            7000);
    Ennemis augurE = new Ennemis("Van augur", "pirate/augur.png",
            20000,
            20000,
            20000,
            10,
            8000);
    Ennemis devonE = new Ennemis("Devon", "pirate/devon.png",
            20000,
            20000,
            20000,
            10,
            9000);
    Ennemis burgessE = new Ennemis("Burgess", "pirate/burgess.png",
            20000,
            20000,
            20000,
            10,
            10000);
    Ennemis teachE = new Ennemis("Teach", "pirate/barbeNoir.gif",
            30000,
            30000,
            30000,
            10,
            15000);
    Ennemis vegapunkE = new Ennemis("Vegapunk", "pirate/vegapunk.png",
            40000,
            40000,
            40000,
            10,
            100000);
    Ennemis doyensE = new Ennemis("Les 5 doyens", "pirate/5doyen.png",
            100000,
            100000,
            100000,
            10,
            100000000);


    Ennemis imuE = new Ennemis("IMU", "pirate/imu.png",
            1000000,
            1000000,
            1000000,
            10,
            100000000);


    Description perso2 = new Description("","",
            0,
            0,
            0,
            0 );


    Description joueurD ;
    Ennemis e;
    int berryActuel = 1000000;
    int victoireTotal1 = 0;
    int place = 0;

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
            imageView.setImage(
                    new Image(
                            getClass().getResource(
                                    "/projetOP/logo/orbe.png"
                            ).toExternalForm()
                    )
            );
        } else {
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
        invisible(mapWin);
        invisible(mapLose);
        invisible(mapPersonnageEquipage);
        invisible(mapChangerPersonnage);
        invisible(mapRecrutement);
    }
    ////////////////////////////////////////////
    /////////////////// BOUTONS //////////////////
    @FXML
    public void clickedStart1(Event event) {
        clearAll();
        visible(mapChoixCapitaine);
        joueurD = luffyD;
        afficherPersonnage(luffyD);
        lblBerry1.setText(String.valueOf(berryActuel));
        lblBerry2.setText(String.valueOf(berryActuel));
        lblBerry3.setText(String.valueOf(berryActuel));
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
        changerBerry();
        if (joueurD.getFuite()==100){
            lblPrixFuite.setText("MAX");
        }
    }
    /////////////////////////////////////
    /////////////FONCTIONS////////////////
    /////////////////////////////////////
    int prixVie = 100;
    int prixAttaque = 100;
    int prixDefense = 100;
    int prixFuite = 100;

    public void augmentationPrixVie(){
        prixVie = prixVie + 100;
    }
    public void augmentationPrixAttaque(){
        prixAttaque = prixAttaque + 100;
    }
    public void augmentationPrixDefense(){
        prixDefense = prixDefense + 100;
    }
    public void augmentationPrixFuite(){
        prixFuite = prixFuite + 100;
    }
    public void changerText(Label lblTexte, int intTexte){
        lblTexte.setText(Integer.toString(intTexte));
    }
    public void changerVieCombat(){
        changerText(lblVieActuelleP, joueurD.getVieActuelle());
        changerText(lblVieActuelleE, e.getVieActuelle());
        lblVieD.setText(String.valueOf(joueurD.getVieActuelle()));
    }
    public void changerBerry(){
        changerText(lblBerry1, berryActuel);
        changerText(lblBerry2, berryActuel);
        changerText(lblBerry3, berryActuel);
        changerText(lblPrixVie, prixVie);
        changerText(lblPrixAtt, prixAttaque);
        changerText(lblPrixDef, prixDefense);
        changerText(lblPrixFuite, prixFuite);
    }
    public void ajoutBerry(int berry){
        berryActuel = berryActuel + berry;
        changerBerry();
    }
    public void impactGIF(ImageView imageView, String image){
        changeImageViewImg(imageView, image);
        imageView.setVisible(true);
        Timer chrono = new Timer();
        chrono.schedule(new TimerTask() {
            @Override
            public void run() {
                imageView.setVisible(false);
            }
        }, 400);
    }


    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////                    Amelioration           /////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////

    @FXML
    public void clickedPlusVie(Event event) {
        if(berryActuel>=prixVie){
            berryActuel= berryActuel-prixVie;
            augmentationPrixVie();
            changerBerry();
            joueurD.acheterVie();
            joueurD.setVieMax(joueurD.getVieMax());
            changerText(lblVieD, joueurD.getVieMax());
            changerText(lblVieActuelleP,joueurD.getVieMax());
            changerText(lblVieMaxP,joueurD.getVieMax());
            System.out.println(prixVie);
        }
    }

    @FXML
    public void clickedPlusAttaque(Event event) {
        if(berryActuel>=prixAttaque){
            berryActuel= berryActuel-prixAttaque;
            augmentationPrixAttaque();
            changerBerry();
            joueurD.acheterAttaque();
            joueurD.setAttaque(joueurD.getAttaque());
            changerText(lblAttaqueD, joueurD.getAttaque());
            System.out.println(prixAttaque);
        }
    }

    @FXML
    public void clickedPlusDefense(Event event) {
        if(berryActuel>=prixDefense){
            berryActuel= berryActuel-prixDefense;
            augmentationPrixDefense();
            System.out.println(prixDefense);
            changerBerry();
            joueurD.acheterDefense();
            joueurD.setDefense(joueurD.getDefense());
            changerText(lblDefenseD, joueurD.getDefense());
        }
    }

    @FXML
    public void clickedPlusFuite(Event event) {
        if (joueurD.getFuite() <100) {
            if(berryActuel>=prixFuite){
                berryActuel= berryActuel-prixFuite;
                augmentationPrixFuite();
                System.out.println(prixFuite);
                changerBerry();
                joueurD.acheterFuite();
                joueurD.setFuite(joueurD.getFuite());
                changerText(lblFuiteD, joueurD.getFuite());
                if (joueurD.getFuite()==100){
                    lblPrixFuite.setText("MAX");
                }
            }
        }
    }

    ////////////////////////////////////////////////////////////////////////////////////////////////
    ////////////////////////////////////////////////////////////////////////////////////////////
    /////////////////                    COMBAT           /////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////
    /////////////////////////////////////////////////////////////////////////////////////////


    @FXML
    public void clickedAttaque(Event event) {
        System.out.println("Degat :"+ joueurD.getAttaque());
        int auPif = alea();
        if (auPif<50){
            joueurD.vie(e.attaqueE());
            System.out.println("Ennemi Attaque");
            impactGIF(animationAttPersonnage, "logo/impact2.gif");
        }
        else {
            e.defenseE(joueurD.attaque());
            System.out.println("Ennemie Defend");
            impactGIF(animationDefEnnemi,"logo/bouclier.gif" );

        }
        e.vieE(joueurD.attaque());
        impactGIF(animationAttEnnemi, "logo/impact2.gif");
        changerVieCombat();
        mort();
        mortE();
    }

    @FXML
    public void clickedDefense(Event event) {
        System.out.println("Defense : "+ joueurD.getDefense());
        int auPif = alea();
        if (auPif<50){
            joueurD.defense(e.attaqueE());
            System.out.println("Ennemi Attaque mais degat divisé");
            impactGIF(animationAttPersonnage, "logo/impact2.gif");

        }
        else {
            System.out.println("Ennemie Defend donc rien ne se passe");
            impactGIF(animationDefEnnemi, "logo/bouclier.gif");
        }
        impactGIF(animationDefPersonnage, "logo/bouclier.gif");
        changerVieCombat();
        mort();
        mortE();
    }

    @FXML
    public void clickedFuite(Event event) {
        System.out.println("Fuite :"+ joueurD.getFuite());
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
        changerVieCombat();
        mort();
        mortE();
    }
    public boolean mort(){
        if (joueurD.getVieActuelle()<=0){
            clearAll();
            visible(mapLose);
            joueurD.setVieActuelle(joueurD.getVieMax());
            e.setVieActuelle(e.getVieMax());
            changerVieCombat();
            retirerBerry();
            changerBerry();
            lblBerryTot1.setText(String.valueOf(berryActuel));
            lblBerryRetirer.setText(String.valueOf(e.getBerryE()));
            return true;
        }
        return false;
    }
    public void retirerBerry(){
        berryActuel = berryActuel - e.getBerryE();
        if (berryActuel < 0){
            berryActuel = 0;
        }
    }
    public boolean mortE(){
        if (e.getVieActuelle()<=0){
            ajoutBerry(e.getBerryE());
            clearAll();
            visible(mapWin);
            joueurD.setVieActuelle(joueurD.getVieMax());
            changerVieCombat();
            lblBerryTot.setText(String.valueOf(berryActuel));
            lblBerryAjout.setText(String.valueOf(e.getBerryE()));
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
    @FXML
    public void clickedContinue(Event event) {
        clearAll();
        visible(mapRecrutement);
        changeImageViewImg(imageRecrutementEnnemi, "personnages/"+e.getImage());
        majInventaireEquipage();
        System.out.println("Victoire = "+victoireTotal1);
        System.out.println("Place = "+place);
    }

    @FXML
    public void clickedLose(Event event) {
        clearAll();
        visible(mapDebut);
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
    public void clickedChoixFranky(Event event) {
        afficherPersonnage(frankyD);
        joueurD = frankyD;
    }

    @FXML
    public void clickedChoixAce(Event event) {
        afficherPersonnage(aceD);
        joueurD =aceD;
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
        lblVieD.setText(String.valueOf(description.getVieActuelle()));
        lblAttaqueD.setText(String.valueOf(description.getAttaque()));
        lblDefenseD.setText(String.valueOf(description.getDefense()));
        lblFuiteD.setText(String.valueOf(description.getFuite()));
        lblNomD.setText(String.valueOf(description.getNom()));
        changeImageViewImg(imagePersonnage1, "personnages/"+description.getImage());
        changeImageViewImg(image1C, "personnages/"+description.getImage());
    }

    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    ///////////////////////////////////    ILES      /////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    //////////////////////////////////////////////////////////////////////////////////////////////
    public void afficherMapEtEnnemis(String image, Ennemis ennemis){
        clearAll();
        visible(mapCombat);
        changeImageViewImg(imageFond, image);
        e=ennemis;
        changeImageViewImg(imageEnnemis, "personnages/"+e.getImage() );
        afficherEnnemis(e);
    }
    //////////////////////
    //////    1    ///////
    //////////////////////
    @FXML
    public void clickedIle11(Event event) {
        if (victoireTotal1 ==0){
            afficherMapEtEnnemis("map/bonFondCombat1.gif", cobyE);
        }
    }
    @FXML
    public void clickedIle12(Event event) {
        if (victoireTotal1 ==1){
            afficherMapEtEnnemis("map/bonFondCombat24.gif", smokerE);
        }
    }
    @FXML
    public void clickedIle13(Event event) {
        if (victoireTotal1 ==2){
            afficherMapEtEnnemis("map/bonFondCombat13.gif",namiE);
        }
    }



    @FXML
    public void clickedIle14(Event event) {
        if (victoireTotal1 ==3){
            afficherMapEtEnnemis("map/bonFondCombat16.gif", chopperE);
        }
    }

    @FXML
    public void clickedIle15(Event event) {
        if (victoireTotal1 ==4){
            afficherMapEtEnnemis("map/bonFondCombat8.gif", brookE);
        }
    }

    @FXML
    public void clickedIle16(Event event) {
        if (victoireTotal1 ==5){
            afficherMapEtEnnemis("map/bonFondCombat9.gif", robinE);
        }
    }
    @FXML
    public void clickedIle17(Event event) {
        if (victoireTotal1 ==6){
            afficherMapEtEnnemis("map/bonFondCombat2.gif", zoroE);
        }
    }
    @FXML
    public void clickedIle18(Event event) {
        if (victoireTotal1 ==7){
            afficherMapEtEnnemis("map/bonFondCombat11.gif",enerE);
        }
    }
    //////////////////////
    //////    2    ///////
    //////////////////////

    @FXML
    public void clickedIle21(Event event) {
        if (victoireTotal1 ==8){
            afficherMapEtEnnemis("map/bonFondCombat14.gif",sentomaruE);
        }
    }

    @FXML
    public void clickedIle22(Event event) {
        if (victoireTotal1 ==9){
            afficherMapEtEnnemis("map/bonFondCombat5.gif",magellanE);
        }
    }
    @FXML
    public void clickedIle23(Event event) {
        if (victoireTotal1 ==10){
            afficherMapEtEnnemis("map/bonFondCombat13.gif",kakuE);
        }
    }
    @FXML
    public void clickedIle24(Event event) {
        if (victoireTotal1 ==11){
            afficherMapEtEnnemis("map/bonFondCombat9.gif",lucciE);
        }
    }
    @FXML
    public void clickedIle25(Event event) {
        if (victoireTotal1 ==12){
            afficherMapEtEnnemis("map/bonFondCombat10.gif",fujitoraE);
        }
    }
    @FXML
    public void clickedIle26(Event event) {
        if (victoireTotal1 ==13){
            afficherMapEtEnnemis("map/bonFondCombat12.gif",kizaruE);
        }
    }
    @FXML
    public void clickedIle27(Event event) {
        if (victoireTotal1 ==14){
            afficherMapEtEnnemis("map/bonFondCombat16.gif",aokijiE);
        }
    }
    @FXML
    public void clickedIle28(Event event) {
        if (victoireTotal1 ==15){
            afficherMapEtEnnemis("map/bonFondCombat3.gif",akainuE);
        }
    }
    @FXML
    public void clickedIle29(Event event) {
        if (victoireTotal1 ==16){
            afficherMapEtEnnemis("map/bonFondCombat24.gif",garpE);
        }
    }

    @FXML
    public void clickedIle210(Event event) {
        if (victoireTotal1 ==17){
            afficherMapEtEnnemis("map/bonFondCombat14.gif",sengokuE);
        }
    }
    //////////////////////
    //////    3    ///////
    //////////////////////
    @FXML
    public void clickedIle31(Event event) {
        if (victoireTotal1 ==18){
            afficherMapEtEnnemis("map/bonFondCombat15.gif",foxyE);
        }
    }
    @FXML
    public void clickedIle32(Event event) {
        if (victoireTotal1 ==19){
            afficherMapEtEnnemis("map/bonFondCombat13.gif",morganE);
        }
    }
    @FXML
    public void clickedIle33(Event event) {
        if (victoireTotal1 ==20){
            afficherMapEtEnnemis("map/bonFondCombat16.gif",monetE);
        }
    }
    @FXML
    public void clickedIle34(Event event) {
        if (victoireTotal1 ==21){
            afficherMapEtEnnemis("map/bonFondCombat6.gif",cesarE);
        }
    }
    @FXML
    public void clickedIle35(Event event) {
        if (victoireTotal1 ==22){
            afficherMapEtEnnemis("map/bonFondCombat17.gif",giantE);
        }
    }
    @FXML
    public void clickedIle36(Event event) {
        if (victoireTotal1 ==23){
            afficherMapEtEnnemis("map/bonFondCombat1.gif",trebolE);
        }
    }
    @FXML
    public void clickedIle37(Event event) {
        if (victoireTotal1 ==24){
            afficherMapEtEnnemis("map/bonFondCombat23.gif",doflamingoE);
        }
    }
    @FXML
    public void clickedIle38(Event event) {
        if (victoireTotal1 ==25){
            afficherMapEtEnnemis("map/bonFondCombat9.gif",jinbeE);
        }
    }
    @FXML
    public void clickedIle39(Event event) {
        if (victoireTotal1 ==26){
            afficherMapEtEnnemis("map/bonFondCombat8.gif",moriaE);
        }
    }
    @FXML
    public void clickedIle310(Event event) {
        if (victoireTotal1 ==27){
            afficherMapEtEnnemis("map/bonFondCombat11.gif",marcoE);
        }
    }
    @FXML
    public void clickedIle311(Event event) {
        if (victoireTotal1 ==28){
            afficherMapEtEnnemis("map/bonFondCombat7.gif",mihawkE);
        }
    }
    @FXML
    public void clickedIle312(Event event) {
        if (victoireTotal1 ==29){
            afficherMapEtEnnemis("map/bonFondCombat23.gif",shanksE);
        }
    }
    @FXML
    public void clickedIle313(Event event) {
        if (victoireTotal1 ==30){
            afficherMapEtEnnemis("map/bonFondCombat4.gif",shikiE);
        }
    }
    //////////////////////
    //////    4    ///////
    //////////////////////

    @FXML
    public void clickedIle41(Event event) {
        if (victoireTotal1 ==31){
            afficherMapEtEnnemis("map/bonFondCombat13.gif",orochiE);
        }
    }
    @FXML
    public void clickedIle42(Event event) {
        if (victoireTotal1 ==32){
            afficherMapEtEnnemis("map/bonFondCombat15.gif",whoE);
        }
    }
    @FXML
    public void clickedIle43(Event event) {
        if (victoireTotal1 ==33){
            afficherMapEtEnnemis("map/bonFondCombat18.gif",drakeE);
        }
    }
    @FXML
    public void clickedIle44(Event event) {
        if (victoireTotal1 ==34){
            afficherMapEtEnnemis("map/bonFondCombat12.gif",sasakiE);
        }
    }
    @FXML
    public void clickedIle45(Event event) {
        if (victoireTotal1 ==35){
            afficherMapEtEnnemis("map/bonFondCombat19.gif",blackmariaE);
        }
    }
    @FXML
    public void clickedIle46(Event event) {
        if (victoireTotal1 ==36){
            afficherMapEtEnnemis("map/bonFondCombat4.gif",yamatoE);
        }
    }
    @FXML
    public void clickedIle47(Event event) {
        if (victoireTotal1 ==37){
            afficherMapEtEnnemis("map/bonFondCombat6.gif",jackE);
        }
    }
    @FXML
    public void clickedIle48(Event event) {
        if (victoireTotal1 ==38){
            afficherMapEtEnnemis("map/bonFondCombat15.gif",queenE);
        }
    }
    @FXML
    public void clickedIle49(Event event) {
        if (victoireTotal1 ==39){
            afficherMapEtEnnemis("map/bonFondCombat23.gif",kingE);
        }
    }
    @FXML
    public void clickedIle410(Event event) {
        if (victoireTotal1 ==40){
            afficherMapEtEnnemis("map/bonFondCombat17.gif",bigmomE);
        }
    }
    @FXML
    public void clickedIle411(Event event) {
        if (victoireTotal1 ==41){
            afficherMapEtEnnemis("map/bonFondCombat21.gif",kaidoE);
        }
    }
    //////////////////////
    //////    5    ///////
    //////////////////////
    @FXML
    public void clickedIle51(Event event) {
        if (victoireTotal1 ==42){
            afficherMapEtEnnemis("map/bonFondCombat2.gif",vascoE);
        }
    }
    @FXML
    public void clickedIle52(Event event) {
        if (victoireTotal1 ==43){
            afficherMapEtEnnemis("map/bonFondCombat19.gif",pizarroE);
        }
    }
    @FXML
    public void clickedIle53(Event event) {
        if (victoireTotal1 ==44){
            afficherMapEtEnnemis("map/bonFondCombat10.gif",wasatsumiE);
        }
    }
    @FXML
    public void clickedIle54(Event event) {
        if (victoireTotal1 ==45){
            afficherMapEtEnnemis("map/bonFondCombat18.gif",augurE);
        }
    }
    @FXML
    public void clickedIle55(Event event) {
        if (victoireTotal1 ==46){
            afficherMapEtEnnemis("map/bonFondCombat15.gif",devonE);
        }
    }
    @FXML
    public void clickedIle56(Event event) {
        if (victoireTotal1 ==47){
            afficherMapEtEnnemis("map/bonFondCombat14.gif",burgessE);
        }
    }
    @FXML
    public void clickedIle57(Event event) {
        if (victoireTotal1 ==48){
            afficherMapEtEnnemis("map/bonFondCombat12.gif",teachE);
        }
    }
    @FXML
    public void clickedIle58(Event event) {
        if (victoireTotal1 ==49){
            afficherMapEtEnnemis("map/bonFondCombat18.gif",vegapunkE);
        }
    }
    @FXML
    public void clickedIle59(Event event) {
        if (victoireTotal1 ==50){
            afficherMapEtEnnemis("map/bonFondCombat4.gif",doyensE);
        }
    }
    //////////////////////
    //////    BOSS    ///////
    //////////////////////
    @FXML
    public void clickedIleBoss(Event event) {
        if (victoireTotal1 ==51){
            afficherMapEtEnnemis("map/bonFondCombat20.gif",imuE);
        }
    }

    /////////////////////////
    ///////////MODIFICATION/////
    ////////////////////////////

    @FXML
    public void clickedInventaireEquipage(Event event) {
        clearAll();
        visible(mapPersonnageEquipage);
    }

    @FXML
    public void clickedRetourInventaire(Event event) {
        clearAll();
        visible(mapEquipage);
    }

    @FXML
    public void clickedInventaireCombat(Event event) {
        clearAll();
        visible(mapChangerPersonnage);
    }
    private Description temp;
    @FXML
    public void clickedSelect2(Event event) {
        clearAll();
        visible(mapCombat);
        temp = joueurD;
        joueurD = perso2;
        perso2 = temp;
        afficherPersonnage(joueurD);
        changeImageViewImg(image2C, "personnages/"+perso2.getImage());

    }

    @FXML
    public void clickedSelect1(Event event) {
        clearAll();
        visible(mapCombat);
    }

    @FXML
    public void clickedNon(Event event) {
        clearAll();
        visible(mapCarte);
    }

    @FXML
    public void clickedOui(Event event) {
        place +=1;
        clearAll();
        visible(mapCarte);
        if (victoireTotal1 == 1){
            if (place == 1){
                perso2 = cobyD;
                majParPlace(perso2, image2C, imagePersonnage2);
            }
        }
        if (victoireTotal1 == 2){
            if (place == 1){
                perso2 = smokerD;
                majParPlace(perso2, image2C, imagePersonnage2);
            }
        }
    }
    public void majInventaireEquipage(){
        changeImageViewImg(imagePersonnage1,"personnages/"+joueurD.getImage());
        changeImageViewImg(imagePersonnage2,"personnages/"+perso2.getImage());
    }
    public void majParPlace(Description description, ImageView image1, ImageView image2){
        changeImageViewImg(image1, "personnages/"+description.getImage());
        changeImageViewImg(image2, "personnages/"+description.getImage());
    }

    @FXML
    public void clickedPersonnage2(Event event) {
        if (place >=1){
            temp = joueurD;
            joueurD = perso2;
            perso2 = temp;
            afficherPersonnage(joueurD);
            changeImageViewImg(imagePersonnage2, "personnages/"+perso2.getImage());
            changeImageViewImg(image2C, "personnages/"+perso2.getImage());
        }
    }
}