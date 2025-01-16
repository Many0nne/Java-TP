package fr.epsi.banque.entites;

public class CompteTaux extends Compte {
    public double taux;

    public CompteTaux(int numCompte, double solde, double taux) {
        super(numCompte, solde);
        this.taux = taux;
    }

    @Override
    public String toString() {
        return super.toString() + " CompteTaux{" +
                "taux=" + taux +
                '}';
    }
}
