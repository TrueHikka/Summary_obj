package org.example.dz_map.phone_book;

import java.util.HashMap;

public interface Users {
    HashMap<String, String> getPhoneBookUsers();

    void addUserInPhoneBook(User user) throws UserNotFoundException;

    String findUserOfPhoneBook(String name) throws UserNotFoundException;

    void removeUserByName(String name) throws UserNotFoundException;
}
