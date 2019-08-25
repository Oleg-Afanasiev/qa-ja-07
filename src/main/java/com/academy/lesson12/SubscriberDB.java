package com.academy.lesson12;

import java.sql.*;

public class SubscriberDB {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/qa-ja-07?user=root&password=root&serverTimezone=UTC&useSSL=false");
            // SELECT
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery("SELECT * FROM abonent");

            while (rs.next()) {
                String first_name = rs.getString("first_name");
                System.out.println(first_name);
            }

            // INSERT
            PreparedStatement ps = connection.prepareStatement("INSERT INTO abonent " +
                    "(first_name, last_name, gender, age) " +
                    "VALUES " +
                    "(?, ?, ?, ?)");

            for (int i = 1; i <= 10; i++) {
                ps.setString(1, "Name_" + i);
                ps.setString(2, "LastName_"+i);
                ps.setString(3, "f");
                ps.setInt(4, 51+i);

                ps.execute();
            }

            rs.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
