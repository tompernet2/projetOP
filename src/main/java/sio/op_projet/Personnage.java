package sio.op_projet;

public class Personnage {
    private String nom;
    private Description description;
    private int vieMax;
    private int vieActuelle;
    private int attaque;
    private int defense;
    private int soin;

    public Personnage(String nom, int vieMax, int vieActuelle, int attaque, int defense, int soin) {
        this.nom = nom;
        this.vieMax = vieMax;
        this.vieActuelle = vieActuelle;
        this.attaque = attaque;
        this.defense = defense;
        this.soin = soin;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public int getSoin() {
        return soin;
    }

    public void setSoin(int soin) {
        this.soin = soin;
    }

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
