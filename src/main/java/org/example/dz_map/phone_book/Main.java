package org.example.dz_map.phone_book;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {
        try {
            PhoneBook phoneBook = new PhoneBook();
            User user1 = new User("Ivan", "91243215334");
            User user2 = new User("Mahmud", "91243221411");
            User user3 = new User("Jesus", "91248912334");
            User user4 = new User("Rex", "912489123");

            phoneBook.addUserInPhoneBook(user1);
            phoneBook.addUserInPhoneBook(user2);
            phoneBook.addUserInPhoneBook(user3);

            log.debug("" + phoneBook.getPhoneBookUsers());

            log.debug("Данному человеку с именем " + user1.getUserName() + " принадлежит номер: " + phoneBook.findUserOfPhoneBook(
                    "Ivan"));

            phoneBook.removeUserByName("Jesus");
            log.debug("phoneBook after remove Jesus: " + phoneBook.getPhoneBookUsers());

            System.out.println();
            log.debug(phoneBook.findUserOfPhoneBook("Petr"));

            log.debug("\nПовторное удаление Jesus: ");
            phoneBook.removeUserByName("Jesus");

            log.debug("\nСоздание user4 с ошибочным номером: ");
            phoneBook.addUserInPhoneBook(user4);
            log.debug("" + phoneBook.getPhoneBookUsers());
        } catch (UserNotFoundException e) {
            log.debug(e.getMessage());
        }
    }
}