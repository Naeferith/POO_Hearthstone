package jeu.src.capacite;

import jeu.src.heros.Heros;
import jeu.src.IJoueur;
import jeu.src.Plateau;
import jeu.src.exception.HearthstoneException;

/**Capacité à attaquer un héros en ignorant tout serviteur avec provocation
 *
 * @author BAGNATO Thomas
 */
public class AttaqueHeros extends Attaque {

    public AttaqueHeros(String nom, String description, int damage) {
        super(nom, description, damage);
    }

    @Override
    public final void executerAction(Object cible) throws HearthstoneException {
        if (this.isUse()) throw new HearthstoneException("Pouvoir héroique déja utilisé ce tour.");
        else {
            this.setUse(true);
            if (cible instanceof IJoueur) cible = ((IJoueur)cible).getHeros();
            if (!(cible instanceof Heros)) throw new HearthstoneException("La cible doit être un héros.");
            ((Heros) cible).setPv(((Heros) cible).getPv() - this.damage);
        }
    }

    @Override
    public void executerEffetDebutTour() {}

    @Override
    public void executerEffetDisparition(Object cible) throws HearthstoneException {}

    @Override
    public void executerEffetFinTour() {}

    @Override
    public void executerEffetMiseEnJeu(Object cible) throws HearthstoneException {
        this.executerAction(Plateau.getPlateau().getAdversaire((IJoueur) cible).getHeros());
    }
}
