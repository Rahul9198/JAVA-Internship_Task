import java.util.*;

 public class LearnLists {

    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        List<String>list2 = new ArrayList<String>();

        

        list.add("Rahul");
        list.add("Sonu");
        list.add("Akshay");
        list.add("Rohit");
        list.add("Raj");
        


        list2.add("susmitha");
        list2.add("Bulbul");
        list2.add("Pooja");
        list2.add("Vivek");
        list2.add("Rahul");
        // list.remove(1);
        // list.remove(String.valueOf("Akshay"));

        // list.remove("Akshay");

        // System.out.println(list.get(0));

        // System.out.println(list.size());

        // list.clear();

        // System.out.println(list.size());
        // System.out.println(list);
        // System.out.println(list2);
        // list.addAll(list2);
        // list.removeAll(list2);
        list.retainAll(list2);

        
        



        System.out.println(list); 


    }
    
}
