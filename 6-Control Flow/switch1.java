public class switch1 {

    public static void main(String[] args) {
        int n = 7;

        // switch(n){
        // // byte short int char
        // // Byte Short Integer Character
        // // String enum
        // case 1:
        // System.out.println("Value is "+n);
        // break;
        // case 2:
        // System.out.println("Value is "+n);
        // break;
        // case 3:case 4:case 5:
        // System.out.println("Value is "+n);
        // break;
        // default:
        // System.out.println("Default Value is "+n);
        // break;

        // }

        // Enhanced Switch Statement
        // switch(n){
        // case 1 -> System.out.println("Value is "+n);
        // case 2 -> System.out.println("Value is "+n);
        // case 3, 4, 5 -> System.out.println("Value is "+n);
        // default -> System.out.println("Default Value is "+n);

        // }
        String month = "feb";
        System.out.println(getQuarter(month));

    }

    // Enhanced Switch Statement with return
    public static String getQuarter(String month) {
        return switch (month.toUpperCase()) {
            case "JAN", "FEB", "MARCH" -> "1st";
            // case "JAN", "FEB", "MARCH" ->{yield "1st";} yeild can be used anywher when
            // multiple lines neede due calculation etc.

            case "APRIL", "MAY", "JUNE" -> "2ND";
            case "JUL", "AUG", "SEPT" -> "3RD";
            case "OCT", "NOV", "DEC" -> "4TH";
            // default -> "BAD";
            default -> {
                String ans = month + " is bad";
                yield ans;
                // yield: Used when you want to perform multiple actions inside a case block and
                // return a value.
            }
        };
    }

}