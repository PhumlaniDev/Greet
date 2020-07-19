package net.greet;

import java.util.Scanner;

public class Greet {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("*******************************");

        Greeter greeter = new Greeter();
        CommandProcessor commands = new CommandProcessor(greeter);

        do {
            System.out.println("Enter a command: ");
            String userInput = scanner.nextLine();
            Commands commandProcessor = new Commands(userInput);

            if (commandProcessor.getCommand().equals("greet")){
                try {
                    commands.commanding(commandProcessor);
                } catch (Exception e) {
                    e.printStackTrace();
                }

            }

            if (commandProcessor.getCommand().equals("exit")){
                return;
            }
            else{
                try {
                    System.out.println(commands.commanding(commandProcessor));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }while (true);

    }
}
