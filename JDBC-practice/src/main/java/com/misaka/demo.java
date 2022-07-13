package com.misaka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class demo {
    public static void main(String[] args) throws Exception{
        Class.forName("com.mysql.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/springbootdb";
        String user = "root";
        String password = "123";
        Connection connection = DriverManager.getConnection(url, user, password);

        String sql1 = "update student set age = 25 where id = 1;";
        String sql2 = "update student set age = 25 where id = 2;";

        Statement statement = connection.createStatement();


        try {
            connection.setAutoCommit(false);

            int count = statement.executeUpdate(sql1);
            System.out.println("Number of rows affected: " + count);

            int i = 3 / 0;

            count = statement.executeUpdate(sql2);
            System.out.println("Number of rows affected: " + count);

            connection.commit();
        } catch (Exception e) {

            connection.rollback();
            throw new RuntimeException(e);
        }

        statement.close();
        connection.close();
    }
}