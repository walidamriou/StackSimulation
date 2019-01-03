package walidamriou;

public class pile {
    private int Sommet;
    private int i;
    private int[] element;

    //initialisation de la pile
    public pile(){
        Sommet = 0;
        i=0;
    }

    public pile(int max){
        element = new int[max];
        Sommet = max;

    }

    //La pile est-elle vide?

    public boolean pileVide(){
        return (i == 0); //if i==0 so the list is vide and return true if is vode
    }

    //Insertion dans la pile

    public void empiler(int v){
        if (i == Sommet){
            System.out.println("Le pile est in max. Essayez de le vider d'abord.\n\n");
        }

        else {
            i++;
            element[i]=v;
            System.out.println("Le numero a ete charge avec succès.\n" +
                    "La valure: " +
                    v +
                    " est sur la postion " +
                    i +
                    " .\n");
        }

    }

    //Retrait de la pile

    public int depiler(){
        int depiler_var=0;
        if (i == 0) {
            System.out.println("Impossible de decharger, car La pile est vide.\n\n");
        }
        else {
            depiler_var = element[i];
            element[i]= 0;
            System.out.println("Le numero a ete decharge avec succès.\n" +
                    "La valure: " +
                    depiler_var +
                    " est a partir la postion " +
                    i +
                    " .\n");
            i--;

        }
        return depiler_var;
    }

    //Vidage de la pile
    public void ViderPile(){
        if (i==0){
            System.out.println("La pile est vide.\n");
        }
        else {
            for (int i2=0;i2<i;i2++){
                element[i2]=0;
            }
            i=0;
            System.out.println("la pile ete decharge avec succes.\n" +
                    "La pile est vide.\n");
        }

    }

    public void ListPile(){
        if (i==0){
            System.out.println("La pile est vide.\n");
        }
        else {
            System.out.println("la pile contient: \n");
            int b=i+1;
            for (int i2=1;i2<b;i2++){
                System.out.println("- La valure: " +
                        element[i2] +
                        " Sur la position " +
                        i2 +
                        " . \n");
        }


        }

    }

    private void erreur(String mes){

    }


}
