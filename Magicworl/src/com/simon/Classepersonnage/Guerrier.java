package com.simon.Classepersonnage;

public class Guerrier extends Personnage {


    @Override
    public void attaquebasique(Personnage playerat) {
        System.out.println("Joueur "+ getNomJoueur()+" utilise coup d'épée et inflige "+ getForce() +"dommages.");
        System.out.println("Joueur "+playerat.getNomJoueur()+" perd"+ getForce() +" points de vie");
        playerat.setVie(playerat.getVie()-getForce());
    }

    @Override
    public String getPhrase() {
        return "Woarg je suis le Guerrier";
    }

    @Override
    public void attaquespecial(Personnage playerat) {
        System.out.println("Joueur "+ getNomJoueur()+" utilise Coup de rage "+ 2*getForce() +"dommages.");
        System.out.println("Joueur "+playerat.getNomJoueur()+" perd"+ 2*getForce() +" points de vie");
        System.out.println("Joueur "+getNomJoueur()+" perd"+ getForce()/2 +" points de vie");
        playerat.setVie(playerat.getVie()-2*getForce());
        setVie(getVie()-getForce()/2);
    }
}
