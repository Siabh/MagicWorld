package com.simon.Classepersonnage;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Personnage {
    private String NomJoueur;
    private int Niveau;
    private int Vie;
    private int Force;
    private int Agilite;
    private int Intelligence;
    private String Phrase;

    public Personnage() {
    }

    public void mort(){
        if(getVie()<=0){
            System.out.println("Joueur"+getNomJoueur()+" est mort");
        }
    }
    public int rentrerunevaleur( int borneinf, int bornesup, String caracteristique){
        //méthode qui retourne un entier compris entre les bornes pour une caractéristique donnée et catchant les exeptions
        int condition=0;
        int  a=0;
        do {
            a=0;
            do {
                Scanner sc = new Scanner(System.in);
                try {
                    a=sc.nextInt();
                    condition = 0;
                } catch (InputMismatchException e) {
                    System.out.println("Veuillez mettre " + caracteristique + " compris entre " + borneinf + " et " + bornesup);
                    condition = 1;
                }
            }while(condition>0);
            if(a>bornesup || a<borneinf) {
                condition=1;
            }
        }while(condition>0);
        return a;
    }


    public void attaquebasique(Personnage playerat){
        //attaque basique sur le joueur Playeurat
    }
    public void attaquespecial(Personnage playerat){
        //attaque special sur le joueur Playeurat
    }
    public void phrase(String entete){
        //entete personnalisé de chaque classe
        System.out.println(entete +"Joueur "+getNomJoueur()+" niveau "+getNiveau()+" je possède "+ getVie()+" de vitalité, "+getForce()+" de force "+getAgilite()+" d'agilité et "+getIntelligence()+" d'intelligence !");
    }

    public String getPhrase() {
        return Phrase;
    }

    public void setPhrase(String phrase) {
        Phrase = phrase;
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
