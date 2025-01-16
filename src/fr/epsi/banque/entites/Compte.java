package fr.epsi.banque.entites;

public class Compte {
    public int numCompte;
    public double solde;

    public Compte(int numCompte, double solde) {
        this.numCompte = numCompte;
        this.solde = solde;
    }

    @Override
    public String toString() {
        return "Compte{" +
                "numCompte=" + numCompte +
                ", solde=" + solde +
                '}';
    }
}
