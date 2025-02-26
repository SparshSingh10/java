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
        HashMap<Integer, Slave> map2 = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new FileReader("slave.txt"));

        String line = br.readLine();

        while (line != null) {

            String[] arr = line.split(",");
            int id = Integer.parseInt(arr[0]);
            String name = arr[1];
            // double salary = Double.parseDouble(arr[2]);
            int salary = Integer.parseInt(arr[2].trim());

            // Employee obj = new Employee(id, name, salary);
            Slave obj = new Slave(id, name, salary);

            // map.put(id, obj);
            map2.put(id, obj);
            line = br.readLine();
        }
        br.close();

        // sortMap(map);
        sortMap(map2);

        System.out.println("Enter id to be searched");
        int n = sc.nextInt();
        // search(map, n);
        search(map2, n);
        // highest(map);
        highest(map2);
    }

    public static <K, V extends Employee> void highest(HashMap<K, V> map) {

        double max = Double.MIN_VALUE;
        for (K key : map.keySet()) {
            if (map.get(key).salary > max) {
                max = map.get(key).salary;
            }
        }
        System.out.println("Max Salary is " + max);
    }

    public static <K, V> void search(HashMap<K, V> map, int n) {
        for (K key : map.keySet()) {
            if (key.equals(n)) {
                System.out.println("Employee Found");
                return;
            }
        }
        System.out.println("Not Found");
    }

    public static <K extends Comparable<K>, V extends Employee> void sortMap(HashMap<K, V> map) {
        List<K> lis = new ArrayList<>(map.keySet());
        Collections.sort(lis); // Now it works because K extends Comparable<K>
        for (K item : lis)
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

class Slave extends Employee {
    String name;
    int id;
    int salary;

    public Slave(int id, String name, int salary) {
        super(id, name, salary);
    }
}
