package learn;
import java.util.*;




public class StartCode

{
    public static void main(String[] args){
        System.out.println("welcome to code java collection Framework");
        /*Creating collection
        1)Tyoe safe -same type of elements (object)are added to collection
        2)un-type safe-different types of elements can be added to collection


         */

        //type safe
        ArrayList<String> names=new ArrayList<String>();
        names.add("Rahul");//order is preserved
        names.add("Sitara");//order is preserved
        names.add("Roshani");//order is preserved
        names.add("Vandana");//order is preserved
        names.add("Vandana");//duplicates are allowed
//        System.out.println((names));

        //get
//        System.out.println(names.get(0));//indexed collection
//        System.out.println(names.get(1));//indexed collection
        //remove
//        names.remove("Roshani");
//        System.out.println(names);
        //size
//        System.out.println("size::"+names.size());
//check item is there or not
        //type ka equals method call karta hai checking karne ke liye
//        System.out.println(names.contains("Rahul"));

        //check for empty
//        System.out.println(names.isEmpty());

        //setting value
//        names.set(1,"Ram");
        System.out.println(names);
        names.add(1,"shyam");
        System.out.println(names);
        //remove all element
//        names.clear();
//        System.out.println(names);

//        Vector<String> vector=new Vector<>();
//        vector.addAll(names);
//        System.out.println("vector:"+vector);

        System.out.println("_____________________");
        HashSet<Double> nms=new HashSet<>();
        nms.add(14.14);
        nms.add(32.65594);
        nms.add((1215.32));
        nms.add(3236.3);
        nms.add(14.14);//duplocate are not allowded
        nms.add(5.3);


        TreeSet<Double> treeSet=new TreeSet<>();
        treeSet.addAll(nms);
        System.out.println(treeSet);



        System.out.println(nms);











        //un-type
//        LinkedList list= new LinkedList();
//        list.add("Sachin");
//        list.add(101);
//        list.add(232.45);
//        list.add(null);
//        list.add(true);
//        System.out.println(list);









    }
}

