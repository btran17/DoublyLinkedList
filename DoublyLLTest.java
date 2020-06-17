public class DoublyLLTest {
    static DoublyLinkedList dll = new DoublyLinkedList();
    public static void main(String[] args) {
        System.out.println("Clear");
        dll.clear();
        dll.print();

        System.out.println("Is Empty " + dll.isEmpty());

        try {
            System.out.println("Remove at Index 5");
            dll.removeAt(5);
        } catch (Exception e) {
            System.out.println("Cannot Remove 5");
            dll.print();
        }

        try {
            System.out.println("Remove at 23");
            dll.remove(23);
        } catch (Exception e) {
            System.out.println("Cannot Remove 23");
            dll.print();
        }

        try {
            System.out.println("Remove Head: ");
            dll.removeFromHead();
        } catch (Exception e) {
            System.out.println("Cannot Remove Head");
            dll.print();
        }

        try {
            System.out.println("Remove Tail: ");
            dll.removeFromTail();
        } catch(Exception e){
            System.out.println("Cannot Remove Tail");
            dll.print();
        }

        try {
            System.out.println("Index of -99: ");
            dll.indexOf(-99);
        } catch(Exception e) {
            System.out.println("Index -99 Not Found");
            dll.print();
        }

        System.out.println("Appending");
        System.out.println("Append 42");
        dll.append(42);
        System.out.println("Append 3");
        dll.append(3);
        System.out.println("Append 4");
        dll.append(4);
        System.out.println("Append 32");
        dll.append(32);
        System.out.println("Append -100");
        dll.append(-100);
        System.out.println("Is Empty " + dll.isEmpty());
        dll.print();

        System.out.println("Remove from Head");
        System.out.println("Remove " +  dll.removeFromHead());
        System.out.println("Remove " +  dll.removeFromHead());
        System.out.println("Remove " +  dll.removeFromHead());
        System.out.println("Remove " +  dll.removeFromHead());
        System.out.println("Remove " +  dll.removeFromHead());
        dll.print();
        try {
            System.out.println("Remove Head: ");
            dll.removeFromHead();
        } catch (Exception e) {
            System.out.println("Cannot Remove Head");
        }

        dll.print();
        System.out.println("Appending");
        dll.append(42);
        dll.append(3);
        dll.append(0);
        dll.append(14);
        dll.append(-100);

        dll.print();

        System.out.println("Remove from Tail");
        System.out.println("Remove " + dll.tail.data + " ");
        dll.removeFromTail();
        System.out.println("Remove " + dll.tail.data + " ");
        dll.removeFromTail();
        System.out.println("Remove " + dll.tail.data + " ");
        dll.removeFromTail();
        System.out.println("Remove " + dll.tail.data + " ");
        dll.removeFromTail();
        System.out.println("Remove " + dll.tail.data + " ");
        dll.removeFromTail();
        dll.print();
        try {
            System.out.println("Remove Tail: ");
            dll.removeFromTail();
        } catch(Exception e){
            System.out.println("Cannot Remove Tail");
        }

        dll.print();
        System.out.println("Appending");
        dll.append(42);
        dll.append(0);
        dll.append(19);
        dll.append(12);
        dll.append(-100);

        dll.print();

        System.out.println("Remove Data");
        System.out.println("Remove Data 42");
        System.out.println(dll.remove(42));
        System.out.println("Remove Data -100");
        System.out.println(dll.remove(-100));
        System.out.println("Remove Data 0");
        System.out.println(dll.remove(0));
        System.out.println("Remove Data 12");
        System.out.println(dll.remove(12));
        System.out.println("Remove Data 19");
        System.out.println(dll.remove(19));
        dll.print();
        try {
            System.out.println("Remove 23");
            dll.remove(23);
        } catch (Exception e) {
            System.out.println("Cannot Remove 23");
        }

        dll.print();
        System.out.println("Appending");
        dll.append(42);
        dll.append(-90);
        dll.append(0);
        dll.append(62);
        dll.append(-100);

        dll.print();
        System.out.println("Remove At Test");
        System.out.println("Remove " + dll.head.data + " ");
        dll.removeAt(0);
        System.out.println("Remove " + dll.head.data + " ");
        dll.removeAt(0);
        System.out.println("Remove " + dll.head.data + " ");
        dll.removeAt(0);
        System.out.println("Remove " + dll.head.data + " ");
        dll.removeAt(0);
        System.out.println("Remove " + dll.head.data + " ");
        dll.removeAt(0);
        dll.print();
        System.out.println("Appending");
        dll.append(42);
        dll.append(-90);
        dll.append(0);
        dll.append(62);
        dll.append(-100);
        dll.print();
        System.out.println("Remove At Test");
        System.out.println("Remove at Index 0");
        dll.removeAt(0);
        System.out.println("Remove at Index 3");
        dll.removeAt(3);
        System.out.println("Remove at Index 1");
        dll.removeAt(1);
        System.out.println("Remove at Index 1");
        dll.removeAt(1);
        System.out.println("Remove at Index 0");
        dll.removeAt(0);
        dll.print();
        try {
            System.out.println("Remove at Index 0");
            dll.removeAt(0);
        } catch (Exception e) {
            System.out.println("Cannot Remove At Index 0");
        }
        dll.print();
        try {
            System.out.println("Remove at Index 9");
            dll.removeAt(9);
        } catch (Exception e) {
            System.out.println("Cannot Remove At Index 9");
        }
        dll.print();
        System.out.println("APPENDING");
        dll.append(42);
        dll.append(-90);
        dll.append(0);
        dll.append(62);
        dll.append(-100);
        dll.print();

        try {
            System.out.println("Remove at Index 10");
            dll.removeAt(10);
        } catch (Exception e) {
            System.out.println("index out of bounds");
        }

        try {
            System.out.println("Remove at Index -1");
            dll.removeAt(-1);
        } catch (Exception e) {
            System.out.println("index out of bounds");
        }

        dll.print();
        System.out.println("Remove at Index 4");
        dll.removeAt(4);
        dll.print();
        System.out.println("Remove at Index 0");
        dll.removeAt(0);
        dll.print();
        System.out.println("Remove at Index 2");
        dll.removeAt(2);
        dll.print();

        try {
            System.out.println("Remove at index 7");
            dll.removeAt(7);
        } catch (Exception e) {
            System.out.println("Cannot Remove at Index 7");
            System.out.println("index out of bounds");
            dll.print();
        }

        System.out.println("CLEAR");
        dll.clear();
        dll.print();

        System.out.println("APPEND");
        dll.append(42);
        dll.append(777);
        dll.append(-100);
        dll.print();

        System.out.println("Remove -100");
        dll.remove(-100);
        dll.print();
        System.out.println("Remove 42");
        dll.remove(42);
        dll.print();
        System.out.println("Remove 777");
        dll.remove(777);
        dll.print();

        try {
            System.out.println("Remove -7");
            dll.remove(-7);
        } catch (Exception e) {
            System.out.println("Cannot Remove -7");
            dll.print();
        }

        System.out.println("Clear");
        dll.clear();
        dll.print();
        dll.append(42);
        dll.append(3);
        dll.append(4);
        dll.append(10);
        dll.append(0);
        dll.append(-100);

        dll.print();
        System.out.println("Index Of Test");
        System.out.println("Index Of 42: " + dll.indexOf(42));
        System.out.println("Index Of 3: " + dll.indexOf(3));
        System.out.println("Index Of 4: " + dll.indexOf(4));
        System.out.println("Index Of 10: " + dll.indexOf(10));
        System.out.println("Index Of 0: " + dll.indexOf(0));
        System.out.println("Index Of -100: " + dll.indexOf(-100));
        dll.print();
        try {
            System.out.println("Index of 20: ");
            dll.indexOf(20);
        } catch(Exception e) {
            System.out.println("Index Not Found");
            dll.print();
        }

        System.out.println("Clearing");
        dll.clear();
        dll.print();

        System.out.println("Insert At Head & Remove Functions");
        dll.print();
        dll.insertAtHead(23);
        dll.insertAtHead(5);
        dll.print();
        dll.append(20);
        dll.append(45);
        dll.removeAt(3);
        dll.print();
        dll.remove(5);
        dll.print();
        dll.clear();
        dll.print();
        System.out.println("Insert at Head");
        dll.insertAtHead(34);
        dll.print();
        System.out.println("Remove From Head");
        dll.removeFromHead();
        dll.print();
        System.out.println("Insert at Head");
        dll.insertAtHead(55);
        dll.print();
        System.out.println("Remove from Tail");
        dll.removeFromTail();
        dll.print();

        System.out.println("Appending");
        dll.insertAtHead(12);
        dll.append(2);
        dll.append(1564);
        dll.append(24);
        dll.append(76);
        dll.print();
        System.out.println("Remove Index 0");
        dll.removeAt(0);
        System.out.println("HEAD: " + dll.head.data);
        dll.print();
        System.out.println("Remove at 0");
        dll.removeFromHead();
        dll.print();

    }
}
