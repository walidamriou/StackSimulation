package walidamriou;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int taille;
        int objectcreat=0;
        int valureempiler=0,valureRetarait=0;
        pile a = new pile();
        boolean isVide;

        while (1==1){
            Scanner reader = new Scanner(System.in);
            System.out.println("GESTON D'UNE PILe \n" +
                    "0- Fin \n" +
                    "1- Initialisation de la pile \n" +
                    "2- La pile est-elle vide? \n" +
                    "3- Insertion dans la pile \n" +
                    "4- Retarait de la pile \n" +
                    "5- Vidage de la pile \n" +
                    "6- Listage de la pile \n" +
                    "Votre choix?");
            int n = reader.nextInt();
            //reader.close();

            switch (n){
                case 0:
                    //exit from the application
                    System.exit(0);
                    break;

                case 1:
                    // Initialisation
                    System.out.println("La taille de la pile:");
                    taille = reader.nextInt();
                    taille++;
                    //reader.close();
                    a = new pile(taille);
                    objectcreat = 1;
                    break;

                case 2:
                    // La pile est-elle vide?
                    if(objectcreat==1) {
                        isVide = a.pileVide();
                        System.out.println(isVide);
                        if (isVide){
                            System.out.println("La pile est vide.\n");
                        }
                        else {
                            System.out.println("La pile ne pas vide.\n");
                        }
                    }
                    else
                        System.out.println("Vous n'avez pas initialisation de la pile, Tu as besoin l'initialisation");
                    break;

                case 3:
                    // Insertion dans la pile
                    System.out.println(" Entrez le numéro que vous souhaitez ajouter: ");
                    valureempiler=reader.nextInt();
                    a.empiler(valureempiler);

                    break;

                case 4:
                    // Retarait de la pile
                    valureRetarait = a.depiler();
                    System.out.println("La  valure charger sur valureRetarait: " +
                            valureRetarait +
                            ".\n ");
                    break;

                case 5:
                    // Vidage de la pile
                    a.ViderPile();
                    break;

                case 6:
                    // Listage de la pile
                    a.ListPile();
                    break;

            }
        }
    }
}
