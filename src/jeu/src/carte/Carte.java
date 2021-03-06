package jeu.src.carte;

import jeu.src.ICapacite;
import jeu.src.ICarte;
import jeu.src.capacite.Capacite;
import jeu.src.IJoueur;

/**
 *
 * @author bagnato2u
 */
public abstract class Carte implements ICarte {
    private final String nom;
    private int mana;
    private IJoueur owner;
    private ICapacite capacite;

    public Carte(String nom, int mana, IJoueur joueur, Capacite capacite) {
        this.nom = nom;
        this.mana = mana;
        this.owner = joueur;
        this.capacite = capacite;
        
    }

    @Override
    public final ICapacite getCapacite() {
        return this.capacite;
    }
    
    @Override
    public final int getCout() {
        return this.mana;
    }

    @Override
    public final String getNom() {
        return this.nom;
    }    
    
    @Override
    public final IJoueur getProprietaire() {
        return this.owner;
    }
    
    @Override
    public String toString(){
        return this.nom + " - " + this.mana + " mana";
    }
    
}
