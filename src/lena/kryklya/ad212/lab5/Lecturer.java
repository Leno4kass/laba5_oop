package lena.kryklya.ad212.lab5;

/* Describes lecturer and its information */

import java.util.Locale;

public class Lecturer extends Person{
    //fields
    String cathedra;
    double salary;

    //constructors
    public Lecturer (String name, String  surname, int age, String cathedra, double salary) {
        super(name, surname, age);
        this.cathedra=cathedra;
        this.salary=salary;
    }

    //getters
    public String getCathedra() {return cathedra;}
    public double getSalary() {return salary;}

    //setters
    public void setCathedra(String cathedra) {this.cathedra = cathedra;}
    public void setSalary(double salary) {this.salary = salary;}

    //prints info about the lecturer
    @Override
    public void printInfo() {
        System.out.println("\nLecturer of the cathedra: " + cathedra + " - " +surname+" "+ name + " age: " + age + ".\nSalary: " + salary);
    }
}
