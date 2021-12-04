package com.devcolibri.database;

import com.mysql.cj.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Connection connection;
        try {
            Driver driver = new Driver();
            DriverManager.registerDriver(driver);

            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_db_test","root","MySQL");
            if(!connection.isClosed()){
                System.out.println("Соеденение с БД установленно ");
            }

            connection.close();

            if(connection.isClosed()){
                System.out.println("Соеденение с БД закрыто ");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Ошибка");
        }

    }
}
