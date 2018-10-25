package com.simon.Classepersonnage;

public class Personnage {
    private String NomJoueur;
    private int Niveau;
    private int Vie;
    private int Force;
    private int Agilite;
    private int Intelligence;
    private String Phrase;

    public String getPhrase() {
        return Phrase;
    }

    public void setPhrase(String phrase) {
        Phrase = phrase;
    }

    public Personnage() {
    }


    public void attaquebasique(Personnage playerat){
    }
    public void attaquespecial(Personnage playerat){
    }
    public void phrase(String entete){
        System.out.println(entete +"Joueur "+getNomJoueur()+" niveau "+getNiveau()+" je possède "+ getVie()+" de vitalité, "+getForce()+" de force "+getAgilite()+" d'agilité et "+getIntelligence()+" d'intelligence !");
    }



    public int getNiveau() {
        return Niveau;
    }

    public void setNiveau(int niveau) {
       Niveau=niveau;
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
            Intelligence=intelligence;
    }

    public String getNomJoueur() {
        return NomJoueur;
    }

    public void setNomJoueur(String nomJoueur) {
        NomJoueur = nomJoueur;
    }
}
