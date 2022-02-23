package com.ouch;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    private static final String COMMAND_CODES = "Supported commands: \n" +
            "1 - Greeting\n" +
            "2 - Print System variables\n" +
            "3 - Print supported commands\n" +
            "4 - Print entered word with spaces between symbols\n" +
            "5 - Print reverted word\n" +
            "6 - Exit from program\n";

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
                    // System variables
                    printEnvironmentVariables();
                    break;
                case 3:
                    // Support commands
                    printSupportedCommands();
                    break;
                case 4:
                    // Word with escapes
                    printWordWithSpaces();
                    break;
                case 5:
                    // Word revert
                    printRevertedWord();
                    break;
                case 6:
                    // Exit
                    System.out.println("Exit...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("This number is not supported!");
            }
        }

    }

    private static void greeting() {
        System.out.println("Hello! Welcome to the program!");
    }

    private static void printSupportedCommands() {
        System.out.println(COMMAND_CODES);
    }

    public static void printEnvironmentVariables() {
        System.getenv().entrySet().forEach(System.out::println);
    }

    private static void printWordWithSpaces() {
        System.out.println("please enter a word:");
        Scanner wordScanner = new Scanner(System.in);
        String s = wordScanner.next()
                .codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.joining(" "));
        System.out.println(s);
    }

    private static void printRevertedWord() {

    }
}