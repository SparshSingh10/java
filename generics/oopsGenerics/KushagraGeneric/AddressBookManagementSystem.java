import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class AddressBookManagementSystem<T extends Person> { // T must extend Person
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

    public void add(Long number, T contact) {
        if (contacts.containsKey(number)) {
            System.out.println("Cannot add the contact as another contact with the same number is present");
            return;
        }
        contacts.put(number, contact);
    }

    public void update(long number, T updatedContact) {
        if (contacts.containsKey(number)) {
            contacts.put(number, updatedContact);
            System.out.println("Contact updated");
        } else {
            System.out.println("Contact Not present");
        }
    }

    public void search(String name) {
        for (T contact : contacts.values()) {
            if (contact.getName().equalsIgnoreCase(name)) { // Now works for both Contact & Employee
                contact.display();
                return;
            }
        }
        System.out.println("Contact not found");
    }

    public void sorting() {
        List<Long> sortedKeys = new ArrayList<>(contacts.keySet());
        Collections.sort(sortedKeys);

        for (Long key : sortedKeys) {
            System.out.println(contacts.get(key).getId() + " " + contacts.get(key).getName());
        }
    }

    public static void main(String[] args) {
        // Testing with Contact Class
        AddressBookManagementSystem<Contact> addressBook = new AddressBookManagementSystem<>();

        Contact c1 = new Contact("Rahul", 9876543210L, "rahul@yahoo.com", "Agra");
        Contact c2 = new Contact("Vijay", 9123456780L, "vijay@gmail.com", "Kanpur");
        Contact c3 = new Contact("Arsh", 8158445455L, "arsh@gmail.com", "Agra");

        addressBook.add(c1.getId(), c1);
        addressBook.add(c2.getId(), c2);
        addressBook.add(c3.getId(), c3);

        System.out.println("\n--- Searching for Rahul ---");
        addressBook.search("Rahul");

        System.out.println("\n--- Sorting Contacts by Phone Number ---");
        addressBook.sorting();

        // Testing with Employee Class
        AddressBookManagementSystem<Employee> employeeBook = new AddressBookManagementSystem<>();

        Employee e1 = new Employee("John", 101, "HR", "New York");
        Employee e2 = new Employee("Alice", 102, "Engineering", "San Francisco");
        Employee e3 = new Employee("Bob", 103, "Marketing", "New York");

        employeeBook.add(e1.getId(), e1);
        employeeBook.add(e2.getId(), e2);
        employeeBook.add(e3.getId(), e3);

        System.out.println("\n--- Searching for Alice ---");
        employeeBook.search("Alice");

        System.out.println("\n--- Sorting Employees by Employee ID ---");
        employeeBook.sorting();
    }
}

// 🔥 Interface to ensure all objects have a name & ID
interface Person {
    String getName();

    long getId();

    void display();
}

// 📞 Contact Class
class Contact implements Person {
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

    @Override
    public String getName() {
        return name;
    }

    @Override
    public long getId() {
        return number;
    }

    @Override
    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Phone: " + this.number);
        System.out.println("Email: " + this.email);
        System.out.println("Address: " + this.address);
    }
}

// 👨‍💼 Employee Class
class Employee implements Person {
    String empName;
    long empId;
    String department;
    String address;

    public Employee(String empName, long empId, String department, String address) {
        this.empName = empName;
        this.empId = empId;
        this.department = department;
        this.address = address;
    }

    @Override
    public String getName() {
        return empName;
    }

    @Override
    public long getId() {
        return empId;
    }

    @Override
    public void display() {
        System.out.println("Employee Name: " + this.empName);
        System.out.println("Employee ID: " + this.empId);
        System.out.println("Department: " + this.department);
        System.out.println("Address: " + this.address);
    }
}
