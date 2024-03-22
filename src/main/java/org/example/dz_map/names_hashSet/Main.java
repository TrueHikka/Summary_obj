package org.example.dz_map.names_hashSet;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        System.out.println("Enter names (type 'stop' to stop):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            names.add(input.toLowerCase());
//            names.add(input.toUpperCase());
        }

        System.out.println("Unique names:");
        for (String name : names) {
            String stringLow = name.toLowerCase();
            String subString =  stringLow.substring(0, 1).toUpperCase() + stringLow.substring(1);
            System.out.println(subString);
        }
    }
}

