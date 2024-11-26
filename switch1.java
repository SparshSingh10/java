public class switch1{

    public static void main(String[] args) {
        int n=7;

        switch(n){ 
            // byte short int char
            // Byte Short Integer Character
            // String enum
            case 1:
                System.out.println("Value is "+n);
                break;
            case 2:
                System.out.println("Value is "+n);
                break;
            case 3:case 4:case 5:
                    System.out.println("Value is "+n);
                    break;
            default:
                System.out.println("Default Value is "+n);
                break;

            
        }
    }
    
}