package org.example.dz_map.dictionary;

import lombok.extern.slf4j.Slf4j;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        log.debug("Введите какие-нибудь слова:");
        String input = scanner.nextLine();
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] words = input.split("\\s+");
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        log.debug("Частота слов:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            log.debug(entry.getKey() + ": " + entry.getValue());
        }
    }
}