package entite;

public class Personne {
    public String nom;
    public String prenom;
    public AdressePostale adresse;

    // Constructor with name and surname
    public Personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = new AdressePostale((byte) 0, "", 0, "");
    }

    // Constructor with name, surname, and address
    public Personne(String nom, String prenom, AdressePostale adresse) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

    // Override toString method
    @Override
    public String toString() {
        return "Personne{" +
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", adresse=" + adresse +
                '}';
    }
}