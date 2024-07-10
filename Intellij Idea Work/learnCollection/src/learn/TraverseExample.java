package learn;

import javax.swing.plaf.basic.BasicButtonUI;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.TreeSet;

public class TraverseExample {

    public static void main(String[] args){
        ArrayList<String> names=new ArrayList<String>();
        names.add("Rahul");//order is preserved
        names.add("Sitara");//order is preserved
        names.add("Roshani");//order is preserved
        names.add("Vandana");//order is preserved
        names.add("Vandana");//duplicates are allowed
        names.add("ABC");


        //for each loop
        for (String str:names)
        {
            System.out.println(str+"\t"+str.length()+"\t");
            StringBuffer br= new StringBuffer(str);
            System.out.println(br.reverse());


        }
        System.out.println("_________________________________");
        //traversing using Iterator (forward)
        Iterator<String> itr = names.iterator();
//        System.out.println(itr);
        while (itr.hasNext())
        {
            String next=itr.next();
            System.out.println(next);


        }
        System.out.println("________________________________________");

        //backward traversal of collection LISTITERATOR
        ListIterator<String> litr = names.listIterator(names.size());
        while(litr.hasPrevious())
        {
            String previous = litr.previous();
            System.out.println(previous);
        }
        //Enumeration


        System.out.println("_______________For Each Method_________________");
        //for each method
        names.forEach(e->{
            System.out.println(e);

        });
        System.out.println("______________Sorting of Elements_______________");
        TreeSet<String> set=new TreeSet<>();
        set.addAll(names);
        set.forEach(e->{
            System.out.println(e);
        });
        //comparable
        //comparator








    }
}
