package lena.kryklya.ad212.lab5;

public class Person {
     String surname;
    String name;
    int age;

    //constructors
    public Person(String surname, String  name, int age) {
        this.surname=surname;
        this.name=name;
        this.age=age;
    }

    //getters
    public String getSurname() {return surname;}
    public String getName() {return name;}
    public int getAge() {return age;}

    //setters
    public void setName(String name) {this.name = name;}
    public void setSurname(String surname) {this.surname = surname;}
    public void setAge(int age) {this.age = age;}

    //public methods

    //prints info about the person
    public void printInfo(){System.out.println("Person: "+surname+" "+name+", age: "+age);}}

