package jeu.src.capacite;

/**
 *
 * @author Thømas
 */
public class AttaqueTotale extends Attaque {

    public AttaqueTotale(String nom, String description, int damage) {
        super(nom, description, damage);
    }

    @Override
    public void executerAction(Object cible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executerEffetDebutTour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executerEffetDisparition(Object cible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executerEffetFinTour() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executerEffetMiseEnJeu(Object cible) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
