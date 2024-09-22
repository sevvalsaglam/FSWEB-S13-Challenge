package org.example;

import org.example.enums.Plan;

public class Healthplan {
    private long id;
    private String name;
    private Plan plan;

    public Healthplan(long id, String name, Plan plan){
        this.id=id;
        this.name=name;
        this.plan=plan;
    }
    public long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public Plan getPlan() {
        return this.plan;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}
