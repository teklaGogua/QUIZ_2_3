package oop.q3;

public class Student {
    private String name;
    private String surname;
    private String country;
    private String info;

    public Student(String name, String surname, String country, String info) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.info = info;
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCountry() {
        return country;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    // For comparing students (used in University class)
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return name.equals(student.name) && 
               surname.equals(student.surname) && 
               country.equals(student.country);
    }
}
