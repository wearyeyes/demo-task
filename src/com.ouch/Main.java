package com.ouch;

import java.util.Scanner;

import static com.ouch.Constants.INCORRECT_CODE_MESSAGE;

public class Main {
    private static final CommandsHandler commandsHandler = new CommandsHandler();

    public static void main(String[] args) {
        commandsHandler.greeting();
        commandsHandler.printSupportedCommands();
        processCommands();
    }

    private static void processCommands() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    commandsHandler.greeting();
                    break;
                case 2:
                    commandsHandler.printEnvironmentVariables();
                    break;
                case 3:
                    commandsHandler.printSupportedCommands();
                    break;
                case 4:
                    commandsHandler.printWordWithSpacesBetweenSymbols();
                    break;
                case 5:
                    commandsHandler.printReversedWord();
                    break;
                case 6:
                    System.out.println("Exit...");
                    System.exit(0);
                    break;
                default:
                    System.out.println(INCORRECT_CODE_MESSAGE);
            }
        }
    }

}