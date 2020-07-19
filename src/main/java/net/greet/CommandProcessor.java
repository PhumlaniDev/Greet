package net.greet;

public class CommandProcessor {

    private Greetings greetings;

    public CommandProcessor(Greetings greetings) {
        this.greetings = greetings;
    }

    public String commanding(Commands command) throws Exception {

            if (command.getCommand().equals("greet")) {
                if (command.getName().equals("")) {
                    return "Invalid name";
                }
                return greetings.greeter(command.getName(), command.getLanguage());

            }

            else if (command.getCommand().equals("greeted")) {
                if (command.getName().equals("")) {
                    return greetings.greetedUser(command.getName());
                }

                return greetings.greeted();
            }

            else if (command.getCommand().equals("clear")) {
                if (command.getCommand().equals("")) {
                    return greetings.clear(command.getName());
                } else {
                    return greetings.clearAll();
                }
            }

        return "Enter the correct command! " + greetings.help();
    }
}
