import java.util.Scanner;

import Models.Pavillon;
import Service.Service;

public class App {

    public static void main(String[] args) throws Exception {
        Service service = new Service();
        String options[] = { "GESTION DES PAVILLONS", "GESTION DES CHAMBRES", "GESTION DES ETUDIANTS" };
        int reponse = service.menu("GESTION DES LOGEMENTS", options);
        if (reponse == 1) {
            String pav[] = { "Ajouter", "Supprimer", "lister" };
            int repon = service.menu("GESTION DES PAVILLONS", pav);
            switch (repon) {
                case 1:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Donner le numéro du pavillon");
                    String num = sc.nextLine();
                    System.out.println("Donner le numéro du pavillon");
                    int nombre = sc.nextInt();
                    Pavillon p = new Pavillon(1, nombre, num);
                    service.AddPavillon(p);
                    service.listerPavillon();
                    // System.out.println(p);

                    break;

                case 2:
                    System.out.println("Supprimer pavillon");
                    break;

                case 3:
                    System.out.println("Lister pavillon");
                    break;

                default:
                    break;
            }
        } else if (reponse == 2) {
            String pav[] = { "Ajouter", "Supprimer", "lister" };
            int repon = service.menu("GESTION DES  CHAMBRES", pav);
            switch (repon) {
                case 1:
                    System.out.println("Ajout pavillon");
                    break;

                case 2:
                    System.out.println("Supprimer pavillon");
                    break;

                case 3:
                    System.out.println("Lister pavillon");
                    break;

                default:
                    break;

            }
        } else if (reponse == 3) {
            String pav[] = { "Ajouter", "Supprimer", "lister" };
            int repon = service.menu("GESTION DES  ETUDIANTS", pav);
            switch (repon) {
                case 1:
                    System.out.println("Ajout pavillon");
                    break;

                case 2:
                    System.out.println("Supprimer pavillon");
                    break;

                case 3:
                    System.out.println("Lister pavillon");
                    break;

                default:
                    break;

            }
        }
    }

}
