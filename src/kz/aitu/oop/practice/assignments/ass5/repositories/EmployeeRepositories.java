package kz.aitu.oop.practice.assignments.ass5.repositories;

import kz.aitu.oop.practice.assignments.ass5.data.interfaces.IDB;
import kz.aitu.oop.practice.assignments.ass5.repositories.interfaces.IEmployeeRepositories;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeRepositories implements IEmployeeRepositories {
    private final IDB db;
    public EmployeeRepositories(IDB db){
        this.db = db;
    }

    @Override
    public int totalCost() {
        Connection con = null;
        try{
            con = db.getConnection();
            String sql = "SELECT SUM(salary) FROM manager";
            PreparedStatement st = con.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            int managerSum = 0;
            if(rs.next()){
                managerSum = rs.getInt("sum");
            }

            String sql1 = "SELECT SUM(salary) FROM programmer";
            st = con.prepareStatement(sql1);
            rs = st.executeQuery();
            int programmerSum = 0;
            if(rs.next()){
                programmerSum = rs.getInt("sum");
            }

            String sql2 = "SELECT SUM(salary) FROM designer";
            st = con.prepareStatement(sql2);
            rs = st.executeQuery();
            int designerSum = 0;
            if(rs.next()){
                designerSum = rs.getInt("sum");
            }

            int totalCost = managerSum + programmerSum + designerSum;
            return totalCost;
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
        return 0;
    }

}
