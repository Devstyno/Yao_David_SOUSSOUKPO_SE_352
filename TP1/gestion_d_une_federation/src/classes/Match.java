package classes;

public class Match {
    Joueur joueur1, joueur2, vainqueur;

    public Match() {
    }

    public Match(Joueur joueur1, Joueur joueur2) {
        this.joueur1 = joueur1;
        this.joueur2 = joueur2;
    }

    public Joueur getJoueur1() {
        return joueur1;
    }

    public void setJoueur1(Joueur joueur1) {
        this.joueur1 = joueur1;
    }

    public Joueur getJoueur2() {
        return joueur2;
    }

    public void setJoueur2(Joueur joueur2) {
        this.joueur2 = joueur2;
    }

    public Joueur getVainqueur() {
        if(!(this.vainqueur == null)){
            return vainqueur;
        }
        else{
            throw new java.lang.IllegalStateException("Vainqueur inconnu !");
        }
    }

    public void setVainqueur(Joueur vainqueur) {
        if(vainqueur == this.joueur1 || vainqueur == this.joueur2){
            this.vainqueur = vainqueur;
        }
        else{
            throw new java.lang.IllegalArgumentException("Joueur ne faisant pas partie du match !");
        }
    }

    public Joueur getVaincu(){
        if(this.joueur1 == this.getVainqueur()){
            return joueur2;
        }
        else{
            return joueur1;
        }
    }


}
