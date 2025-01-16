package essais;
import entite.AdressePostale;
import entite.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        TestPersonne();
    }

    static void TestPersonne() {
        AdressePostale adresse1 = new AdressePostale((byte) 5, "rue de la paix", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale((byte) 10, "rue de la liberté", 69000, "Lyon");

        Personne personne1 = new Personne("Doe", "John", adresse1);
        Personne personne2 = new Personne("Doe", "Jane", adresse2);

        System.out.println(personne1);
        System.out.println(personne2);
    }
}
