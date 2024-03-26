package org.example.stream;


import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

       //task-1
        List<String> strings = Arrays.asList(
                "pineapple",
                "rat",
                "moon",
                "sick",
                "oh my god",
                "omg"
        );

        List<String> stringLengthMoreThan5 = strings.stream()
                .filter(str -> str.length() > 5)
                .toList();
        System.out.println("Строки, длина которых больше 5: " + stringLengthMoreThan5);

        List<String> reverseSortingOfStrings = strings.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Строки, отсортированные в обратном порядке: " + reverseSortingOfStrings);

        List<String> reverseSortingOfStringsLengthMoreThan5 = stringLengthMoreThan5.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
        System.out.println("Строки, длина которых больше 5, отсортированные в обратном порядке: " + reverseSortingOfStringsLengthMoreThan5);

        //task-2
        List<Book> books = Arrays.asList(
                new Book("Мартин Иден", 1909),
                new Book("На игле", 1993),
                new Book("Клей", 2001),
                new Book("Биология добра и зла", 2017),
                new Book("Резьба по живому", 2016),
                new Book("Кошмары аиста марабу", 1995)
        );

        List<String> booksMoreThan2000 = books.stream()
                .filter(b -> b.getYear() > 2000)
                .map(Book::getName)
                .toList();

        System.out.println("Названия книг, изданных после 2000 года: " + booksMoreThan2000);


        //task-3
        List<Integer> numbers = Arrays.asList(15, 8, 11, 88, 76, 1, 777);

        Integer sumNumbers = numbers.stream()
                .reduce(0, Integer::sum);

        System.out.println("Сумма всех чисел в списке = " + sumNumbers);

        int[] numbersArray = numbers.stream()
                .mapToInt(Integer::intValue)
                .toArray();

        double average = Arrays.stream(numbersArray)
                .average()
                .orElse(0);

        System.out.println("Среднее значение всех чисел = " + average);

        List<Integer> numsMoreThan10 = numbers.stream()
                .filter(num -> num > 10)
                .sorted(Comparator.comparingInt(Integer::intValue))
                .toList();
        System.out.println("Числа, которые > 10: " + numsMoreThan10);

    }
}