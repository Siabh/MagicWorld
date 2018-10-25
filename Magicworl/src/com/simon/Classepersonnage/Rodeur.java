package com.simon.Classepersonnage;

public class Rodeur extends Personnage {
    @Override
    public void attaquebasique(Personnage playerat) {
        System.out.println("Joueur "+ getNomJoueur()+"utilise Tir à l'arc et inflige"+ getAgilite() +"dommages.");
        System.out.println("Joueur "+playerat.getNomJoueur()+" perd"+ getAgilite()+" points de vie");
        playerat.setVie(playerat.getVie()-getAgilite());
    }

    @Override
    public void attaquespecial( Personnage playerat) {
        System.out.println("Joueur "+ getNomJoueur()+" utilise Concentration et gagne"+ getNiveau()/2 +" en agilité.");
        setAgilite(getAgilite()+getNiveau()/2);
    }
    @Override
    public String getPhrase() {
        return "OHHH je suis le Rodeur";
    }
}
