package org.example;

import java.util.Arrays;

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



   public void addHealthPlan(int index, String name){

       if (index < 0 || index >= healthPlans.length) {
           System.out.println("Hata: İlgili index değeri dizi sınırlarının dışında.");
       } else {
           // Eğer index boşsa name değişkenini ilgili indekse atıyoruz
           if (healthPlans[index] == null) {
               healthPlans[index] = name;
               System.out.println("Sağlık planı " + name + " başarıyla " + index + " indeksine eklendi.");
           } else {
               // Eğer ilgili index doluysa, uyarı mesajı gösteriyoruz
               System.out.println("Hata: İlgili index dolu, yeni sağlık planı eklenemedi.");
           }
       }
   }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", healthPlans=" + Arrays.toString(healthPlans) +
                '}';
    }
}
