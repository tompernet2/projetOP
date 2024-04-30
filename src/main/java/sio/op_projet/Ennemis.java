package sio.op_projet;

public class Ennemis {
    private String nom;
    private String image;
    private int vieMax;
    private int vieActuelle;
    private int attaque;
    private int defense;
    private int fuite;
    private int berryE;
    private int id;

    public Ennemis(String nom, String image, int vieMax, int attaque, int defense, int fuite,int berryE) {
        this.nom = nom;
        this.image = image;
        this.vieMax = vieMax;
        this.vieActuelle = vieMax;
        this.attaque = attaque;
        this.defense = defense;
        this.fuite = fuite;
        this.berryE = berryE;
    }
    public int vieE(int degat){
        this.vieActuelle-=degat;
        if (this.vieActuelle<=0){
            this.vieActuelle=0;
        }
        return degat;
    }
    public int defenseE(int att){
        int degatsReduits = att-this.defense;
        if (degatsReduits > 0) {
            this.vieActuelle -= degatsReduits;
            return degatsReduits;
        } else {
            return 0;
        }
    }
    public int attaqueE(){
        return this.attaque;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getVieMax() {
        return vieMax;
    }

    public void setVieMax(int vieMax) {
        this.vieMax = vieMax;
    }

    public int getVieActuelle() {
        return vieActuelle;
    }

    public void setVieActuelle(int vieActuelle) {
        this.vieActuelle = vieActuelle;
    }

    public int getAttaque() {
        return attaque;
    }

    public void setAttaque(int attaque) {
        this.attaque = attaque;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }

    public int getFuite() {
        return fuite;
    }

    public void setFuite(int fuite) {
        this.fuite = fuite;
    }

    public int getBerryE() {
        return berryE;
    }

    public void setBerryE(int berryE) {
        this.berryE = berryE;
    }
}
