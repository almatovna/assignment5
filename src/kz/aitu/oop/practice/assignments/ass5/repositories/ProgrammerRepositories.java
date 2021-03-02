package kz.aitu.oop.practice.assignments.ass5.repositories;

import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;
import kz.aitu.oop.practice.assignments.ass5.entities.Designer;
import kz.aitu.oop.practice.assignments.ass5.entities.Manager;
import kz.aitu.oop.practice.assignments.ass5.entities.Programmer;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IProgrammerRepositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

public class ProgrammerRepositories implements IProgrammerRepositories {

    private final IDB db;
    public ProgrammerRepositories(IDB db) {
        this.db = db;
    }

    @Override
    public List<Programmer> getAllProgrammers() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM programmer";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<Programmer> programmers = new LinkedList<Programmer>();
            while (rs.next()){
                Programmer programmer = new Programmer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("time"),
                        rs.getInt("salary"),
                        rs.getString("project"));
                programmers.add(programmer);
            }
            return programmers;
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
    public List<Programmer> getProgrammerByName(String name, String surname) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM programmer WHERE name = ? OR surname = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);
            st.setString(2, surname);

            ResultSet rs = st.executeQuery();
            List<Programmer> programmers = new LinkedList<Programmer>();
            while (rs.next()){
                Programmer programmer = new Programmer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("time"),
                        rs.getInt("salary"),
                        rs.getString("project"));
                programmers.add(programmer);
            }
            return programmers;
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
    public List<Programmer> getProgrammerByStatus(String status) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM programmer WHERE status = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, status);

            ResultSet rs = st.executeQuery();
            List<Programmer> programmers = new LinkedList<Programmer>();
            while (rs.next()){
                Programmer programmer = new Programmer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("time"),
                        rs.getInt("salary"),
                        rs.getString("project"));
                programmers.add(programmer);
            }
            return programmers;
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
    public List<Designer> getAllDesigners() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM designer";
            PreparedStatement st = con.prepareStatement(sql);

            ResultSet rs = st.executeQuery();
            List<Designer> designers = new LinkedList<Designer>();
            while (rs.next()){
                Designer designer = new Designer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("time"),
                        rs.getInt("salary"),
                        rs.getString("project"));
                designers.add(designer);
            }
            return designers;
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
    public List<Designer> getDesignerByName(String name, String surname) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM designer WHERE name = ? OR surname = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, name);
            st.setString(2, surname);
            ResultSet rs = st.executeQuery();
            List<Designer> designers = new LinkedList<Designer>();
            while (rs.next()){
                Designer designer = new Designer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("time"),
                        rs.getInt("salary"),
                        rs.getString("project"));
                designers.add(designer);
            }
            return designers;
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
    public List<Designer> getDesignerByStatus(String status) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM designer WHERE status = ?";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, status);
            ResultSet rs = st.executeQuery();
            List<Designer> designers = new LinkedList<Designer>();
            while (rs.next()){
                Designer designer = new Designer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("status"),
                        rs.getString("hiredate"),
                        rs.getInt("time"),
                        rs.getInt("salary"),
                        rs.getString("project"));
                designers.add(designer);
            }
            return designers;
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
