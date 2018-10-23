package com.simon.Formulaire;

import com.simon.Classepersonnage.Guerrier;
import com.simon.Classepersonnage.Magicien;
import com.simon.Classepersonnage.Personnage;
import com.simon.Classepersonnage.Rodeur;

import java.util.Scanner;
import java.util.concurrent.RecursiveTask;

public class CreationPersonnage {
    public int Numerojoueur;

    public CreationPersonnage(int numerojoueur) {
        Numerojoueur = numerojoueur;
    }

    public Personnage Choixclasse(){
        int i;
        Personnage player = null;
        do {
            i=0;
            System.out.println("Création du personnage du Joueur" + Numerojoueur +"\n" +  " Veuillez choisir la classe de votre personnage (1 : Guerrier, 2 : Rôdeur, 3: Magicien)");
            Scanner sc = new Scanner(System.in);
            int Classe = sc.nextInt();
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
        Scanner sc = new Scanner(System.in);
        playeur.setNiveau(sc.nextInt());
        System.out.println("Force du personnage ?");
        Scanner sc1 = new Scanner(System.in);
        playeur.setForce(sc1.nextInt());
        System.out.println("Agilite du personnage ?");
        Scanner sc2 = new Scanner(System.in);
        playeur.setAgilite(sc2.nextInt());
        System.out.println("Intelligence du personnage ?");
        Scanner sc3 = new Scanner(System.in);
        playeur.setIntelligence(sc3.nextInt());
        i++;
        }while(playeur.getNiveau()!=playeur.getAgilite()+playeur.getForce()+playeur.getIntelligence());
    }
}
