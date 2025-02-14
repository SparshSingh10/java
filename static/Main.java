class DatabaseConfig {
    static String url;
    static String username;
    // Static block
    static {
        url = "jdbc:mysql://localhost:3306/mydb";
        username = "admin";
        System.out.println("Static block executed");
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(DatabaseConfig.url); // Output:

        // jdbc:mysql://localhost:3306/mydb
    }
}