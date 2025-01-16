package essais;

import entite.AdressePostale;

public class TestAdressePostale {
    public static void main(String[] args) {
        TestAdressePostale();
    }

    static void TestAdressePostale() {
        AdressePostale adresse1 = new AdressePostale((byte) 5, "rue de la paix", 75000, "Paris");
        AdressePostale adresse2 = new AdressePostale((byte) 10, "rue de la liberté", 69000, "Lyon");

        System.out.println(adresse1);
        System.out.println(adresse2);
    }
}