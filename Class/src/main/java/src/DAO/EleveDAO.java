package src.DAO;

import src.DAO.DAO;
import src.DTO.Eleve;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

public class EleveDAO extends DAO<Eleve> {

    @Override
    public boolean create(Eleve obj) {
        String sql = "INSERT INTO eleve (nomEleve, preEleve, ageEleve) VALUES (?,?,?)";
        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setString(1, obj.getNomEleve());
            pstmt.setString(2, obj.getPrenomEleve());
            pstmt.setInt(3, obj.getAgeEleve());

            int rowsInserted = pstmt.executeUpdate();

            if (rowsInserted > 0) {
                System.out.println("Eleve ajoutee avec succes !");
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de l’ajout de l'eleve : " + e.getMessage());
            e.printStackTrace();
        }

        return true;
    }

    @Override
    public boolean delete(Eleve obj) {

        String sql = "DELETE FROM eleve WHERE idEleve = ?";

        try (PreparedStatement pstmt = connect.prepareStatement(sql)) {
            pstmt.setInt(1, obj.getIdEleve());
            int rowsDeleted = pstmt.executeUpdate();

            if (rowsDeleted > 0) {
                System.out.println("🗑 Eleve supprimee avec succes !");
                return true;
            }

        } catch (SQLException e) {
            System.err.println(" Erreur lors de la suppression de l'eleve : " + e.getMessage());
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean update(Eleve obj) {
        return false;
    }

    @Override
    public Eleve find(int id) {
        return null;
    }

    @Override
    public ArrayList<Eleve> findAll() {
        return null;
    }
}