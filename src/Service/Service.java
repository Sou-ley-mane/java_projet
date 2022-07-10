package Service;

import java.util.Scanner;

import Models.Pavillon;

public class Service implements IServicePavillon, IServiceMenu {
    private int indice;
    private final int TAILLE = 20;
    private Pavillon lesPavillons[] = new Pavillon[TAILLE];

    @Override
    public int menu(String nomMenu, String options[]) {
        System.out.println(nomMenu);
        for (int i = 0; i < options.length; i++) {
            System.out.println(i + 1 + "-----------------" + options[i]);
        }
        System.out.println(options.length + 1 + "--------------Quitter");
        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();
        if (option == 3) {
            System.exit(0);
        }
        return option;
    }

    @Override
    public void AddPavillon(Pavillon pavillon) {
        if (indice < TAILLE) {
            lesPavillons[indice] = pavillon;
            indice++;
        } else {
            System.out.println("T ableau plein");
        }
    }

    @Override
    public void listerPavillon() {
        for (Pavillon pavillon : lesPavillons) {
            if (pavillon != null) {
                System.out.println(pavillon);
            }
        }
    }

    @Override
    public void supprimer(int id) {
        // TODO Auto-generated method stub

    }

}
