package org.example.list_dz;


import org.example.list_dz.book.BookShelf;
import org.example.list_dz.lists.Food;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        //task-1
        List<Food> favoriteFruits = new ArrayList<>();
        favoriteFruits.add(new Food("Banana"));
        favoriteFruits.add(new Food("Pineapple"));
        favoriteFruits.add(new Food("Mango"));
        favoriteFruits.add(new Food("Kiwi"));
        favoriteFruits.add(new Food("Apple"));

        List<Food> favoriteVegetables = new ArrayList<>();
        favoriteVegetables.add(new Food("Cucumber"));
        favoriteVegetables.add(new Food("Cabbage"));
        favoriteVegetables.add(new Food("Salad"));
        favoriteVegetables.add(new Food("Onion"));
        favoriteVegetables.add(new Food("Garlic"));

        List<Food> allFood = new LinkedList<>(favoriteFruits);
        allFood.addAll(favoriteVegetables);

        System.out.println(allFood.containsAll(favoriteFruits));
        System.out.println(allFood.containsAll(favoriteVegetables));

        System.out.print("List before remove vegetables: ");
        System.out.print(allFood);

        allFood.removeAll(favoriteVegetables);
        System.out.print("\nList after remove vegetables: ");

        System.out.println(allFood);

        //task-2
        BookShelf bookShelf = new BookShelf();
        bookShelf.addBook("Кислотный дом");
        bookShelf.addBook("Чистый код");
        bookShelf.addBook("Библия");
        System.out.println(bookShelf.listBook());
        bookShelf.removeBook("Библия");
        System.out.println(bookShelf.listBook());
    }
}