package com.simon.Classepersonnage;

public class Magicien extends Personnage {

    @Override
    public int attaquebasique(int Numplayeur) {
        System.out.println("Joueur "+ getNumerojoueur()+" utilise Boule de Feu et inflige "+ getIntelligence() +"dommages.");
        System.out.println("Joueur "+Numplayeur+" perd"+ getIntelligence()+" points de vie");
        return-getIntelligence();
    }

    @Override
    public int[] attaquespecial( int Numplayeur) {
        int degats []={0};
        System.out.println("Joueur "+ getNumerojoueur()+" utilise Soin et gagne"+ 2*getIntelligence() +" en vitalité.");
        setVie(getVie()+2*getIntelligence());
        return degats;
    }
}
