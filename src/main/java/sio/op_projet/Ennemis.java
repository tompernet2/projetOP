package sio.op_projet;

public class Ennemis {
    private String nom;
    private String image;
    private int vieMax;
    private int vieActuelle;
    private int attaque;
    private int defense;

    public Ennemis(String nom, String image, int vieMax, int attaque, int defense) {
        this.nom = nom;
        this.image = image;
        this.vieMax = vieMax;
        this.vieActuelle = vieMax;
        this.attaque = attaque;
        this.defense = defense;
    }
    public int vieE(int degat){
        this.vieActuelle-=degat;
        return degat;
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

}
