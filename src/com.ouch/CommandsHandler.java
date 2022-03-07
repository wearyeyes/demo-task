package com.ouch;

import java.util.Scanner;
import java.util.stream.Collectors;

import static com.ouch.Constants.COMMAND_CODES;

public class CommandsHandler {

    public static void greeting() {
        System.out.println("Hello! Welcome to the program!");
    }

    public static void printSupportedCommands() {
        System.out.println(COMMAND_CODES);
    }

    public static void printEnvironmentVariables() {
        System.getenv().entrySet().forEach(System.out::println);
    }

    /**
     * Requests one word from console input, separates all characters of the entered word with escape characters
     * and prints the result in the console output.
     */
    public static void printWordWithSpacesBetweenSymbols() {
        System.out.println("Please enter one word:");
        Scanner wordScanner = new Scanner(System.in);
        String s = wordScanner.next()
                .codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.joining(" "));
        System.out.println(s);
    }

    /**
     * Requests one word from console input, reverts it
     * and print the result in the console output.
     */
    public static void printReversedWord() {
        System.out.println("Please enter one word:");
        Scanner wordScanner = new Scanner(System.in);
        String enteredWord = wordScanner.next();
        String reversedWord = new StringBuilder(enteredWord).reverse().toString();
        System.out.println(reversedWord);
    }
}
