package com.misaka;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    public static void main(String[] args) throws Exception{

        // 1. Load the driver
//        Class.forName("com.mysql.jdbc.Driver");

        // 2. Get the connection
        String url = "jdbc:mysql://springbootdb";
        String user = "root";
        String password = "123";
        Connection connection = DriverManager.getConnection(url, user, password);

        // 3. Create the sql
        String sql = "update student set age = 25 where id = 1;";

        // 4. Create the statement
        Statement statement = connection.createStatement();

        // 5. Execute the sql
        int count = statement.executeUpdate(sql); // returns the number of rows affected

        System.out.println("Number of rows affected: " + count);

        statement.close();
        connection.close();
    }
}