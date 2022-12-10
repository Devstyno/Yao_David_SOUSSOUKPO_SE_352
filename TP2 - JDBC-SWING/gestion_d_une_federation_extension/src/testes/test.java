package testes;

import classes.Joueur;
import classes.JoueurCRUD;

public class test {
    public static void main(String[] args) {
        //Joueur j = new Joueur("SOUSSOUKPO", "Yao David", "SOUY281100");
        
        //JoueurCRUD.add(j);

        System.out.println(JoueurCRUD.findOne(1).toString());

    }
}
