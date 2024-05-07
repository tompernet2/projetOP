package sio.op_projet;

import javafx.scene.Node;

public class Description extends Node {
    private String nom;
    private String image;
    private int vieMax;
    private int vieActuelle;
    private int attaque;
    private int defense;
    private int fuite;

    public Description(String nom, String image, int vieMax, int attaque, int defense, int fuite) {
        this.nom = nom;
        this.image = image;
        this.vieMax = vieMax;
        this.vieActuelle = vieMax;
        this.attaque = attaque;
        this.defense = defense;
        this.fuite = fuite;
    }
    public int alea() { return (int)(Math.random() * 101 );}
    public int attaque(){
        return this.attaque;
    }
    public int getVieMax() {
        return vieMax;
    }
    public int defense(int att){
        int degatsReduits = att-this.defense;
        if (degatsReduits > 0) {
            this.vieActuelle -= degatsReduits;
            return degatsReduits;
        } else {
            return 0;
        }
    }
    public boolean fuite(){
        if (alea()<= this.fuite){
            return true;
        }
        return false;
    }
    public int vie(int att){
        this.vieActuelle -=  att;
        if (this.vieActuelle<0){
            this.vieActuelle=0;
        }
        return att;
    }
    public void acheterVie(){
        this.vieMax = (int) (this.vieMax +500);
    }
    public void acheterAttaque(){
        this.attaque = (int) (this.attaque +500);
    }
    public void acheterDefense(){
        this.defense = (int) (this.defense +500);
    }
    public void acheterFuite(){
        this.fuite = (int) (this.fuite +5);
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

    @Override
    public Node getStyleableNode() {
        return super.getStyleableNode();
    }
}
