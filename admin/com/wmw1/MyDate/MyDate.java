package com.wmw1.MyDate;

public class MyDate {
    private int year;
    private int mouth;
    private int day;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMouth() {
        return mouth;
    }

    public void setMouth(int mouth) {
        this.mouth = mouth;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toString () {
        return year + "." + mouth + "." + day;
    }
}
