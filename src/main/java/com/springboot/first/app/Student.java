package com.springboot.first.app;

public class Student {
    public String firstNamme;
    public String lastName;

    public Student(String firstNamme, String lastName) {
        this.firstNamme = firstNamme;
        this.lastName = lastName;
    }

    public String getFirstNamme() {
        return firstNamme;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstNamme(String firstNamme) {
        this.firstNamme = firstNamme;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
