package oops_1.constructor_challenge;

public class customer {
    
    private String name;
    private double creditLimit;
    private String email;

    public String getName(){
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public customer(String name,double creditLimit,String email){
        this.name=name;
        this.creditLimit=creditLimit;
        this.email=email;

    }
    public customer(String name,String email){
        this(name, 1000, email);
    }
    public static void main(String[] args) {
        customer cus=new customer("Arsh","arsh@gmail.com");
        System.out.println("Name is "+cus.getName()+", credit = "+cus.getCreditLimit()+", email is "+cus.getEmail());

    }



}
