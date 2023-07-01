import java.util.*;
class Treeset{
public static void main(String[] args) {
    TreeSet<String> treeSet=new TreeSet<String>();
    treeSet.add("Ravi");
    treeSet.add("Vijay");
    treeSet.add("Ravi");
    treeSet.add("Ajay12");
    Iterator<String> itr=treeSet.iterator();
    while(itr.hasNext()){
        System.out.println(
            itr.hasNext()
        );
    }
}
}