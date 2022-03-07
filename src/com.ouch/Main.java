package com.ouch;

import java.util.Scanner;

import static com.ouch.CommandsHandler.greeting;
import static com.ouch.CommandsHandler.printEnvironmentVariables;
import static com.ouch.CommandsHandler.printRevertedWord;
import static com.ouch.CommandsHandler.printSupportedCommands;
import static com.ouch.CommandsHandler.printWordWithSpacesBetweenSymbols;
import static com.ouch.Constants.INCORRECT_CODE_MESSAGE;

public class Main {

    public static void main(String[] args) {
        greeting();
        printSupportedCommands();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            switch (n) {
                case 1:
                    greeting();
                    break;
                case 2:
                    printEnvironmentVariables();
                    break;
                case 3:
                    printSupportedCommands();
                    break;
                case 4:
                    printWordWithSpacesBetweenSymbols();
                    break;
                case 5:
                    printRevertedWord();
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