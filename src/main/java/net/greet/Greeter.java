package net.greet;

import java.util.HashMap;

public class Greeter implements Greetings{

    HashMap<String,Integer> user = new HashMap<String, Integer>();

    @Override
    public String greeter(String name, String language) {

        if (user.containsKey(name)) {
            user.put(name, user.get(name) + 1);
        }

        else {
            user.put(name, 1);
        }
        return Languages.valueOf(language).getLang() + name.charAt(0) + name.substring(1) + "!";
    }

    @Override
    public String greeted() {
        return user.toString();
    }

    @Override
    public String greetedUser(String username) {
        int count  = 0;

        if (user.isEmpty()){
            System.out.println("Can't find user");
        }

        else if (user.containsKey(username)){
            count = user.get(username);
        }
        return username + " greeted " + count + " time(s).";
    }

    @Override
    public int counter() {
        return user.size();
    }

    @Override
    public String clear(String username) {
        user.remove(username);
        return "User: " + username  + " has been removed.";
    }

    @Override
    public String clearAll() {
        user.clear();
        return "\nall users has been deleted";
    }


    @Override
    public String help() {

        return "\n\n**********************************************************************\n"+
                "Valid commands are:\n"+
                "**********************************************************************\n\n"+
                "greet - followed by the name and the language the user is to be greeted in\n\n" +
                "greeted - should display a list of all users that has been greeted \n\t\tand how many time each user has been greeted\n\n"+
                "greeted - followed by a username returns how many times that username have been greeted \n\n"+
                "clear => clears all the greeted users \n\n"+
                "clear - followed by a name => clears specified user \n\n"+
                "exits' => exit the greeter command line\n\n" +
                "help => overview of possible commands\n\n" +
                "**********************************************************************\n";
    }
}
