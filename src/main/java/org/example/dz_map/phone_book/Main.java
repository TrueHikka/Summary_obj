package org.example.dz_map.phone_book;

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

            System.out.println(phoneBook.getPhoneBookUsers());

            System.out.println("Данному человеку с именем " + user1.getUserName() + " принадлежит номер: " + phoneBook.findUserOfPhoneBook(
                    "Ivan"));

            phoneBook.removeUserByName("Jesus");
            System.out.print("phoneBook after remove Jesus: " + phoneBook.getPhoneBookUsers());

            System.out.println();
            System.out.println(phoneBook.findUserOfPhoneBook("Petr"));

            System.out.print("\nПовторное удаление Jesus: ");
            phoneBook.removeUserByName("Jesus");

            System.out.print("\nСоздание user4 с ошибочным номером: ");
            phoneBook.addUserInPhoneBook(user4);
            System.out.print(phoneBook.getPhoneBookUsers());
        } catch (UserNotFoundException e) {
            System.err.println(e.getMessage());
        }
    }
}