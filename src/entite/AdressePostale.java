package entite;

public class AdressePostale {
    public byte numero_de_rue;
    public String libelle_de_la_rue;
    public int code_postal;
    public String ville;

    // Constructor with parameters
    public AdressePostale(byte numero_de_rue, String libelle_de_la_rue, int code_postal, String ville) {
        this.numero_de_rue = numero_de_rue;
        this.libelle_de_la_rue = libelle_de_la_rue;
        this.code_postal = code_postal;
        this.ville = ville;
    }

    // Override toString method
    @Override
    public String toString() {
        return "AdressePostale{" +
                "numero_de_rue=" + numero_de_rue +
                ", libelle_de_la_rue='" + libelle_de_la_rue + '\'' +
                ", code_postal=" + code_postal +
                ", ville='" + ville + '\'' +
                '}';
    }
}