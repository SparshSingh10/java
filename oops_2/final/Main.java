// 1.1 Final Instance Variable

// class Example {
// final int x; // Must be initialized

// Example() {
// x = 10; // Allowed (initialized in constructor)
// }

// void display() {
// System.out.println(x);
// }
// }

// public class Main {
// public static void main(String[] args) {
// Example obj = new Example();
// obj.display(0);
// }
// }

// 1.2 Final Static Variable (Constant)

// class Example {
// static final int X = 100; // Initialized at declaration
// }

// or

// class Example {
// static final int X;

// // X = 100;wrong
// static {
// X = 100;
// }
// // right

// }

// class Example {
// static final int X; // Not initialized

// public static void main(String[] args) {
// System.out.println(X); // 💥 Compilation Error: variable X might not have
// been initialized
// }
// }

// class Example {
// static final int X; // Not initialized

// public static void main(String[] args) {
// System.out.println(X); // 💥 Compilation Error: variable X might not have
// been initialized
// }
// }

// Must be assigned before use.

// public class Main {
// public static void main(String[] args) {
// final int a;
// a = 10; // Allowed (first assignment)
// System.out.println(a); // Output: 10
// }
// }

// ✅ Correct

// public class Main {
// public static void main(String[] args) {
// final int a = 10;
// a = 20; // 💥 Compilation Error: cannot assign a value to final variable 'a'
// }
// }
// ❌ Error Case

// Final Method Parameter

// class Example {
// void display(final int x) {
// // x = x + 1; // ❌ Not Allowed
// System.out.println(x);
// }
// }

// class Parent {
// final void show() {
// System.out.println("Final method in Parent");
// }
// }

// Final Methods
// A final method cannot be overridden by subclasses.
// class Child extends Parent {
// void show() {
// System.out.println("Overriding");
// } // ❌ Compilation Error
// }

// public class Main {
// public static void main(String[] args) {
// Child obj = new Child();
// obj.show(); // Output: Final method in Parent
// }
// }

// A final class cannot be extended (inherited).

// final class FinalClass {
// void display() {
// System.out.println("Final class");
// }
// }

// class SubClass extends FinalClass {
// } // ❌ Compilation Error

// public class Main {
// public static void main(String[] args) {
// FinalClass obj = new FinalClass();
// obj.display(); // Output: Final class
// }
// }

// A final object cannot be reassigned to a new reference.
// class Example {}

// public class Main {
// public static void main(String[] args) {
// final Example obj = new Example();
// obj = new Example(); // 💥 Compilation Error: cannot assign a new object to
// final variable
// }
// }

// However, object fields can still be modified!

// class Example {
// int x = 10;
// }

// public class Main {
// public static void main(String[] args) {
// final Example obj = new Example();
// obj.x = 20; // Allowed (modifying fields)
// System.out.println(obj.x); // Output: 20
// }
// }

// An abstract class can have final methods, but they cannot be overridden

// abstract class AbstractExample {
// final void show() {
// System.out.println("Final method in abstract class");
// }
// }

// A method can be both static and final, which means:
// It cannot be overridden.
// It belongs to the class (not instance-specific).

// class Example {
//     static final void display() {
//         System.out.println("Static Final Method");
//     }
// }


// class Parent {
//     static final void display() {}
// }

// class Child extends Parent {
//     static void display() {} // 💥 Compilation Error: cannot override final method
// }

// 1️⃣ final variables must be initialized once and never reassigned.
// 2️⃣ final methods cannot be overridden.
// 3️⃣ final classes cannot be inherited.
// 4️⃣ final objects cannot be reassigned, but their fields can change.

// Why Can't a Constructor Be Final?
// A constructor is a special method that is used to initialize objects. It is not inherited by subclasses. Since the purpose of a constructor is to initialize an object of the class, the concept of overriding (which the final keyword prevents) does not apply to constructors.