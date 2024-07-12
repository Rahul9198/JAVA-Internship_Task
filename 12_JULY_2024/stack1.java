import java.util.Stack;
import java.util.Scanner;
import java.util.*;


public class stack1 {
    
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Rahul");
        stack.push("Sonu");
        stack.push("Akshay");
        stack.push("Rohit");
        stack.push("Raj");

        System.out.println("add ho gaya element "+stack);
        System.out.println("_____itrator_______");
        Iterator iterator=stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        stack.pop();
        System.out.println("_____pop ho gaya element "+stack);
        System.out.println("_____listitrator_______");
        ListIterator listIterator=stack.listIterator();
        while(listIterator.hasNext()){
            System.out.println(listIterator.next());
        }



    }
    
}
