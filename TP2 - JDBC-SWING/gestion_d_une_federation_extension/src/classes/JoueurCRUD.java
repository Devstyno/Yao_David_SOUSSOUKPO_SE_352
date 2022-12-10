package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.connection.SingletonConnection;


public class JoueurCRUD{


    public static Joueur findOne(int Id) {
        Joueur player = null;
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from joueur where joueurId = ?");
            ps.setInt(1, Id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                player = new Joueur();
                player.setNom(rs.getString("nom"));
                player.setPrenom(rs.getString("prenom"));
                player.setNumero_licence(rs.getString("numeroLicence"));
                player.setNombre_de_points(rs.getInt("nombrePoints"));
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return player;
    }

    public static void add(Joueur player) {
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("insert into joueur(nom, prenom, numeroLicence, nombrePoints) values(?, ?, ?, ?)");
            ps.setString(1, player.getNom());
            ps.setString(2, player.getPrenom());
            ps.setString(3, player.getNumero_licence());
            ps.setInt(4, player.getNombre_de_points());
            ps.executeUpdate();
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Joueur edit(Joueur player) {
        Connection conn = SingletonConnection.getConnection();
        return null;
    }

    public static void delete(Joueur player) {
        Connection conn = SingletonConnection.getConnection();
        
    }

    public static void delete(int Id) {
        Connection conn = SingletonConnection.getConnection();

    }

    public static List<Joueur> getAll() {
        List<Joueur> joueurs = new ArrayList<Joueur>();
        Connection conn = SingletonConnection.getConnection();
        try {
            PreparedStatement ps = conn.prepareStatement("select * from joueur");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Joueur j = new Joueur();
                j.setNom(rs.getString("nom"));
                j.setPrenom(rs.getString("prenom"));
                j.setNumero_licence(rs.getString("numeroLicence"));
                j.setNombre_de_points(rs.getInt("nombrePoints"));
                joueurs.add(j);
            }
            ps.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return joueurs;
    }

    
}