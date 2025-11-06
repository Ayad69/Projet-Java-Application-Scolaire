package Test;

import src.DAO.Database;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestConnexion {

    public void testCon() {
        try{
            Connection connect = Database.getConnection();
            Statement stmt = connect.createStatement();
            ResultSet rs = stmt.executeQuery("show databases;");
            System.out.println("Connected");
        } catch (Exception e) {
            System.out.println(e); }
    }
}
