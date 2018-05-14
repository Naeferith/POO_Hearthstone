package jeu.src.capacite;

import jeu.src.exception.HearthstoneException;

/**Interface pour les capacités
 *
 * @author BAGNATO Thomas
 */
public interface ICapacite {
    //On suppose le cout du pouvoir héroique fixe à 2 mana
    static final int COUT_POUVOIR = 2;
    
    public abstract void executerAction(Object cible) throws HearthstoneException;
    public abstract void executerEffetDebutTour();
    public abstract void executerEffetDisparition(Object cible) throws HearthstoneException;
    public abstract void executerEffetFinTour();
    public abstract void executerEffetMiseEnJeu(Object cible) throws HearthstoneException;
    public abstract String getDescription();
    public abstract String getNom();
    public abstract void setUse(boolean bool);
    public abstract boolean isUse();
}