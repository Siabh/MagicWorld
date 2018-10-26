package com.simon.Formulaire;

import com.simon.Classepersonnage.Guerrier;
import com.simon.Classepersonnage.Magicien;
import com.simon.Classepersonnage.Personnage;
import com.simon.Classepersonnage.Rodeur;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class CreationPersonnage {
    public Personnage Creation(String Nomdujoueur){
        return ChoixCaractéristiques(Choixclasse(Nomdujoueur));
    }


    public Personnage Choixclasse(String Nom){
        int i;
        Personnage player= new Personnage();
        do {
            i=0;
            System.out.println("Création du personnage du Joueur" + Nom +"\n" +  " Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3: Magicien)");
            int Classe = player.rentrerunevaleur(1,3," une Classe");
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
    public Personnage ChoixCaractéristiques(Personnage playeur) {
        int i=0;
        do{
            if (i>0){
                System.out.println("La somme de la Force, l'Agilité et de l'intelligence doit valoir le Niveau du personnage");
            }
            System.out.println("Niveau du personnage ?");
            int a=playeur.rentrerunevaleur(1,100,"une Niveau");
            playeur.setNiveau(a);
            playeur.setVie(a*5);
            System.out.println("Force du personnage ?");
            playeur.setForce(playeur.rentrerunevaleur(0,100,"une Force"));
            System.out.println("Agilite du personnage ?");
            playeur.setAgilite(playeur.rentrerunevaleur(0,100,"une Agilité"));
            System.out.println("Intelligence du personnage ?");
            playeur.setIntelligence(playeur.rentrerunevaleur(0,100,"une intelligence"));
            i++;
        }while(playeur.getNiveau()!=playeur.getAgilite()+playeur.getForce()+playeur.getIntelligence() && playeur.getNiveau()>0 && playeur.getForce()>0 && playeur.getAgilite()>0);
    playeur.phrase(playeur.getPhrase());
    return playeur;
    }


}