package fr.epsi.banque;
import fr.epsi.banque.entites.Compte;
import fr.epsi.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte1 = new Compte(123456, 1000);
        System.out.println(compte1);

        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte(123456, 1000);
        comptes[1] = new CompteTaux(654321, 2000, 0.9);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }

    }
}
