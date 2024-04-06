package org.example.dz_map.sets;

import lombok.extern.slf4j.Slf4j;

import java.util.HashSet;
import java.util.Set;

@Slf4j
public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        for (int i = 1; i <= 20; i++) {
            set1.add(i);
        }

        Set<Integer> set2 = new HashSet<>();
        for (int i = 5; i <= 15; i++) {
            set2.add(i);
        }

        Set<Integer> set1Copy = new HashSet<>(set1);
        Set<Integer> set2Copy = new HashSet<>(set2);

        // Пересечение множеств
        Set<Integer> intersection = new HashSet<>(set1Copy);
        intersection.retainAll(set2Copy);
        log.debug("Пересечение множеств: " + intersection);

        // Объединение множеств
        Set<Integer> union = new HashSet<>(set1Copy);
        union.addAll(set2Copy);
        log.debug("Объединение множеств: " + union);

        // Разность первого множества и второго
        Set<Integer> difference = new HashSet<>(set1Copy);
        difference.removeAll(set2Copy);
        log.debug("Разность первого множества и второго: " + difference);
    }
}
