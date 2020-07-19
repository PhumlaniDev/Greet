package net.greet;

public interface Greetings {

    String greeter(String name, String language) throws Exception;
    String greeted();
    String greetedUser(String username);
    int counter();
    String clear(String username);
    String clearAll();
    String help();
}
