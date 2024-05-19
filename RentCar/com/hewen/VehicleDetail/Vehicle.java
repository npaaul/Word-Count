package com.hewen.VehicleDetail;


import java.io.Serializable;

public abstract class Vehicle implements Serializable {
    private int index;
    private String brand;
    private String type;
    private int perRent;
    private boolean rentStatus = false;//租赁状态
    private int rentDays = 0;
    private String vehicleid="";
    private String carType = "";
    private String rentName;

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public Vehicle() {}

    public Vehicle(String brand, String type, int perRent, String vehicleid) {
        this.brand = brand;
        this.type = type;
        this.perRent = perRent;
        this.vehicleid = vehicleid;
    }

    public String getVehicleid() {
        return vehicleid;
    }

    public void setVehicleid(String vehicleid) {
        this.vehicleid = vehicleid;
    }

    public String getBrand() {
        return brand;}
    public void setBrand(String brand) {
        this.brand = brand;}
    public String getType() {
        return type;}
    public void setType(String type) {
        this.type = type;}
    public int getPerRent() {
        return perRent;}
    public void setPerRent(int perRent) {
        this.perRent = perRent;}
    public boolean isRentStatus() {
        return rentStatus;
    }

    public int getRentDays() {
        return rentDays;
    }

    public void setRentDays(int rentDays) {
        this.rentDays = rentDays;
    }

    public void setRentStatus(boolean rentStatus) {
        this.rentStatus = rentStatus;
    }
    public abstract float calRent(int days);
}