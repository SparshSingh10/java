
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {

    
    public static void main(String[] args) throws IOException {

        HashMap<Integer, Employee> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("employee.txt"));

        String line = br.readLine();

        while (line != null) {

            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            double salary = Double.parseDouble(arr[2]);

            Employee obj = new Employee(id, name, salary);

            map.put(id, obj);
            line = br.readLine();

        }
        br.close();

        sortMap(map);

        System.out.println("Enter id to be searched");
        int n = sc.nextInt();
        search(map, n);
        heighest(map);

    }

    public static void heighest(HashMap<Integer, Employee> map) {
        double max = Integer.MIN_VALUE;
        for (int key : map.keySet()) {
            if (map.get(key).salary > max) {
                max = map.get(key).salary;
            }
        }
        System.out.println("Max Salary is " + max);
    }

    public static void search(HashMap<Integer, Employee> map, int n) {
        for (int key : map.keySet()) {
            if (key == n) {
                System.out.println("Employee Found");
                return;
            }

        }
        System.out.println("Not Found");
    }

    public static void sortMap(HashMap<Integer, Employee> map) {

        List<Integer> lis = new ArrayList<>(map.keySet());
        Collections.sort(lis);
        for (int item : lis)
            System.out.println(item + "\t" + map.get(item).name + "\t\t" + map.get(item).salary);
    }
}

class Employee {

    String name;
    int id;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

}