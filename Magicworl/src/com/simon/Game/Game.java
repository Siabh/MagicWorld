package com.simon.Game;

import com.simon.Classepersonnage.Personnage;
import com.simon.Formulaire.CreationPersonnage;

public class Game {


    public void tour(Personnage playeur, Personnage playeur2){
        System.out.println("Joueur"+playeur.getNomJoueur()+"("+playeur.getVie()+" Vitalité) veuillez choisir votre action (1:Attaque Basique 2: Attaque spéciale)");
        int a=playeur.rentrerunevaleur(1,2,"une Attaque");
        if(a==1){
            playeur.attaquebasique(playeur2);
        }
        else{
            playeur.attaquespecial(playeur2);
        }
    }

    public void partie() {
        Personnage Joueur1 = new CreationPersonnage().Creation("1");
        Personnage Joueur2 = new CreationPersonnage().Creation("2");
        int tourdejeu=0;
        while (Joueur1.getVie() > 0 && Joueur2.getVie() > 0) {
            if (tourdejeu%2==0) {
                tour(Joueur1, Joueur2);
            }
            else {
                tour(Joueur2, Joueur1);
            }
            tourdejeu++;
        }
        if (Joueur1.getVie() <= 0) {
            System.out.println("Joueur1 a perdu !");
        }
        if (Joueur2.getVie() <= 0) {
            System.out.println("Joueur2 a perdu !");
        }
    }
}
