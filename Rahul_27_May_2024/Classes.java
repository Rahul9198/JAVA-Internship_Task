class Students{
    String name;
    int id;
    String email;
    public void display(){
        System.out.println(name+" "+id+" "+email);

    }

}




public class Classes {
    public static void main(String[] args) {

        Students s1 = new Students();
        // Students s2 = new Students();
        // Students s3 = new Students();
        // Students s4 = new Students();
        // Students s5 = new Students();
        // Students s6 = new Students();
        s1.name="Rahul";
        s1.id=1;
        s1.email="rahulkumarverma9198@gmail.com";

        s1.display();
    }

    
}
