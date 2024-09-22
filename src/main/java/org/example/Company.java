package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    String[] developerNames;

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

    public String addEmployee(int index, String name){
        for(int i=0; i<developerNames.length; i++){
            if(developerNames[i]==null){
                developerNames[i]=name;
            }else {
                System.out.println("index dolu");
            }

        }
        return name;
    }
}
