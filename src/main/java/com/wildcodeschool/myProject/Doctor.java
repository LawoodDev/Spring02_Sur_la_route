package com.wildcodeschool.myProject;

public class Doctor {
    public static int dValue = 0;
    private int number;
    private String name;
    public Doctor(String name){
        this.name = name;
        this.number = dValue++;
    }

    public static int getdValue() {
        return dValue;
    }

    public static void setdValue(int dValue) {
        Doctor.dValue = dValue;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name+"a";
    }


}
