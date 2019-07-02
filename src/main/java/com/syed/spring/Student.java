package com.syed.spring;

import java.util.LinkedHashMap;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String country;
    private LinkedHashMap<String, String> countries;
    private String favouriteLanguage;

    public Student() {
        countries = new LinkedHashMap<>();
        countries.put("IN", "India");
        countries.put("AU", "Australia");
        countries.put("PK", "Pakistan");
        countries.put("BA", "Bangladesh");
        countries.put("EN", "England");
    }

    public String getFavouriteLanguage() {
        return favouriteLanguage;
    }

    public void setFavouriteLanguage(String favouriteLanguage) {
        this.favouriteLanguage = favouriteLanguage;
    }

    public LinkedHashMap<String, String> getCountries() {
        return countries;
    }

    public void setCountries(LinkedHashMap<String, String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", country='" + country + '\'' +
                ", countries=" + countries +
                ", favouriteLanguage='" + favouriteLanguage + '\'' +
                '}';
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
