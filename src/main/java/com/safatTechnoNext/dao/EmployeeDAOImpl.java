package com.safatTechnoNext.dao;

import com.safatTechnoNext.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
@Repository
public class EmployeeDAOImpl implements EmployeeDAO {

    @Autowired
    private DataSource dataSource;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void save(Employee employee) {
        String query = """
                insert into employee (
                \tpin, username, email,
                \tdesignation_id, address,\s
                \tgender, guardian_name, contact_no_self,\s
                \tcontact_no_guardian, nid)\s
                values(?,?,?,?,?,?,?,?,?,?)
                """;

        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(2,employee.getPin());
            ps.setString(3, employee.getUserName());
            ps.setString(4, employee.getEmail());
            ps.setInt(5, employee.getDesignation_id());
            ps.setString(6, employee.getAddress());
            ps.setString(7, employee.getGender().name());
            ps.setString(8, employee.getGuardianName());
            ps.setString(9, employee.getContactNoSelf());
            ps.setString(10, employee.getContactNameGuardian());
            ps.setString(11,employee.getNid());
            ps.setDate(12, java.sql.Date.valueOf(String.valueOf(new Date())));
            int out = ps.executeUpdate();

            if(out !=0) {
                System.out.println("Employee saved with id="+employee.getId());
            }
            else
                System.out.println("Employee save failed with id="+employee.getId());

        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally{
            try {
                assert ps != null;
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    @Override
    public int update(Employee employee) {
        return 0;
    }

    @Override
    public Employee findById(Long id) {
        String query = "select username, email from Employee where id= ?";
        Employee emp = null;
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            con = dataSource.getConnection();
            ps = con.prepareStatement(query);
            ps.setInt(1, id.intValue());
            rs = ps.executeQuery();
            if (rs.next()) {
                emp = new Employee();
                emp.setId(id);
                emp.setUserName(rs.getString("username"));
                emp.setEmail(rs.getString("email"));
                System.out.println("Employee found::" + emp);
            } else
                System.out.println("Np Employee found with id=" + id);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                assert rs != null;
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return emp;
    }

    @Override
    public int deleteById(Long id) {
        return 0;
    }

    @Override
    public List<Employee> findAll() {
        return null;
    }

    @Override
    public int deleteAll() {
        return 0;
    }
}
