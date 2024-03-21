package org.example.dz_map.phone_book;

import java.util.HashMap;

public class PhoneBook implements Users{
    private HashMap<String, String> usersPhoneBook;

    public PhoneBook() {
        usersPhoneBook = new HashMap<>();
    }

    @Override
    public HashMap<String, String> getPhoneBookUsers() {
        return usersPhoneBook;
    }

    @Override
    public void addUserInPhoneBook(User user) throws UserNotFoundException {
        int quantityNumsOFUserPhoneNumber = user.getUserPhoneNumber().length();
        if (quantityNumsOFUserPhoneNumber == 11) {
            usersPhoneBook.put(user.getUserName(), user.getUserPhoneNumber());
        } else {
            int differentInPhoneNumbers = 11 - quantityNumsOFUserPhoneNumber;
            throw new UserNotFoundException("Номер пользователя " + user.getUserName() + " должен содержать 11 цифр. " +
                    "Не хватает " + differentInPhoneNumbers + " цифры(цифр)");
        }
    }

    @Override
    public String findUserOfPhoneBook(String name) throws UserNotFoundException {
        if (usersPhoneBook.containsKey(name)) {
            return usersPhoneBook.get(name);
        }
        throw new UserNotFoundException("Человека c именем " + name + " нет в телефонной книге");
    }

    @Override
    public void removeUserByName(String name) throws UserNotFoundException {
        if (!usersPhoneBook.containsKey(name)) {
           throw new UserNotFoundException ("Пользователь удален или изменен");
        } else {
            usersPhoneBook.remove(name);
        }
    }
}
