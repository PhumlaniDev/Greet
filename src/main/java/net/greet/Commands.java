package net.greet;

public class Commands {

    private String command;
    private String name;
    private String language;

    public Commands(String cmd) {

        String [] input = cmd.split(" ");

        this.command = input[0].toLowerCase();

        if (input.length >= 2){
            this.name = input[1].substring(0,1).toLowerCase()
                    + input[1].substring(1);
        }

        else{
            this.name = "";
        }

        if(input.length >= 3){
            this.language = input[2];
        }
    }

    public String getName(){
        return name;
    }

    public String getLanguage() {
        return language;
    }

    public String getCommand() {
        return command;
    }
}
