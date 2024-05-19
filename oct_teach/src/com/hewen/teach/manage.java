package com.hewen.teach;

public class manage extends staff{

    private int level;

    public manage(String name, String address, String id, double wage, double age) {
        super(name, address, id, wage, age);
    }

    public manage(String name, String address, String id, double wage, double age, int level) {
        super(name, address, id, wage, age);
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public void salaryIncrease() {
        double wages = super.getWage();
        super.setWage(wages*1.1);
    }

    public void salaryIncrease(String type) {
        double wages = super.getWage();
        super.setWage(wages*1.2);
    }
}

