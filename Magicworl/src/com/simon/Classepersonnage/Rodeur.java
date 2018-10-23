package com.simon.Classepersonnage;

public class Rodeur extends Personnage {
    @Override
    public int attaquebasique(int Numplayeur) {
        System.out.println("Joueur "+ getNumerojoueur()+"utilise Tir à l'arc et inflige"+ getAgilite() +"dommages.");
        System.out.println("Joueur "+Numplayeur+" perd"+ getAgilite()+" points de vie");
        return-getAgilite();
    }

    @Override
    public int[] attaquespecial( int Numplayeur) {
        int degats []={0};
        System.out.println("Joueur "+ getNumerojoueur()+" utilise Concentration et gagne"+ getNiveau()/2 +" en agilité.");
        setAgilite(getAgilite()+getNiveau()/2);
        return degats;
    }
}
