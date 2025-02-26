import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AddressBookManagementSystem<T extends Contact> {
    HashMap<Long, T> contacts;

    public AddressBookManagementSystem() {
        this.contacts = new HashMap<>();
    }

    public void remove(long number) {
        if (contacts.containsKey(number))
            contacts.remove(number);
        else {
            System.out.println("Number not present");
        }
    }

    public void add(T contact) {
        if (contacts.containsKey(contact.number)) {
            System.out.println("Cannot add the contact as another contact with the same number is present");
            return;
        } else {
            contacts.put(contact.number, contact);
        }
    }

    public void update(long number, String name) {
        T contact = contacts.get(number);
        if (contact != null) {
            contact.name = name;
            System.out.println("Contact name updated");
        } else {
            System.out.println("Contact Not present");
        }
    }

    public void search(String name) {
        for (T contact : contacts.values()) {
            if (contact.name.equals(name)) {
                contact.display();
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void relationship(long number1, long number2) {
        T c1 = contacts.get(number1);
        T c2 = contacts.get(number2);
        if (c1 == null || c2 == null) {
            System.out.println("One or both contacts not found.");
            return;
        }
        if (c1.address.equals(c2.address)) {
            System.out.println("Has common address");
        } else {
            System.out.println("Does not have common address");
        }
    }

    public void sorting() {
        List<Long> sortedKeys = new ArrayList<>(contacts.keySet());
        Collections.sort(sortedKeys);

        for (Long key : sortedKeys) {
            System.out.println(contacts.get(key).number + " " + contacts.get(key).name);
        }
    }

    public static void main(String[] args) {
        AddressBookManagementSystem<Contact> addressBook = new AddressBookManagementSystem<>();

        Contact c1 = new Contact("Rahul", 9876543210L, "rahul@yahoo.com", "agra");
        Contact c2 = new Contact("Vijay", 9123456780L, "vijay@gmail.com", "kanpur");
        Contact c3 = new Contact("Arsh", 8158445455L, "arsh@gmail.com", "agra");

        addressBook.add(c1);
        addressBook.add(c2);
        addressBook.add(c3);

        System.out.println("\n--- Searching for Rahul ---");
        addressBook.search("Rahul");

        System.out.println("\n--- Checking relationship ---");
        addressBook.relationship(9876543210L, 9123456780L);
        System.out.println("\n--- Checking relationship ---");
        addressBook.relationship(9876543210L, 8158445455L);

        System.out.println("\n--- Sorting Contacts by Phone Number ---");
        addressBook.sorting();

        addressBook.update(8158445455L, "Sparsh");
        System.out.println("\n--- Sorting Contacts by Phone Number ---");
        addressBook.sorting();
    }
}

class Contact {
    String name;
    long number;
    String email;
    String address;

    public Contact(String name, long number, String email, String address) {
        this.name = name;
        this.number = number;
        this.email = email;
        this.address = address;
    }

    public void display() {
        System.out.println("Name of the contact is : " + this.name);
        System.out.println("Phone number of the contact is : " + this.number);
        System.out.println("Email of the contact is : " + this.email);
        System.out.println("Address of the contact is : " + this.address);
    }
}
