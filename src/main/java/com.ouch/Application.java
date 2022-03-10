package com.ouch;

public class Application {
    public static void main(String[] args) {
        CommandsHandler commandsHandler = new CommandsHandler();
        commandsHandler.greeting();
        commandsHandler.printSupportedCommands();
        commandsHandler.processCommands();
    }
}