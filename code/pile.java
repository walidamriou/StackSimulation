package walidamriou;

public class pile {
    private int Sommet=0;
    private int[] element;

    pile(){

    }

    //initialisation de la pile
    public pile(int max){
        element = new int[max];
        //Sommet = max;

    }

    //La pile est-elle vide?

    public boolean pileVide(){
        return (Sommet == 0); //if i==0 so the list is vide and return true if is vode
    }

    //Insertion dans la pile

    public void empiler(int v){
        if (Sommet+1 == element.length){
            erreur("Le pile est in max. Essayez de le vider d'abord.\n\n");
        }

        else {
            element[Sommet]=v;
            System.out.println("Le numero a ete charge avec succès.\n" +
                    "La valure: " +
                    v +
                    " est sur la postion " +
                    Sommet +
                    " .\n");
            Sommet++;
        }

    }

    //Retrait de la pile

    public int depiler(){
        int depiler_var=0;
        if (Sommet == 0) {
            erreur("Impossible de decharger, car La pile est vide.\n\n");
        }
        else {
            Sommet--;
            depiler_var = element[Sommet];
            element[Sommet]= 0;
            System.out.println("Le numero a ete decharge avec succès.\n" +
                    "La valure: " +
                    depiler_var +
                    " est a partir la postion " +
                    Sommet +
                    " .\n");
        }
        return depiler_var;
    }

    //Vidage de la pile
    public void ViderPile(){
        if (Sommet==0){
            erreur("La pile est vide.\n");
        }
        else {
            for (int i2=0;i2<Sommet;i2++){
                element[i2]=0;
            }
            Sommet=0;
            System.out.println("la pile ete decharge avec succes.\n" +
                    "La pile est vide.\n");
        }

    }

    public void ListPile(){
        if (Sommet==0){
            erreur("La pile est vide.\n");
        }
        else {
            System.out.println("la pile contient: \n");
            int b=Sommet;
            for (int i2=0;i2<b;i2++){
                System.out.println("- La valure: " +
                        element[i2] +
                        " Sur la position " +
                        i2 +
                        " . \n");
        }


        }

    }

    private void erreur(String mes){
        System.out.println(mes);
    }

}
