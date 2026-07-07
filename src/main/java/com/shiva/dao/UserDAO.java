package com.shiva.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.shiva.model.User;
import com.shiva.util.DBConnection;

public class UserDAO {

    public boolean saveUser(User user) {

        try {

            Connection con = DBConnection.getConnection();

            String sql =
            "INSERT INTO users(name,email,phone,city,age,gender,address) VALUES(?,?,?,?,?,?,?)";

            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPhone());
            ps.setString(4, user.getCity());
            ps.setInt(5, user.getAge());
            ps.setString(6, user.getGender());
            ps.setString(7, user.getAddress());

            ps.executeUpdate();

            con.close();

            return true;

        } catch (Exception e) {

            e.printStackTrace();

        }

        return false;

    }

}