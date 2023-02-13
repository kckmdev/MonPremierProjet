package com.btssio.ozenne;

public class Personnage {

    private String nom;
    private int pointVie;
    private int positionX, positionY;
    private Arme arme;





    public Personnage(String c_nom, Arme c_arme) {
        // Les valeurs par défault
        this.positionX = 0;
        this.positionY = 0;
        this.pointVie = 100;
        // Les arguements
        this.nom = c_nom;
        this.arme = c_arme;
    }

    //Getters et Setters
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Arme getArme() {
        return this.arme;
    }

    public void setArme(Arme arme) {
        this.arme = arme;
    }

    public int getPointVie() {
        return pointVie;
    }

    public int getPositionX() {
        return positionX;
    }

    public int getPositionY() {
        return positionY;
    }



    // méthodes
    public void attaquerUnAdversaire(Personnage victime, int de) {
        victime.recevoirDegat(de);
        int degatAttaque=10*de;
        System.out.println("Ton attaque a infligé "+degatAttaque+" à "+victime.getNom()+" !");
    }

    public boolean enVie() {
        if (this.pointVie>0)
            return true;    // return true si il est en vie don si pointVie > 0
        else
            return false;   // return false si pointVie <= 0
    }

    public void recevoirDegat(int nombre) {
        this.pointVie -= 10*nombre;
        System.out.println(this.getNom()+" a été blessé ! Points de vie restants : "+this.pointVie);
    }

    public void bouger() {

    }
    public void sePresenter() {
        System.out.println("\nSalut, mon nom est "+this.nom);
    }

    public static void main(String[] args) {

        Arme epee = new Arme("épée");
        Personnage Personnage1 = new Personnage("Sultana", epee);
        Personnage1.sePresenter();
        System.out.println(Personnage1.getArme());
        System.out.println(Personnage1.getPointVie());
        System.out.println(Personnage1.enVie());
        Personnage1.recevoirDegat(10);
        System.out.println(Personnage1.enVie());



    }

}
