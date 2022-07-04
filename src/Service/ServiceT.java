
package Service;

import java.util.Scanner;

import models.Pavillon;

public class ServiceT implements IService {
    private final int TAILLE = 10;
    private int index;

    private Pavillon[] pavillons = new Pavillon[TAILLE];

    @Override
    public void AddPavillon(Pavillon pavillon) {
        if (index < TAILLE) {
            pavillons[index] = pavillon;
            index++;
        } else {
            System.out.println("Vous avez atteint la limite");
        }

    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : pavillons) {
            if (pavillon != null) {
                System.out.println(pavillon);
            }

        }

    }

    @Override
    public int question() {
        System.out.println("Vous voulez :");
        System.out.println("1=>Ajouter Pavillon");
        System.out.println("2=>Lister Pavillon");
        System.out.println("3=>Lister Chambre");
        System.out.println("4=>Lister les chambre d'un pavillon");
        System.out.println("5=>Supprimer pavillon");
        System.out.println("6=>Archiver  chambre");
        Scanner sc = new Scanner(System.in);
        int rep = sc.nextInt();
        return rep;
    }

}
