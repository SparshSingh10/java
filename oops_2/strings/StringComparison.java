// Strings in Java are a fundamental part of the language. Understanding how
// strings are formed, their storage mechanism, and some key concepts about
// String manipulation is important for interviews. Let's dive deep into all
// aspects of Strings in Java!

// 1. String Creation in Java
// Strings in Java are objects that are instances of the String class. There are
// different ways to create strings, each with distinct behaviors.

// 1.1 String Literal (String Pool)
// java
// Copy
// Edit
// String str1 = "Hello";
// String str2 = "Hello";
// String Pool: Java maintains a special area in memory called the String Pool.
// When you create a string using a literal (like "Hello"), Java checks if that
// string already exists in the String Pool.
// If it exists, Java reuses the existing string from the pool, making it memory
// efficient.
// If it doesn't exist, Java adds the new string to the pool.
// Advantages:
// Memory efficiency (reusing the same string).
// Faster comparison (using ==).
// 1.2 Using new Keyword (Heap Memory)
// java
// Copy
// Edit
// String str3 = new String("Hello");
// When you use the new keyword, Java creates a new string object in heap
// memory, and it also adds the string literal to the String Pool (if it wasn't
// there already).
// Disadvantage: This can lead to increased memory usage as new string objects
// are created each time.
// 1.3 Using StringBuilder or StringBuffer
// java
// Copy
// Edit
// StringBuilder str4 = new StringBuilder("Hello");
// String str5 = str4.toString();
// These classes allow dynamic string manipulation (like appending, inserting,
// or deleting characters).
// When to use: If you're going to perform multiple string manipulations, like
// appending or concatenation, use StringBuilder (it's faster than creating new
// String objects every time).
// 2. String Storage and Memory Management
// 2.1 String Pool (Interning)
// The String Pool is a special area of memory that is part of Heap Memory. The
// pool stores string literals.
// Interning: When you create a string using a string literal, Java
// automatically stores it in the pool, making sure that each literal appears
// only once. This helps avoid duplicate string objects and saves memory.
// 2.2 Memory Locations
// String literals are stored in the String Pool (in the Heap Memory).
// String objects created with new are stored in the Heap Memory, but the
// literal part can be stored in the String Pool.
// String objects are immutable (cannot be changed). If you modify a string,
// Java creates a new string in memory rather than modifying the original one.
// 2.3 String Immutability
// Strings are immutable, meaning once a string object is created, its value
// cannot be changed.
// java
// Copy
// Edit
// String str = "Hello";
// str = str + " World"; // A new string object is created, and str now points
// to the new object.
// This immutability ensures that string objects can safely be shared across
// multiple threads.
// 3. String Methods
// Java provides a rich set of methods for working with strings. Some commonly
// used ones are:

// 3.1 Basic Methods
// length(): Returns the length of the string.
// charAt(int index): Returns the character at the specified index.
// substring(int startIndex, int endIndex): Extracts a substring from the
// string.
// contains(CharSequence sequence): Checks if the string contains the specified
// sequence.
// indexOf(String str): Returns the index of the first occurrence of the
// specified string.
// equals(Object obj): Compares the string with another object (checks if they
// are equal).
// compareTo(String anotherString): Compares two strings lexicographically.
// 3.2 Manipulation Methods
// concat(String str): Concatenates the given string with the original string.
// replace(char oldChar, char newChar): Replaces all occurrences of the old
// character with the new one.
// toUpperCase(): Converts the string to uppercase.
// toLowerCase(): Converts the string to lowercase.
// trim(): Removes whitespace from both ends of the string.
// 3.3 Other Useful Methods
// split(String regex): Splits the string into an array of substrings based on a
// regular expression.
// matches(String regex): Checks if the string matches a given regular
// expression.
// 4. Interview Questions on Strings
// Here are some common interview questions that test your knowledge of strings
// in Java:

// 4.1 String Pool and new Keyword
// Q: What is the difference between using new String("abc") and "abc"?
// A: "abc" uses the String Pool and may reuse an existing string, while new
// String("abc") creates a new object on the heap and doesn't use the String
// Pool unless intern() is called.
// 4.2 String Immutability
// Q: Why are strings immutable in Java?
// A: String immutability ensures that strings can be safely shared between
// multiple threads without synchronization. It also prevents changes to
// strings, reducing errors and ensuring better performance in some cases.
// 4.3 String Comparisons
// Q: What’s the difference between == and .equals() when comparing strings?
// A:
// == checks reference equality (whether two references point to the same
// object).
// .equals() checks value equality (whether the values of the two strings are
// the same).
// 4.4 String Reverse
// Q: How can you reverse a string without using any library functions?
// A: You can reverse a string manually using a loop or recursion:
// java
// Copy
// Edit
// String reverse(String str) {
// String reversed = "";
// for (int i = str.length() - 1; i >= 0; i--) {
// reversed += str.charAt(i);
// }
// return reversed;
// }
// 4.5 String Concatenation
// Q: What happens when you concatenate strings using +?
// A: When you use + for string concatenation, Java internally uses a
// StringBuilder to build the final string, but if used in loops, it can be
// inefficient due to the creation of multiple intermediate string objects. For
// multiple concatenations, StringBuilder is preferred.
// 4.6 String vs StringBuilder
// Q: When should you use StringBuilder instead of String?
// A: StringBuilder is more efficient when you perform many string manipulations
// (such as appending, inserting, or replacing). Since String objects are
// immutable, each modification creates a new string, which can lead to
// performance overhead.
// 4.7 String Pool Interning
// Q: What is string interning in Java?

// A: String interning is the process of storing only one copy of each distinct
// string in a special memory area called the String Pool. The intern() method
// can be used to add a string to the String Pool or check if it's already
// there.

// java
// Copy
// Edit
// String str = new String("abc");
// String internedStr = str.intern();
// 4.8 Palindrome Check
// Q: How would you check if a string is a palindrome in Java?
// A:
// java
// Copy
// Edit
// boolean isPalindrome(String str) {
// String reversed = new StringBuilder(str).reverse().toString();
// return str.equals(reversed);
// }