package sio.op_projet;

public class Personnage {
    private String nom;
    private Description description;
    private int vieMax;
    private int vieActuelle;
    private int attaque;
    private int defense;
    private int fuite;

    public Personnage(Description description) {
        this.description= description;
        this.vieActuelle = vieMax;
    }
    public int alea() { return (int)(Math.random() * 101 );}
    public int attaque(){
        return this.attaque;
    }
    public int defense(int att){
        int nbAleatoire=alea();
        if(nbAleatoire<=33){
            att=0;
            return att;
        }
        return att;
    }
    public boolean fuite(){
        if (alea()>= this.fuite){
            return true;
        }
        return false;
    }
    public int vie(int att){
        this.vieActuelle -=  att;
        return att;
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

    public Description getDescription() {
        return description;
    }

    public void setDescription(Description description) {
        this.description = description;
    }
}
