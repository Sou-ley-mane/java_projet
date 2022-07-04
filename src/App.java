import java.util.Scanner;

import Service.IService;
import Service.ServiceT;
import models.Pavillon;

public class App {
    private static int id = 0;

    public static void main(String[] args) throws Exception {
        IService service = new ServiceT();
        int reponse = service.question();
        while (reponse == 1) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Veuillez saisir un num :");
            String str = sc.nextLine();
            System.out.println("Veuillez saisir un nombre :");
            int nbr = sc.nextInt();
            Pavillon p = new Pavillon(++id, str, nbr);
            service.AddPavillon(p);
            service.listerPavillon();
            id++;
            System.out.println("voulez vous toujour continuer");
            System.out.println("1=>Oui");
            System.out.println("2=>Non");
            int repon = sc.nextInt();

            if (repon == 1) {
                continue;
            } else if (repon == 2) {
                System.out.println("Terminer");
                break;
            } else {
                System.out.println("Option non disponible");
                break;
            }

        }

    }
}
