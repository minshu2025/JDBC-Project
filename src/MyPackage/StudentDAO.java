package MyPackage;

import java.sql.*;

public class StudentDAO {

    // INSERT
    public void insert(Student s) {
        try {
            Connection conn = DB.getConnection();
            String sql = "INSERT INTO student VALUES (?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, s.sid);
            ps.setString(2, s.sname);
            ps.setString(3, s.semail);

            ps.executeUpdate();
            System.out.println("Inserted Successfully");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // READ
    public void read() {
        try {
            Connection conn = DB.getConnection();
            String sql = "SELECT * FROM student";
            Statement st = conn.createStatement();

            ResultSet rs = st.executeQuery(sql);

            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " +
                                   rs.getString(2) + " " +
                                   rs.getString(3));
            }

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // UPDATE
    public void update(int id, String name) {
        try {
            Connection conn = DB.getConnection();
            String sql = "UPDATE student SET sname=? WHERE sid=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();
            System.out.println("Updated Successfully");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void delete(int id) {
        try {
            Connection conn = DB.getConnection();
            String sql = "DELETE FROM student WHERE sid=?";
            PreparedStatement ps = conn.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Deleted Successfully");

            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}