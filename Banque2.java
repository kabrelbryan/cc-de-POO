public class Main {

        public static void main(String[] args) {

            double taux1 = 0.01;

            double taux2 = 0.02;

            String nom1 = "Pedro";

            String ville1 = "Genève";

            double solde1PremierClient = 1000.0;

            double solde2PremierClient = 2000.0;

            String nom2 = "Alexandra";
            String ville2 = "Lausanne";

            double solde1DeuxiemeClient = 3000.0;

            double solde2DeuxiemeClient = 4000.0;


            afficherClient(nom1, ville1, solde1PremierClient, solde2PremierClient);


            afficherClient(nom2, ville2, solde1DeuxiemeClient, solde2DeuxiemeClient);

            solde1PremierClient = bouclerCompte(solde1PremierClient, taux1);

            solde2PremierClient = bouclerCompte(solde2PremierClient, taux2);

            solde1DeuxiemeClient = bouclerCompte (solde1DeuxiemeClient, taux1);

            solde2DeuxiemeClient = bouclerCompte (solde2DeuxiemeClient, taux2);


            afficherClient(nom1, ville1, solde1PremierClient, solde2PremierClient);

            afficherClient(nom2, ville2, solde1DeuxiemeClient, solde2DeuxiemeClient);

        } static void afficherClient(String nom, String ville, double soldel, double solde2) {

            System.out.println("Client " + nom + " de " + ville);

            System.out.println(" Compte prive: " + soldel + " francs");

            System.out.println(" Compte d'epargne: " + solde2 + " francs");

        }

        static double bouclerCompte(double solde, double taux) {
            double interets = taux * solde;
            double nouveauSolde = solde + interets;
            return nouveauSolde;
        }

}