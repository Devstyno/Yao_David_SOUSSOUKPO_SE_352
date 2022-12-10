package testes;

import java.util.List;

import classes.Joueur;
import classes.JoueurCRUD;

public class test {
    public static void main(String[] args) {
        //Joueur j = new Joueur("SOUSSOUKPO", "Yao David", "SOUY281100");
        Joueur j2 = new Joueur("FAYA", "Majoie", "UUWI44");
        Joueur j3 = new Joueur("BAGNA", "Ewe Prince", "IOEIUPE8");
        Joueur j4 = new Joueur("AHADJITSE", "Mathis", "UIE9844");
        Joueur j5 = new Joueur("AHADJI", "Joanne", "IYIAE44500");
        
        //JoueurCRUD.add(j);
        JoueurCRUD.add(j2);
        JoueurCRUD.add(j3);
        JoueurCRUD.add(j4);
        JoueurCRUD.add(j5);

        //System.out.println(JoueurCRUD.findOne(1).toString());

        List<Joueur> joueurs = JoueurCRUD.getAll();

        for(Joueur j : joueurs){
            System.out.println(j.toString());
        }

    }
}
