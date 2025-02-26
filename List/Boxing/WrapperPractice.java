public class WrapperPractice {

    public static void main(String[] args) {

        // Converting primitive types to wrapper objects using valueOf()
        Integer intObj = Integer.valueOf(10); // Integer object wrapping an int
        Double doubleObj = Double.valueOf(20.5); // Double object wrapping a double
        Character charObj = Character.valueOf('A'); // Character object wrapping a char
        Boolean boolObj = Boolean.valueOf("true"); // Boolean object wrapping a boolean

        // Printing the wrapper objects
        System.out.println("Integer object: " + intObj);
        System.out.println("Double object: " + doubleObj);
        System.out.println("Character object: " + charObj);
        System.out.println("Boolean object: " + boolObj);

        // Unboxing: Converting wrapper objects back to primitives
        int intValue = intObj.intValue();
        double doubleValue = doubleObj.doubleValue();
        char charValue = charObj.charValue();
        boolean boolValue = boolObj.booleanValue();

        // Printing the unboxed primitive values
        System.out.println("\nUnboxed values:");
        System.out.println("int value: " + intValue);
        System.out.println("double value: " + doubleValue);
        System.out.println("char value: " + charValue);
        System.out.println("boolean value: " + boolValue);

        // Working with a wrapper class as an object (using methods)
        System.out.println("\nWorking with Integer methods:");
        int sum = intObj + 5; // object +primitive becomes primitive
        System.out.println("Sum with intObj: " + sum);

        // Parsing a string to an integer using valueOf
        String str = "42";
        Integer parsedValue = Integer.valueOf(str);
        System.out.println("\nParsed Integer from String: " + parsedValue);
    }
}
