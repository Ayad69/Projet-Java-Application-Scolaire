package src.DAO;

import src.DTO.Eleve;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class EleveDAO {

    public boolean create(Eleve obj) {
        String sql = "INSERT INTO eleve (nomEleve, preEleve, ageEleve) VALUES (?,?,?)";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNomEleve());
            pstmt.setString(2, obj.getPrenomEleve());
            pstmt.setInt(3, obj.getAgeEleve());

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Categorie ajoutee avec succes !");
                return true;
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de l’ajout de la categorie : " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }

/*
    @Override
    public boolean delete(Categorie obj) {
        String sql = "DELETE FROM categorie WHERE idCat = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setInt(1, obj.getIdCat());
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("🗑 Categorie supprimee avec succes !");
                return true;
            }

        } catch (SQLException e) {
            System.err.println(" Erreur lors de la suppression de la categorie : " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }


    @Override
    public boolean update(Categorie obj) {
        String sql = "UPDATE categorie SET libCat = ? WHERE idCat = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, obj.getLibCat());
            pstmt.setInt(2, obj.getIdCat());
            int rowsUpdated = pstmt.executeUpdate();

            if (rowsUpdated > 0) {
                System.out.println(" Categorie mise a jour avec succes !");
                return true;
            }

        } catch (SQLException e) {
            System.err.println(" Erreur lors de la mise a jour de la categorie : " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }


    @Override
    public Categorie find(int id) {

        Categorie categorie = null;
        String sql = "SELECT * FROM categorie WHERE idCat = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                int idCat = rs.getInt("idCat");
                String libCat = rs.getString("libCat");

                categorie = new Categorie(idCat, libCat);
            }

            rs.close();
        } catch (SQLException e) {
            System.err.println("Erreur lors de la récupération de la categorie : " + e.getMessage());
            e.printStackTrace();
        }

        return categorie;
    }



    @Override
    public ArrayList<Categorie> findAll() {
        ArrayList<Categorie> categories = new ArrayList<>();
        String sql = "SELECT * FROM categorie ";

        try (Statement stmt = connect.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                int idCat = rs.getInt("idCat");
                String libCat = rs.getString("libCat");

                Categorie categorie = new Categorie(idCat, libCat);
                categories.add(categorie);
            }

            System.out.println(" " + categories.size() + " categorie(s) recuperee(s)");

        } catch (SQLException e) {
            System.err.println(" Erreur lors de la recuperation des catégories : " + e.getMessage());
            e.printStackTrace();
        }

        return categories;
    }
*/
}
