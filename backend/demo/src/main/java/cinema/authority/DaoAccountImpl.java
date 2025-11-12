package cinema.authority;

import cinema.model.TaiKhoan;
import java.sql.*;
import cinema.ConnectionDB.ConnectionDB;

public class DaoAccountImpl implements DaoAccount {
    private Connection connection;
    public DaoAccountImpl() {
        this.connection = ConnectionDB.getConnection();
    }
    @Override
    public TaiKhoan findByUsername(String username) {
        TaiKhoan account = null;
        String sql = "SELECT * FROM taikhoan WHERE username = ?";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, username);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                account = new TaiKhoan();
                account.setId(rs.getInt("id"));
                account.setUsername(rs.getString("username"));
                account.setPassword(rs.getString("password"));
                account.setRole(rs.getString("role"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return account;
    }
    @Override
    public boolean saveAccount(TaiKhoan account) {
        String sql = "INSERT INTO taikhoan (username, password, role) VALUES (?, ?, ?)";
        try (PreparedStatement pstmt = connection.prepareStatement(sql)) {
            pstmt.setString(1, account.getUsername());
            pstmt.setString(2, account.getPassword());
            pstmt.setString(3, account.getRole());
            int affectedRows = pstmt.executeUpdate();
            return affectedRows > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

} 
    

