package oops_1.inheritanceChallenge;

public class SalarisedEmployee extends Employee {
    private double annualSalary;
    private boolean isRetired;

    
    public SalarisedEmployee(String name, String birthDate, String hireDate, double annualSalary) {
        super(name, birthDate, hireDate);
        this.annualSalary = annualSalary;
    }

    @Override
    public double collectPay() {
        return (int) (annualSalary/12);
    }

    public void retire(){
        terminate("12/12/2025");
        isRetired = true;
        System.out.println("Employee " + name + " has retired");
    }
}
