class Student{
    static int age = 21; //local variable - only callable in a class
    static String name = "Rahul";
    
    public void show(){ //method
        System.out.println(name + " : " + age);
    }
}

// class Blr{
//     int age = 21;
//     String name = "Rahul";

//     public void show(){
//         System.out.println(name + " : " + age);
//     }
// }

public class dirH {
    public static void main(String[] args) {
        // int age = 23;
        // String name = "rahul";

        // System.out.println(age);
        // System.err.println(name);

        Student s1 = new Student();
        s1.name = "Rahul"; //instance
        // s1.name = "Rakesh"; //can overwrite data in heap
        // s1.name = "Madan";
        Student s2 = new Student();
        s2.name = "Rahul";
        Student s3 = new Student();
        s3.name = "Bulbul";
        Student s4 = new Student();
        s4.name = "Rahul";
        s1.show();
    }    
}
