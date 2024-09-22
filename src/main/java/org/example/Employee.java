package org.example;

public class Employee {
   private long id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthPlans;

    public long getId() {
        return this.id;
    }

    public String getFullName() {
        return this.fullName;
    }

    public String getEmail() {
        return this.email;
    }

    public String getPassword() {
        return this.password;
    }

    public String[] getHealthPlans() {
        return this.healthPlans;
    }

    public Employee(long id, String fullName, String email, String password, String[] healthPlans){

   }

   public String addHealthPlan(int index, String name){

   }
}
