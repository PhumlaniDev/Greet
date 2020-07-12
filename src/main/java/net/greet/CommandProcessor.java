package net.greet;

public class CommandProcessor {

    private Greetings greetings;

    public CommandProcessor(Greetings greetings) {
        this.greetings = greetings;
    }

    public String commanding(Commands command){

            if (command.getCommand().equals("greet")) {
                if (command.getName().equals("")) {
                    return "Invalid name";
                }
                return greetings.greeter(command.getName(), command.getLanguage());

            }

            else if (command.getCommand().equals("greeted")) {
                if (command.getName() != "") {
                    return greetings.greetedUser(command.getName());
                }

                return greetings.greeted();
            }

            else if (command.getCommand().equals("clear")) {
                if (command.getCommand() != "") {
                    return greetings.clear(command.getName());
                } else {
                    return greetings.clearAll();
                }
            }

        return "Enter the correct command! " + greetings.help();
    }
}
