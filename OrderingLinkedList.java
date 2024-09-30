import java.util.LinkedList;

public class OrderingLinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();

        ll.add(1);
        ll.add(2);
        ll.add(3);

        LinkedList<Integer> llnew = new LinkedList<>();

        ll.descendingIterator().forEachRemaining(llnew::add);

        System.out.println(llnew);
      }
}
