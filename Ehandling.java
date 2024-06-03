public class Ehandling {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;
        int []d={2,3,4};
        String c =null;
        // int d = a+b;
        // System.out.println(d);
        // System.out.println(d+"helo");
        try{
            // int c=a/b;
            // System.out.println(c);
            System.out.println("this is my first block");
            System.out.println("this is my second block");
        }
        catch(ArithmeticException e){
            System.out.println("Error");
        }
        // catch(ArithmeticException j){
        //     System.out.println("Exception"+j);
        // }
         catch(ArrayIndexOutOfBoundsException j){
             System.out.println("Exception"+j);
        }
        catch(NullPointerException j){
            System.out.println("Exception"+j);
        }
        // catch(NumberFormatException j){
        //     System.out.println("Exception"+j);
        // }
        // catch(Exception x){


        //     // System.out.println("Something went wrong in try black");
        //     // System.out.println("hello");
        // }
        System.out.println("hello");
        System.out.println("this part is working file");
    }
    
}
