package org.example.dz_map.names_hashSet;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Scanner;

@Slf4j
public class Main {
    public static void main(String[] args) {
        HashSet<String> names = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String input;
        log.debug("Enter names (type 'stop' to stop):");

        while (true) {
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("stop")) {
                break;
            }
            names.add(input.toLowerCase());
//            names.add(input.toUpperCase());
        }

        log.debug("Unique names:");
        for (String name : names) {
            String stringLow = name.toLowerCase();
            String subString =  stringLow.substring(0, 1).toUpperCase() + stringLow.substring(1);
            log.debug(subString);
        }
    }
}

