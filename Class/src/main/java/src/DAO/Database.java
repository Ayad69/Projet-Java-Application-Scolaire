package src.DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private static final String URL = "jdbc:mysql://localhost:3306/classe";
    private static final String USER = "root"; // Mets ton utilisateur MySQL
    private static final String PASSWORD = ""; // Mets ton mot de passe MySQL si nécessaire

    public static Connection getConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Charge le driver JDBC
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException("Driver JDBC non trouvé !", e);
        } catch (SQLException e) {
            throw new RuntimeException("Erreur de connexion à la base de données !", e);
        }
    }
}