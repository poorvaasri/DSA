import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();//
        int choice, val;

        while (true) {
            System.out.println("\n----------------------- LIST MENU -----------------");
            System.out.println("1. Add data");
            System.out.println("2. Get data from a specific index");
            System.out.println("3. Remove data from a specific index");
            System.out.println("4. Remove specific data");
            System.out.println("5. Find list size");
            System.out.println("6. Search for data");
            System.out.println("7. Insert at a specific index");
            System.out.println("8. Check if list is empty");
            System.out.println("9. Find index of data");
            System.out.println("10. Clear the list");
            System.out.println("11. Display the list");
            System.out.println("12. Exit");
            System.out.println("----------------------------------------------------");
            System.out.print("Enter your choice: ");
            
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add: ");
                    val = sc.nextInt();
                    list.add(val);
                    System.out.println(val + " is added to the list.");
                    break;

                case 2:
                    System.out.print("Enter index to retrieve: ");
                    int indexGet = sc.nextInt();
                    if (indexGet >= 0 && indexGet < list.size()) {
                        System.out.println("Value at index " + indexGet + " is " + list.get(indexGet));
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 3:
                    System.out.print("Enter index to remove: ");
                    int indexRemove = sc.nextInt();
                    if (indexRemove >= 0 && indexRemove < list.size()) {
                        System.out.println(list.remove(indexRemove) + " is removed from index " + indexRemove);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 4:
                    System.out.print("Enter data to remove: ");
                    val = sc.nextInt();
                    if (list.remove(Integer.valueOf(val))) {
                        System.out.println(val + " is removed from the list.");
                    } else {
                        System.out.println(val + " not found in the list.");
                    }
                    break;

                case 5:
                    System.out.println("List size: " + list.size());
                    break;

                case 6:
                    System.out.print("Enter data to search: ");
                    val = sc.nextInt();
                    System.out.println(val + " is in the list: " + list.contains(val));
                    break;

                case 7:
                    System.out.print("Enter index to insert at: ");
                    int indexInsert = sc.nextInt();
                    if (indexInsert >= 0 && indexInsert <= list.size()) {
                        System.out.print("Enter data to insert: ");
                        int num = sc.nextInt();
                        list.add(indexInsert, num);//
                        System.out.println(num + " is inserted at index " + indexInsert);
                    } else {
                        System.out.println("Invalid index!");
                    }
                    break;

                case 8:
                    System.out.println("The list is empty: " + list.isEmpty());
                    break;

                case 9:
                    System.out.print("Enter data to find index of: ");
                    val = sc.nextInt();
                    System.out.println("Index of " + val + " is " + list.indexOf(val));
                    break;

                case 10:
                    list.clear();
                    System.out.println("The list is cleared.");
                    break;

                case 11:
                    System.out.println("Current list: " + list);
                    break;

                case 12:
                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
