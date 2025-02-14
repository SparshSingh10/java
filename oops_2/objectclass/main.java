// In Java, the Object class is the root class of the class hierarchy. Every class in Java, whether it's a user-defined class or part of the Java standard library, implicitly inherits from Object. This means that every class in Java inherits the methods defined in the Object class, even if they are not explicitly stated.

// Key Points About the Object Class:
// Implicit Inheritance:

// Every class in Java implicitly extends Object. If you don't specify a superclass, Java automatically inherits from Object.
// Example:
// java
// Copy
// Edit
// class Dog {
//     // Inherited from Object class
// }
// Here, Dog is inheriting from Object, even though you didn't explicitly write extends Object.
// Common Methods in Object: The Object class provides several commonly used methods that are inherited by all Java objects:

// toString(): Returns a string representation of the object (you can override this to provide a custom string for your object).
// equals(Object obj): Compares two objects for equality.
// hashCode(): Returns a hash code value for the object.
// getClass(): Returns the Class object associated with the object, which can be used to obtain the class name and other information.
// clone(): Creates a shallow copy of the object (this method needs the class to implement Cloneable).
// finalize(): Called by the garbage collector before an object is destroyed. (However, it's rarely used in modern Java.)
// 1. toString():
// The toString() method returns a string representation of an object.
// By default, it returns the class name followed by the hash code of the object.
// You can override this method in your class to provide a more meaningful string representation.
// Example:

// java
// Copy
// Edit
// class Dog {
//     String name;
//     int age;

//     Dog(String name, int age) {
//         this.name = name;
//         this.age = age;
//     }

//     @Override
//     public String toString() {
//         return "Dog{name='" + name + "', age=" + age + "}";
//     }
// }

// public class Test {
//     public static void main(String[] args) {
//         Dog dog = new Dog("Buddy", 3);
//         System.out.println(dog);  // Output: Dog{name='Buddy', age=3}
//     }
// }
// 2. equals(Object obj):
// The equals() method checks whether two objects are equal.
// By default, it compares the memory addresses (i.e., checks if the two references point to the same object).
// You can override this method to provide custom equality logic based on the object's fields.