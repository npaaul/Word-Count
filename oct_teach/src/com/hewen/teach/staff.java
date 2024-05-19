package com.hewen.teach;

public abstract class staff extends person{
    private String Id;
    private double wage;
    private double age;

    public staff(String name, String address, String id, double wage, double age) {
        super(name, address);
        this.Id = id;
        this.wage = wage;
        this.age = age;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

   public abstract void salaryIncrease(String type);

}