import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String>  s=  new ArrayList<>();
        List<String> linkedlist = new LinkedList<>();
        linkedlist.add(0, "Prena");
        linkedlist.add(1, "Sumit");
        linkedlist.add(2, "Allan");
        linkedlist.add(3, "Sarang");
        linkedlist.add(4, "Stasko");
        //list is: [Prerna] → [Sumit] → [Allan] → [Sarang]→ [Stasko]

        System.out.println(linkedlist.remove(3));
        //should print “Sarang”
        //list is: [Prerna] → [Sumit] → [Allan] → [Stasko]

        System.out.println(linkedlist.remove(1)); //prints “Sumit”
        System.out.println(linkedlist.remove(0)); //prints “Prerna”
        //list is: [Allan] → [Stasko]

        int size = linkedlist.size(); //size should equal 2
        linkedlist.add(2, "Buzz");
        linkedlist.add(2, "Ramblin'");
        //list is: [Allan] → [Stasko] → [Ramblin’] → [Buzz]

        linkedlist.clear();
        System.out.println(linkedlist.contains("Ramblin'")); //prints false
        //list is: []

        Queue<String> vaccineLine = new LinkedList<>();
        vaccineLine.enqueue("Prena");
        vaccineLine.enqueue("Stasko");
        vaccineLine.enqueue("Melanine");
        vaccineLine.enqueue("Allan");
        //Queue is: [Prerna] → [Stasko] → [Melanie] → [Allan]

        System.out.println(vaccineLine.isEmpty()); //prints false
        //Queue is: [Prerna] → [Stasko] → [Melanie] → [Allan]

        System.out.println(vaccineLine.dequeue()); //prints “Prerna”
        System.out.println(vaccineLine.dequeue()); //prints “Stasko”
        //Queue is: [Melanie] → [Allan]
    }
}
