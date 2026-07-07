package com.shiva.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.shiva.model.User;
import com.shiva.util.DBConnection;

public class UserDAO {

    // Save User
    public boolean saveUser(User user) {

        try {

            Connection con = DBConnection.getConnection();

            String sql = "INSERT INTO users(name, username, password, email, phone, city, age, gender, address) VALUES(?,?,?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1,user.getName());

            ps.setString(2,user.getUsername());

            ps.setString(3,user.getPassword());

            ps.setString(4,user.getEmail());

            ps.setString(5,user.getPhone());

            ps.setString(6,user.getCity());

            ps.setInt(7,user.getAge());

            ps.setString(8,user.getGender());

            ps.setString(9,user.getAddress());

            int rows = ps.executeUpdate();

            con.close();

            if (rows > 0) {
                return true;
            }

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }

    // Check Username Exists (Case-Insensitive)
    public boolean userExists(String username) {

        boolean exists = false;

        try {

            Connection con = DBConnection.getConnection();

            String sql = "SELECT COUNT(*) FROM users WHERE LOWER(username)=LOWER(?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);

            ResultSet rs = ps.executeQuery();

            if (rs.next()) {

                exists = rs.getInt(1) > 0;

            }

            con.close();

        } catch (Exception e) {

            e.printStackTrace();

        }

        return exists;
    }

}