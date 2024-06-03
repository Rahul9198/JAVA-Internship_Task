class hello {
    int x;//Instance  vaariable
    static int y;//static member variable
    public void fun1(){}//instance member function
    public static void fun2(){}//static member function
    static class Test{
        public static String country="INDIA";


    }
    public class Static_member{
    public static void main(String []args){
        hello h=new hello();//object creation
        hello h1=new hello();
        h.x=10;//accessing instance variable
        hello.fun2();
        System.out.println(hello.Test.country);
        
        
       
       

    }
}
}
