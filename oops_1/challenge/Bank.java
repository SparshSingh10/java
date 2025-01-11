package oops_1.challenge;

public class Bank {

    private int num;
    private double bal;
    private String name;
    private String email;
    private int phone;

    // empty constructor
    public Bank(){
        System.out.println("Empty constructor called");
    }

    // constructor overloading to set the values of the instance variables
    public Bank(String name, String email, int phone,double balance,int num){
        System.out.println("Parameterized constructor called");
        this.name=name;
        this.email=email;
        this.phone=phone;
        this.num=num;
        bal=balance;
        System.out.println("Name is "+name+" Email is "+email+" Phone is "+phone+" Balance is "+bal+" Account number is "+num);

    } 
    public int getNum(){
        return num;
    }
    public double getBal(){
        return bal;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public int getPhone() {
        return phone;
    }
    
    public void setNum(int num) {
        this.num = num;
    }
    public void setBal(double bal){
        this.bal=bal;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhone(int phone) {
        this.phone = phone;
    }
    public void deposit(double amount){
        bal=bal+amount;
        System.out.println("Deposited amount is "+amount+" and the balance is "+bal);
    }
    public void withdraw(double amount){
        if(bal-amount<0){
            System.out.println("Insufficient balance");
        }
        else{
          bal=bal-amount;
            System.out.println("Withdrawn amount is "+amount+" and the balance is "+bal);
        }
    }
    public static void main(String[] args) {
        // Bank bn=new Bank();
        // bn.setName("arsh");
        // bn.setBal(5000);
        // bn.deposit(500);
        // bn.withdraw(4000);
        // bn.withdraw(2000);

        // this is the way to create the object of the class and call the methods
        Bank arsh =new Bank("arsh","arsh@gmail",1234567890,5000,123456);
        System.out.println(arsh.getBal());
        arsh.deposit(500);
        System.out.println(arsh.getBal());

        // Another object of the class
        Bank sparsh =new Bank("sparsh","sparsh@gmail",1234567891,1000,123457);
        System.out.println(sparsh.getBal());
        
    }

}
