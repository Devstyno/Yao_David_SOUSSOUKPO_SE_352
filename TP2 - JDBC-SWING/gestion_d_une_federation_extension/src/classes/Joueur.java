package classes;

public class Joueur implements Comparable<Joueur>{
    private String nom, prenom, numero_licence;
    private int nombre_de_points;
    
    public Joueur() {
    }

    public Joueur(String nom, String prenom, String numero_licence) {
        this.nom = nom;
        this.prenom = prenom;
        this.numero_licence = numero_licence;
        this.nombre_de_points = 0;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNumero_licence() {
        return numero_licence;
    }

    public void setNumero_licence(String numero_licence) {
        this.numero_licence = numero_licence;
    }

    public int getNombre_de_points() {
        return nombre_de_points;
    }

    public void setNombre_de_points(int nombre_de_points) {
        this.nombre_de_points = nombre_de_points;
    }

    @Override
    public String toString() {
        return "Joueur [nom=" + nom + ", prenom=" + prenom + ", numero_licence=" + numero_licence
                + ", nombre_de_points=" + nombre_de_points + "]";
    }

    public boolean equals(Joueur other) {
        boolean condition = this.nom == other.getNom() && this.prenom == other.getPrenom() && this.numero_licence == other.getNumero_licence() && this.nombre_de_points == other.getNombre_de_points();
        return condition;
    }

    public void ajouterPoints(int nombre_de_points_sup){
        this.nombre_de_points += nombre_de_points_sup;
    }

    @Override
    public int compareTo(Joueur other) {
        if(this.nombre_de_points == other.getNombre_de_points()){
            System.out.println("Egalité");
            return 0;
        }
        else if(this.nombre_de_points < other.getNombre_de_points()){
            System.out.println("Moins classé");
            return -1;
        }
        else{
            System.out.println("Mieux classé");
            return 1;
        }
    }

    

}
