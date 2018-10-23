package com.simon.Classepersonnage;

public class Personnage {
    private int Numerojoueur;
    private int Niveau;
    private int Vie;
    private int Force;
    private int Agilite;
    private int Intelligence;


    public int attaquebasique(int Numplayerat){
        return 0;
    }
    public int[] attaquespecial(int Numplayerat){
        return new int[]{0};
    }
    public int getNumerojoueur() {
        return Numerojoueur;
    }

    public void setNumerojoueur(int numerojoueur) {
        Numerojoueur = numerojoueur;
    }

    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int niveau) {
        Niveau = niveau;
    }

    public int getVie() {
        return Vie;
    }

    public void setVie(int vie) {
        Vie = vie;
    }

    public int getForce() {
        return Force;
    }

    public void setForce(int force) {
        Force = force;
    }

    public int getAgilite() {
        return Agilite;
    }

    public void setAgilite(int agilite) {
        Agilite = agilite;
    }

    public int getIntelligence() {
        return Intelligence;
    }

    public void setIntelligence(int intelligence) {
        Intelligence = intelligence;
    }
}
