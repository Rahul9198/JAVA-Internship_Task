package learn;

import java.util.HashMap;
import java.util.HashSet;
import java.util.function.BiConsumer;

public class MapExample
{
    public static void main(String[]args){
        HashMap<String,Integer> courses = new HashMap<>();
        //adding elements
        courses.put("core java",4000);
        courses.put("basic python",3500);
        courses.put("Spring ",8000);
        courses.put("Android",4000);
//        courses.put("Android",40000);

//        System.out.println(courses);
//        courses.forEach((e1,e2)->{
//            System.out.println(e1+"=>"+e2);
//        });
        courses.forEach((key,value)->{
            System.out.println(key);
            System.out.println("=>");
            System.out.println(value);
//            System.out.println();




        });
        //entry set
        //key set
        System.out.println(courses.get("Fees"+"core java"));






    }
}
