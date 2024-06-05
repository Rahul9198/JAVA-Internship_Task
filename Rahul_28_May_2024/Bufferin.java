// import java.io.*;

import java.io.IOException;

public class Bufferin {
    public static void main(String[] args)throws IOException {
        java.io.BufferedReader a = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Enter your age::");
        // String name = a.readLine();

        // String age = a.readLine();
        // System.out.println("Hello "+name);
        int age1 = Integer.parseInt(a.readLine());
        // System.out.println(2*age1);
        System.out.println("age "+ 2*age1);
        
        // java.io.BufferedReader a = new java.io.BufferredReader(new java.io. InputStreamReader(System.in));
    }
    
}
