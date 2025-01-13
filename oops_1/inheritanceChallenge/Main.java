package oops_1.inheritanceChallenge;


public class Main {
        public static void main(String[] args) {
            // Employee tim = new Employee("Tim", "01/01/1990", "01/01/2010");
            // System.out.println(tim);
            // System.out.println("Age = "+tim.getAge());
            // System.out.println("Pay = "+tim.collectPay());

            SalarisedEmployee joe =new SalarisedEmployee("Joe", "01/01/1995", "01/01/2015",35000);
            System.out.println(joe);
            System.out.println("joe's Paycheck = $"+joe.collectPay());
            joe.retire();
            // Employee rahul =new Employee("rahul", "01/01/1995", "01/01/2015");
            // System.out.println(rahul);
        }

}
