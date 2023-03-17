package Exam;

import java.util.HashMap;
import java.util.Scanner;

public class Contact {
    public static class AdrsBook {
        public void main(String[] args) {
            HashMap<String, AddressBook.Contact> contacts = new HashMap<>();
            Scanner scanner = new Scanner(System.in);

            while (true) {
                System.out.println("AdrsBook:");
                System.out.println("1. Add new contact");
                System.out.println("2. Find a contact by name");
                System.out.println("3. Display contacts");
                System.out.println("4. Exit");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1:
                        System.out.print("Enter contact name: ");
                        String name = scanner.nextLine();

                        System.out.print("Enter contact phone: ");
                        String phone = scanner.nextLine();

                        AddressBook.Contact contact = new AddressBook.Contact(name, phone);
                        contacts.put(name, contact);
                        break;
                    case 2:
                        System.out.print("Enter customer name: ");
                        name = scanner.nextLine();
                        contact = contacts.get(name);
                        if (contact != null) {
                            System.out.println("Contact information:");
                            System.out.println("Name: " + contact.getName());
                            System.out.println("Phone: " + contact.getPhone());
                        } else {
                            System.out.println("Not found");
                        }
                        break;
                    case 3:
                        System.out.println("All contacts:");
                        for (AddressBook.Contact c : contacts.values()) {
                            System.out.println("Name: " + c.getName() + "Phone: " + c.getPhone());
                        }
                        break;
                    case 4:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Invalid choice. Try again.");
                }
            }
        }
    }
}