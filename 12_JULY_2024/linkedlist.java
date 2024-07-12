import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class linkedlist {

    public static void main(String[] args) {

        LinkedList<String>lili=new LinkedList<>();
        System.out.println("____Before adding element______"+lili);

        lili.add("Rahul");
        lili.add("Sonu");
        lili.add("Akshay");
        lili.add("Rohit");
        lili.add("Raj");

        System.out.println("___After adding element____"+lili);
        System.out.println("_____using Iterator_____");

        // Iterator<String> iterator=(Iterator<String>)lili.iterator();

        Iterator itr = lili.iterator();

        while(itr.hasNext()){

            System.out.println(itr.next());

        }

        System.out.println("_____using ListIterator_____");

        ListIterator ltr = lili.listIterator();

        while(ltr.hasNext()){

            System.out.println(ltr.next());

        }
        lili.addFirst("Keerti");
        System.out.println(lili);
        lili.addLast("smriti");
        System.out.println(lili);
        Collections.sort(lili);
        System.out.println(lili);

        Collections.sort(lili,new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
            });
            
        System.out.println(lili);
        lili.add("Rakesh");
        lili.add("Sanju");

        System.out.println(lili);
        lili.removeAll(Collections.singleton("Sonu"));
        System.out.println(lili);
        lili.clear();
        System.out.println("All Data clear"+lili);


    }
}
