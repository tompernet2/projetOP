package sio.op_projet;

public class Description {
    private String nom;
    private String image;
    private String description;
    private int vieMax;
    private int vieActuelle;
    private int attaque;
    private int defense;
    private int fuite;

    public Description(String nom, String image, String description, int vieMax, int attaque, int defense, int fuite) {
        this.nom = nom;
        this.image = image;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
