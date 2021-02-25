package kz.aitu.oop.practice.assignments.ass5.data;

import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresDB implements IDB {
    @Override
    public Connection getConnection() throws SQLException, ClassNotFoundException {
        String connectionUrl = "jdbc:postgresql://localhost:5432/ITCompany";
        try {
            Class.forName("org.postgresql.Driver");
            Connection con = DriverManager.getConnection(connectionUrl, "postgres", "4556");
            return con;
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
