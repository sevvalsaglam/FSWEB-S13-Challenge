package org.example;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames ){
        this.id=id;
        this.name=name;
        this.giro=giro;
        this.developerNames=developerNames;
    }


    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public double getGiro() {
        if(this.giro<0){
            this.giro=0;
        }
        return this.giro;
    }

    public String[] getDeveloperNames() {
        return developerNames;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGiro(double giro) {
        if(this.giro<0){
            this.giro=0;
        }else{
            this.giro = giro;
        }
    }

    public void setDeveloperNames(String[] developerNames) {
        this.developerNames = developerNames;
    }

    public void addEmployee(int index, String name){
       if(index<0 || index>=developerNames.length){
           System.out.println("Hata: İlgili index değeri dizi sınırlarının dışında.");
       }else {
           if(developerNames[index] == null){
               developerNames[index]= name;
           }else {
               System.out.println("Hata: İlgili index dolu, yeni sağlık planı eklenemedi.");
           }
       }
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + Arrays.toString(developerNames) +
                '}';
    }
}
