package pl.krrybarc;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean looping = true;
        while (looping) {
            Scanner scanner = new Scanner(System.in);
            String line = scanner.next();

            looping = controlLoopFromInput(line);

            System.out.println(line);
        }
    }

    private static boolean controlLoopFromInput(String line) {
        String command = line.toLowerCase();

        if (command.equals("exit") || command.equals("quit") ||
                command.equals("q")) {
            return false;
        }
        return true;
    }
}
