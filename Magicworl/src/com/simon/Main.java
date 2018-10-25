package com.simon;

import com.simon.Classepersonnage.Personnage;
import com.simon.Formulaire.CreationPersonnage;

public class Main {

    public static void main(String[] args) {
	// write your code here
        CreationPersonnage NouvellePartie =new CreationPersonnage("1");

        Personnage player=NouvellePartie.Choixclasse();
        NouvellePartie.ChoixCaractéristiques(player);
    }
}
