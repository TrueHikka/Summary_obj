package org.example.list_dz.lists;

import java.util.Objects;

public class Food {
    private String nameFood;

    public Food() {

    }

    public Food(String nameFood) {
        this.nameFood = nameFood;
    }

    public String getNameFood() {
        return nameFood;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Food food = (Food) o;
        return Objects.equals(nameFood, food.nameFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameFood);
    }

    @Override
    public String toString() {
        return nameFood;
    }
}
