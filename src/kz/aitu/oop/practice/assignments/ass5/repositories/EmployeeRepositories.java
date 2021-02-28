package kz.aitu.oop.practice.assignments.ass5.repositories;

import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IEmployeeRepositories;

import java.sql.*;
import java.util.LinkedList;
import java.util.List;

public class EmployeeRepositories implements IEmployeeRepositories {
    private final IDB db;
    public EmployeeRepositories(IDB db){
        this.db = db;
    }

    @Override
    public boolean createAdmin(Admin admin) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO admin (name, surname, hiredate, salary, position, duties) VALUES (?,?,?,?,?,?) ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, admin.getName());
            st.setString(2, admin.getSurname());
            st.setString(3, admin.getHireDate());
            st.setInt(4, admin.getSalary());
            st.setString(5, admin.getPosition());
            st.setString(6, admin.getDuties());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Admin getAdminById(int id) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM admin WHERE id = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setInt(1, id);

            ResultSet rs = st.executeQuery();
            if(rs.next()){
                Admin admin = new Admin(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));

                return admin;
            }
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
    public Admin getAdminByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM admin WHERE name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Admin admin = new Admin(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));

                return admin;
            }
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
    public List<Admin> getAllAdmin() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM admin";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Admin> admins = new LinkedList<>();
            while (rs.next()){
                Admin admin = new Admin(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));
                admins.add(admin);
            }
            return admins;
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
    public boolean createProgrammer(Programmer programmer) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO programmers (name, surname, hiredate, salary, position, duties) VALUES (?,?,?,?,?,?) ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, programmer.getName());
            st.setString(2, programmer.getSurname());
            st.setString(3, programmer.getHireDate());
            st.setInt(4, programmer.getSalary());
            st.setString(5, programmer.getPosition());
            st.setString(6, programmer.getDuties());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public Programmer getProgrammerByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM programmer WHERE name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Programmer programmer = new Programmer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));

                return programmer;
            }
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
    public List<Programmer> getAllProgrammers() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM programmers";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Programmer> programmers = new LinkedList<>();
            while (rs.next()){
                Programmer programmer = new Programmer(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));
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
    public boolean deleteProgrammerByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM programmers WHERE name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean createStaff(TechStaff staff) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO staff (name, surname, hiredate, salary, position, duties) VALUES (?,?,?,?,?,?) ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, staff.getName());
            st.setString(2, staff.getSurname());
            st.setString(3, staff.getHireDate());
            st.setInt(4, staff.getSalary());
            st.setString(5, staff.getPosition());
            st.setString(6, staff.getDuties());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public TechStaff getStaffByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM staff WHERE name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                TechStaff staff = new TechStaff(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));

                return staff;
            }
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
    public List<TechStaff> getAllStaff() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM staff";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<TechStaff> staffs = new LinkedList<>();
            while (rs.next()){
                TechStaff staff = new TechStaff(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));
                staffs.add(staff);
            }
            return staffs;
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
    public List<TechStaff> getBySalary(int first, int second) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM staff WHERE salary BETWEEN first AND second";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery(sql);
            st.setInt(1, first);
            st.setInt(2, second);
            List<TechStaff> staffs = new LinkedList<>();
            while (rs.next()){
                TechStaff staff = new TechStaff(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("hiredate"),
                        rs.getInt("salary"),
                        rs.getString("position"),
                        rs.getString("duties"));
                staffs.add(staff);
            }
            return staffs;
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
    public boolean deleteStaffByName(String name) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM staff WHERE name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, name);
            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean createProject(Project project) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "INSERT INTO project (project_name, organisation, price) VALUES (?,?,?) ";
            PreparedStatement st = con.prepareStatement(sql);

            st.setString(1, project.getName());
            st.setString(2, project.getOrganization());
            st.setInt(3, project.getPrice());

            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Project> getAllProjects() {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM project";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            List<Project> projects = new LinkedList<>();
            while (rs.next()){
                Project project = new Project(rs.getInt("id"),
                        rs.getString("projectName"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("organisation"),
                        rs.getInt("price"));
                projects.add(project);
            }
            return projects;
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
    public Project getProjectByName(String projectName) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "SELECT * FROM project WHERE project_name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, projectName);

            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                Project project = new Project(rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("surname"),
                        rs.getString("projectName"),
                        rs.getString("organisation"),
                        rs.getInt("price"));

                return project;
            }
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
        return null;    }

    @Override
    public boolean deleteProjectByName(String projectName) {
        Connection con = null;
        try {
            con = db.getConnection();
            String sql = "DELETE FROM project WHERE project_name = ?";
            PreparedStatement st = con.prepareStatement(sql);
            st.setString(1, projectName);
            st.execute();
            return true;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }finally{
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }
}
