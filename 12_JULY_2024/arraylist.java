import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class arraylist {

    public static void main(String[] args) {

        ArrayList al1 = new ArrayList();
        System.out.println("empaty arraylist"+al1);

        al1.add(10);
        al1.add(20);
        al1.add(30);
        al1.add(40);
        al1.add(50);
        System.out.println("abli all ka traverse"+al1);

        for(int i=0;i<=al1.size()-1;i++){
            // System.out.println(al1.get(i));
            System.out.println("index"+i+"value:"+al1.get(i));
        }
        System.out.println("_________using Iterator__________"+"using Iterator");

        Iterator itr = al1.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("_________using ListIterator__________"+"using ListIterator");

        ListIterator ltr = al1.listIterator();
        while(ltr.hasNext()){
            System.out.println(ltr.next());
        }
        System.out.println("______In Reverse order________");

        while(ltr.hasPrevious()){
            System.out.println(ltr.previous());
        }

        ArrayList clone= (ArrayList)al1.clone();
        System.out.println("original arraylist"+al1);
        
        System.out.println("cloned arraylist"+clone);


    
}
}