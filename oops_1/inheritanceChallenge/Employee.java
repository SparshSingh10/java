package oops_1.inheritanceChallenge;

public class Employee extends Worker {
    private String hireDate;
    private static int employeeNo=1;
    private int employeeId;

    public Employee(String name, String birthDate,String hireDate) {
        super(name, birthDate);
        this.employeeId = Employee.employeeNo++;
        this.hireDate = hireDate;
    }

   public String toString(){
    return "Employee[employeeId=" + employeeId  + ",hireDate=" + hireDate + "]"+super.toString();
   }

    

  

    
}
