package model;

import java.util.Objects;

public class Date {
    private String day;
    private String month;
    private String year;

    public Date() {

    }

    public Date(String date) {
        String[] parts = date.split("/");
        day = parts[0];
        month = parts[1];
        year = parts[2];
    }

    public String getDay() {
        return this.day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getMonth() {
        return this.month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String toString() {
        return day + "/" + month + "/" + year;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Date date = (Date) obj;
        return Objects.equals(day, date.day) && Objects.equals(month, date.month) && Objects.equals(year, date.year);
    }

    @Override
    public int hashCode() {
        return Objects.hash(day, month, year);
    }

}
