package lena.kryklya.ad212.lab5;

public class Main {
    public static void main(String[] args) {
        int p=3;

        Person[] people = new Person[p];
        people[0] = new Person("Klyklya", "Lena", 19);
        people[1] = new Student("Lina", "Kostenko", 21, 212, 2341);
        people[2] = new Lecturer("Vasya", "Belonog", 56,"ICS", 18000);


        for (Person person : people) {
            printInfo(person);
        }
    }
    public static void printInfo(Person p) {
        p.printInfo();
    }
}
