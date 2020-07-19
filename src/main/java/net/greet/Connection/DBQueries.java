package net.greet.Connection;

import net.greet.Greetings;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DBQueries implements Greetings {

    final String KOANS_DATABASE_URL = "jdbc:h2:./target/greet_db";
    final String JDBC_DRIVER = "org.h2.Driver";
    String username = "sa";
    String password = "";

    public Connection getConnection() {

        try {
            Class.forName(JDBC_DRIVER);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(KOANS_DATABASE_URL, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    @Override
    public String greeter(String name, String language){

        Connection connection = getConnection();

        final String INSERT_NAME_SQL = "insert into greet (name) values (?)";

        PreparedStatement addName = null;
        try {
            addName = connection.prepareStatement(INSERT_NAME_SQL);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            addName.setString(1,name);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            addName.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return name;
    }

    @Override
    public String greeted() {
        return null;
    }

    @Override
    public String greetedUser(String username) {
        return null;
    }

    @Override
    public int counter() {
        return 0;
    }

    @Override
    public String clear(String username) {
        return null;
    }

    @Override
    public String clearAll() {
        return null;
    }

    @Override
    public String help() {
        return null;
    }
}
