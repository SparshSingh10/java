// 1️⃣ Public Constructor
// A public constructor is accessible from any class. This means that objects of
// the class can be created from anywhere in the program.

// Example: Public Constructor
// java
// Copy
// Edit
// class Car {
// public Car() {
// System.out.println("Car constructor called");
// }
// }

// public class Main {
// public static void main(String[] args) {
// Car car1 = new Car(); // Allowed, constructor is public
// }
// }

// 2️⃣ Private Constructor
// A private constructor is not accessible outside the class. It is typically
// used in singleton patterns

// 3️⃣ Protected Constructor
// A protected constructor is accessible within the same package or by
// subclasses (even if they are in a different package). This allows a class to
// control its constructor's access more tightly while still enabling
// inheritance.

// Example: Protected Constructor
// java
// Copy
// Edit
// class Animal {
// protected Animal() {
// System.out.println("Animal constructor called");
// }
// }

// class Dog extends Animal {
// public Dog() {
// super(); // Allowed, because Dog is a subclass of Animal
// System.out.println("Dog constructor called");
// }
// }

// public class Main {
// public static void main(String[] args) {
// Dog dog = new Dog(); // Allowed, constructor is protected and Dog is a
// subclass of Animal
// }
// }

// In Java, the access modifiers (private, public, protected, and
// package-private) are used to define the visibility and accessibility of
// classes, methods, fields, and constructors. The constructor of a class can
// also have these access modifiers, controlling how and where the constructor
// can be accessed.

// Let's go through each access modifier and understand how it works with
// constructors:

// 1️⃣ Public Constructor
// A public constructor is accessible from any class. This means that objects of
// the class can be created from anywhere in the program.

// Example: Public Constructor
// java
// Copy
// Edit
// class Car {
// public Car() {
// System.out.println("Car constructor called");
// }
// }

// public class Main {
// public static void main(String[] args) {
// Car car1 = new Car(); // Allowed, constructor is public
// }
// }
// Usage: When you want to allow object creation from any class.
// 2️⃣ Private Constructor
// A private constructor is not accessible outside the class. It is typically
// used in singleton patterns (when you want to restrict object creation to only
// one instance) or in utility classes (where you want to prevent instantiation
// of the class).

// Example: Private Constructor
// java
// Copy
// Edit
// class Singleton {
// private static Singleton instance;

// private Singleton() {
// System.out.println("Private constructor called");
// }

// public static Singleton getInstance() {
// if (instance == null) {
// instance = new Singleton();
// }
// return instance;
// }
// }

// public class Main {
// public static void main(String[] args) {
// // Singleton obj = new Singleton(); // ❌ Compilation Error: The constructor
// is private
// Singleton singleton = Singleton.getInstance(); // Allowed, through static
// method
// }
// }
// Usage: When you want to restrict instantiation of the class and control it
// using a static method (like in a Singleton).
// 3️⃣ Protected Constructor
// A protected constructor is accessible within the same package or by
// subclasses (even if they are in a different package). This allows a class to
// control its constructor's access more tightly while still enabling
// inheritance.

// Example: Protected Constructor
// java
// Copy
// Edit
// class Animal {
// protected Animal() {
// System.out.println("Animal constructor called");
// }
// }

// class Dog extends Animal {
// public Dog() {
// super(); // Allowed, because Dog is a subclass of Animal
// System.out.println("Dog constructor called");
// }
// }

// public class Main {
// public static void main(String[] args) {
// Dog dog = new Dog(); // Allowed, constructor is protected and Dog is a
// subclass of Animal
// }
// }

// Usage: When you want to restrict access but still allow inheritance or
// subclassing from other packages.
// 4️⃣ Default (Package-Private) Constructor
// If no access modifier is specified for a constructor, it is considered
// package-private (default access). This means that the constructor can only be
// accessed within the same package.

// class Parent {
// public final Parent() {
// System.out.println("Parent Constructor");
// }
// }

// // No error, but final constructor has no additional benefit

// In Method Overloading:

// A method can be overloaded as long as the method signatures differ (parameter
// count/type).
// final methods can be overloaded, but they cannot be overridden in subclasses.


// Constructor Overloading in Java
// Constructor overloading is a feature in Java where you can define multiple constructors in the same class with the same name but different parameters. This allows you to create objects in different ways, depending on the arguments passed to the constructor.

// Key Points:
// Same Name: All constructors must have the same name as the class.
// Different Parameter Lists: Constructors must have different parameter lists (either by changing the number of parameters or the types of parameters).
// No Return Type: Constructors don’t have a return type, not even void.