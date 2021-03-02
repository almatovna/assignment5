package kz.aitu.oop.practice.assignments.ass5.repositories;

import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;
import kz.aitu.oop.practice.assignments.ass5.entities.Manager;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IManagerRepositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ManagerRepositories implements IManagerRepositories {
    private final IDB db;
    public ManagerRepositories(IDB db) {
        this.db = db;
    }

    @Override
    public List<Manager> getAllManagers() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM manager";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<Manager> managers = new LinkedList<Manager>();
            while (rs.next()){
                Manager manager = new Manager(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"));
                managers.add(manager);
            }
            return managers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }

    @Override
    public List<Manager> getManagerByName(String name, String surname) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM manager WHERE name = ? OR surname = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);
            st.setString(2, surname);

            ResultSet rs = st.executeQuery();
            List<Manager> managers = new LinkedList<Manager>();
            while (rs.next()){
                Manager manager = new Manager(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"));
                managers.add(manager);
            }
            return managers;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return null;
    }
}
