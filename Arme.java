package com.btssio.ozenne;

public class Arme {


    private String nomArme;
    private int degat;



    public Arme(String nom) {
        super();
        this.degat = 10;
        this.nomArme = nom;

    }




    //Getters et Setters
    public String getNomArme() {
        return nomArme;
    }

    public void setNomArme(String nomArme) {
        this.nomArme = nomArme;
    }

    public int getDegat() {
        return degat;
    }

    public void setDegat(int degat) {
        this.degat = degat;
    }




    public static void main(String[] args) {

    }

}