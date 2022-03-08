import java.util.Scanner;

public class Count {
    public static void main (String [] args) {
        Scanner read = new Scanner(System.in);
        MyList list = new MyList();
        DoubleLinkedList dlist = new DoubleLinkedList();
        MyList intList = new MyList();
        DoubleLinkedListSentinel sentList = new DoubleLinkedListSentinel();
        sentList.add("Apple");
        sentList.add("Orange");
        sentList.add("Banana");
        sentList.add("Peach");
        sentList.add("Watermelon");
        sentList.add("Mango");
        sentList.add("Strawberry");

        sentList.remove(sentList.baseNode.getNext().getNext());

        intList.addInt(10);
        intList.addInt(8);
        intList.addInt(20);
        intList.addInt(7);
        intList.addInt(15);
        intList.sort();
        printIntList(intList);
//        list.add("one");
//        list.add("two");
//        list.add("three");
//        list.add("four");
//        list.insert(list.head.getNextNode(), "two and a half");
//        list.push("zero");
//        list.addWithoutTail("five");
//        list.remove(list.head.getNextNode());
        for (int i = 0; i < 26; i++) {
//            list.add(Integer.toString(i+1));
            list.add(Character.toString((char)65+i));
            dlist.add(Character.toString((char)65+i));
        }




        System.out.println("Select operation: ");
        System.out.println("1. Print Linked List");
        int selection = read.nextInt();
        if (selection == 1) {

            // insert nodes at every alternate position with a sequence number starting with '1' as head
//            Node temp = list.head;
//            int i = 0;
//            while(temp.getNextNode() != null) {
//                list.insert(temp, Integer.toString(i+1));
//                temp = temp.getNextNode().getNextNode();
//                i++;
//            }
//            list.add(Integer.toString(i+1));
            Node temp = list.head;
            int i = 0;
            list.push(Integer.toString(i+1));
//            dlist.push(Integer.toString(i+1));
            i++;
            while(temp.getNext() != null) {
                list.insert(temp, Integer.toString(i+1));
//                dlist.insert(temp, Integer.toString(i+1));
                temp = temp.getNext().getNext();
                i++;
            }

            System.out.println("Testing Append for single-linked list\n");
            printList(list);
            MyList quickList = new MyList();
            quickList.add("Mercury");
            quickList.add("Venus");
            quickList.add("Earth");
            quickList.add("Mars");
            list.append(quickList);
            printList(list);

            System.out.println("----------");
            System.out.println("Testing Append for double linked list\n");
            DoubleLinkedList ddd = new DoubleLinkedList();
            ddd.add("The");
            ddd.add("Colors");
            ddd.add("of");
            ddd.add("the");
            ddd.add("Rainbow");
            ddd.add("are");


            DoubleLinkedList ddd2 = new DoubleLinkedList();
            ddd2.add("Red");
            ddd2.add("Orange");
            ddd2.add("Yellow");
            ddd2.add("Green");
            ddd2.add("Blue");


            ddd.append(ddd2);
            printList(ddd);

            System.out.println("----------");

            System.out.println("Testing single linked list print and reverse\n");
            printList(list);
            list.reverse();
            printList(list);

            System.out.println("----------");

            System.out.println("Testing pop\n");

            Node p =list.pop();
            System.out.println();
            printList(list);
            System.out.println(p.getData());
            System.out.println();

            System.out.println("----------");
            System.out.println("Testing reverse on double linked list\n");

            printList(dlist);
            dlist.reverse();
            printList(dlist);

            System.out.println("----------");
            System.out.println("Testing double linked list with sentinel node\n");

            printList(sentList);

            System.out.println("----------");
            System.out.println("Reversing double linked list with sentinel node\n");
            sentList.reverse();
            printList(sentList);
        }


    }

    public static void printList(MyList list) {
        System.out.print(list.head.getData());
        Node current = list.head;
        for(int i = 1; i < list.getSize(); i++) {
            System.out.print("-" + current.getNext().getData());
            current = current.getNext();
        }
        System.out.println();
    }

    public static void printIntList(MyList list) {
        System.out.print(list.head.getNumData());
        Node current = list.head;
        for(int i = 1; i < list.getSize(); i++) {
            System.out.print("-" + current.getNext().getNumData());
            current = current.getNext();
        }
        System.out.println();
    }

    public static void printList(DoubleLinkedList list) {
        System.out.print(list.head.getData());
        Node current = list.head;
        for(int i = 1; i < list.getSize(); i++) {
            System.out.print("-" + current.getNext().getData());
            current = current.getNext();
        }
        System.out.println();
    }

    public static void printList(DoubleLinkedListSentinel list) {
        System.out.print(list.baseNode.getNext().getData());
        Node current = list.baseNode.getNext();
        for(int i = 1; i < list.getSize(); i++) {
            System.out.print("-" + current.getNext().getData());
            current = current.getNext();
        }
        System.out.println();
    }

}

