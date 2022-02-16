package assignment5_2;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> llist = new LinkedList<>();
        
        // Appends Values
        llist.append("Hello");
        llist.append("Hello2");
        llist.append("Hello3");

        // Prints size of list with value of each index
        System.out.println("Size of list: "+llist.size());
        System.out.println(llist.get(1));
        System.out.println(llist.get(2));
        System.out.println(llist.get(3));

        System.out.println("\n");

        // Change index 2 to pickle
        llist.set(2, "Pickle");
        System.out.println("New Value of 2 is: "+llist.get(2));

        System.out.println("\n");

        System.out.println(llist.get(1));
        System.out.println(llist.get(2));
        System.out.println(llist.get(3));
    }
}
