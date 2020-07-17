package net.greet.Connection;

import net.greet.Greetings;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBQuries  implements Greetings {

    final String KOANS_DATABASE_URL = "jdbc:h2:./target/greet_db";
    final String JDBC_DRIVER = "org.h2.Driver";
    String username = "sa";
    String password = "";

    public Connection getConnection() throws Exception {

        Class.forName(JDBC_DRIVER);

        Connection conn = DriverManager.getConnection(KOANS_DATABASE_URL, username, password);
        return conn;
    }

    @Override
    public String greeter(String name, String language) {
        return null;
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
