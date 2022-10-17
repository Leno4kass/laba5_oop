package lena.kryklya.ad212.lab5;

/* Describes student and its information */

public class Student extends Person{
    //fields
    int group;
    int studentTicket;

    //constructors
    public Student (String name, String  surname, int age, int group, int studentTicket) {
        super(name, surname, age);
        this.group=group;
        this.studentTicket=studentTicket;
    }

    //getters
    public int getGroup() {return group;}
    public int getStudentTicket() {return studentTicket;}

    //setters
    public void setGroup(int group) {this.group = group;}
    public void setStudentTicket(int studentTicket) {this.studentTicket = studentTicket;}

    //prints info about student
    @Override
    public void printInfo() {
        System.out.println("\nStudent of group: " + group + " - " +surname+" "+ name + " age: " + age + ".\nStudent ticket number: " +studentTicket );
    }
}