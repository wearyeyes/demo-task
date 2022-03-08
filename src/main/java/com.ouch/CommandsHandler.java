package com.ouch;

import java.util.Scanner;
import java.util.stream.Collectors;

import static com.ouch.Constants.COMMAND_CODES;
import static com.ouch.Constants.ENTER_WORD_MESSAGE;
import static com.ouch.Constants.GREETING_MESSAGE;

public class CommandsHandler {

    public void greeting() {
        System.out.println(GREETING_MESSAGE);
    }

    public void printSupportedCommands() {
        System.out.println(COMMAND_CODES);
    }

    public void printEnvironmentVariables() {
        System.getenv().entrySet().forEach(System.out::println);
    }

    /**
     * Requests one word from console input, separates all characters of the entered word with escape characters
     * and prints the result in the console output.
     */
    public void printWordWithSpacesBetweenSymbols() {
        System.out.println(ENTER_WORD_MESSAGE);
        Scanner wordScanner = new Scanner(System.in);
        String s = wordScanner.next()
                .codePoints()
                .mapToObj(Character::toString)
                .collect(Collectors.joining(" "));
        System.out.println(s);
    }

    /**
     * Requests one word from console input, reverses it
     * and print the result in the console output.
     */
    public void printReversedWord() {
        System.out.println(ENTER_WORD_MESSAGE);
        Scanner wordScanner = new Scanner(System.in);
        String enteredWord = wordScanner.next();
        String reversedWord = new StringBuilder(enteredWord).reverse().toString();
        System.out.println(reversedWord);
    }
}
