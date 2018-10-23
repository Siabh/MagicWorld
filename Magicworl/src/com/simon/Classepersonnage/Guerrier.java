package com.simon.Classepersonnage;

public class Guerrier extends Personnage {


    @Override
    public int attaquebasique(int Numplayerat) {
        System.out.println("Joueur "+ getNumerojoueur()+" utilise coup d'épée et inflige "+ getForce() +"dommages.");
        System.out.println("Joueur "+Numplayerat+" perd"+ getForce() +" points de vie");
        return-getForce();
    }

    @Override
    public int[] attaquespecial( int Numplayeur) {
        int degats []={-2*getForce(),-getForce()/2};
        System.out.println("Joueur "+ getNumerojoueur()+" utilise Coup de rage "+ 2*getForce() +"dommages.");
        System.out.println("Joueur "+Numplayeur+" perd"+ 2*getForce() +" points de vie");
        return degats;
    }
}
