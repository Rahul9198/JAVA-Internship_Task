import java.util.Scanner;

class Person {
    
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // public Person(String Name,int Age){
    //     age=Age;Name=name;
    // }

    public void greet() {
        System.out.println("Hello, " + name + "! You are " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        Person person = new Person(name,age);
        person.greet();

        scanner.close();
    }
}
