package org.example;

public class Employee {
   private long id;
   private String fullName;
   private String email;
   private String password;
   private String[] healthPlans;

   public Employee(long id,String fullName,String  email, String password, String[] healthPlans){
       this.id=id;
       this.fullName=fullName;
       this.email=email;
       this.password=password;
       this.healthPlans=healthPlans;
   }

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



   public String addHealthPlan(int index, String name){
       for(int i=0; i<healthPlans.length; i++){
           if(healthPlans[i]== null){
               healthPlans[i]=name;
           }else {
               System.out.println("index dolu");
           }
       }
       return name;
   }
}
