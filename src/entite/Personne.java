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

    // Method that return name in maj and surname
    public String getNomMaj() {
        return this.nom.toUpperCase() + " " + this.prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAdresse(AdressePostale adresse) {
        this.adresse = adresse;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public AdressePostale getAdresse() {
        return adresse;
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