package com.simon.Formulaire;

import com.simon.Classepersonnage.Guerrier;
import com.simon.Classepersonnage.Magicien;
import com.simon.Classepersonnage.Personnage;
import com.simon.Classepersonnage.Rodeur;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class CreationPersonnage {
    public String Nom;

    public CreationPersonnage(String nom) {
        Nom = nom;
    }

    public Personnage Choixclasse(){
        int i;
        Personnage player = null;
        do {
            i=0;
            System.out.println("Création du personnage du Joueur" + Nom +"\n" +  " Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3: Magicien)");
            int Classe = rentrerunevaleur(1,3," une Classe");
             if(Classe==1) {
                 player = new Guerrier();

             }
             else if(Classe==2) {
                 player= new Rodeur();

             }
             else if(Classe==3) {
                 player = new Magicien();

             }
             else{
                 i=1;
                    System.out.println("Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3: Magicien)");
            }
        }while(i>0);
        player.setNomJoueur(Nom);
        return player;
    }




    /*Fixe les caractéristiques*/
    public void ChoixCaractéristiques(Personnage playeur) {
        int i=0;
        do{
            if (i>0){
                System.out.println("La somme de la Force, l'Agilité et de l'intelligence doit valoir le Niveau du personnage");
            }
            System.out.println("Niveau du personnage ?");
            int a=rentrerunevaleur(1,100,"une Niveau");
            playeur.setNiveau(a);
            playeur.setVie(a*5);
            System.out.println("Force du personnage ?");
            playeur.setForce(rentrerunevaleur(0,100,"une Force"));
            System.out.println("Agilite du personnage ?");
            playeur.setAgilite(rentrerunevaleur(0,100,"une Agilité"));
            System.out.println("Intelligence du personnage ?");
            playeur.setIntelligence(rentrerunevaleur(0,100,"une intelligence"));
            i++;
        }while(playeur.getNiveau()!=playeur.getAgilite()+playeur.getForce()+playeur.getIntelligence() && playeur.getNiveau()>0 && playeur.getForce()>0 && playeur.getAgilite()>0);
    playeur.phrase(playeur.getPhrase());
    }

public int rentrerunevaleur( int borneinf, int bornesup, String caracteristique){
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
}