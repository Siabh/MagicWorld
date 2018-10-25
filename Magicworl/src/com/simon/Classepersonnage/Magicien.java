package com.simon.Classepersonnage;

public class Magicien extends Personnage {

    @Override
    public void attaquebasique(Personnage playerat) {
        System.out.println("Joueur "+ getNomJoueur()+" utilise Boule de Feu et inflige "+ getIntelligence() +"dommages.");
        System.out.println("Joueur "+playerat.getNomJoueur()+" perd"+ getIntelligence()+" points de vie");
        playerat.setVie(playerat.getVie()-getIntelligence());
    }

    @Override
    public void attaquespecial(Personnage playerat) {
        System.out.println("Joueur "+ getNomJoueur()+" utilise Soin et gagne"+ 2*getIntelligence() +" en vitalité.");
        setVie(getVie()+2*getIntelligence());
    }
    @Override
    public String getPhrase() {
        return "Abracadabra je suis le Mage";
    }
}
