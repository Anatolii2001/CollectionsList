import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        // ArrayList<Integer>
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(2);
        arrayList.add(0);
        arrayList.add(9);
        arrayList.add(6);
        arrayList.add(3);
        arrayList.add(1);
        System.out.println("Исходный ArrayList: " + arrayList);

        BubbleSorter<Integer> bubbleSorterInteger = new BubbleSorter<>();
        bubbleSorterInteger.bubbleSort(arrayList);
        System.out.println("Отсортированный ArrayList (пузырьком): " + arrayList);

        arrayList.add(0, 50);
        arrayList.add(4, 60);
        arrayList.add(arrayList.size(), 70);
        System.out.println("ArrayList после добавлений: " + arrayList);

        System.out.println("arrayList.get(0): " + arrayList.get(0));
        System.out.println("arrayList.get(4): " + arrayList.get(4));
        System.out.println("arrayList.get(9): " + arrayList.get(9));

        arrayList.removeFirst();
        arrayList.remove(3);
        arrayList.removeLast();
        System.out.println("ArrayList после удалений: " + arrayList);

        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(45);
        arrayList1.add(55);
        arrayList1.add(65);
        arrayList1.add(75);
        arrayList1.add(85);
        arrayList.addAll(arrayList1);
        System.out.println("ArrayList после добавления arrayList1: " + arrayList);

        System.out.println();

        // LinkedList<String>
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("one");
        linkedList.add("two");
        linkedList.add("three");
        linkedList.add("fore");
        linkedList.add("five");
        linkedList.add("six");
        linkedList.add("seven");
        System.out.println("Исходный LinkedList: " + linkedList);

        BubbleSorter<String> bubbleSorterString = new BubbleSorter<>();
        bubbleSorterString.bubbleSort(linkedList);
        System.out.println("Отсортированный LinkedList (пузырьком): " + linkedList);

        linkedList.addFirst("null");
        linkedList.add(4, "eleven");
        linkedList.addLast("null");
        System.out.println("LinkedList после добавлений: " + linkedList);

        System.out.println("linkedList.get(0): " + linkedList.get(0));
        System.out.println("linkedList.get(4): " + linkedList.get(4));
        System.out.println("linkedList.get(9): " + linkedList.get(9));

        linkedList.removeFirst();
        linkedList.remove(3);
        linkedList.removeLast();
        System.out.println("LinkedList после удалений: " + linkedList);

        LinkedList<String> linkedList1 = new LinkedList<>();
        linkedList1.add("A");
        linkedList1.add("B");
        linkedList1.add("C");
        linkedList1.add("D");
        linkedList1.add("F");
        linkedList.addAll(linkedList1);
        System.out.println("LinkedList после добавления linkedList1: " + linkedList);
    }
}