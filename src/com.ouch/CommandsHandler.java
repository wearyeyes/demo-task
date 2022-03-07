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

    public static void printWordWithSpacesBetweenSymbols() {
        System.out.println("Please enter a word:");
        Scanner wordScanner = new Scanner(System.in);
        String s = wordScanner.next()
                .codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.joining(" "));
        System.out.println(s);
        wordScanner.close();
    }

    public static void printRevertedWord() {

    }
}
