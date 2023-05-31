public class Main {
    public static void main(String[] args) {

        System.out.println("------------------------------------Quick Sort------------------------------------");
        int a[] = {13, 18, 27, 2, 19, 25};
        int n = a.length;
        System.out.println("\nInainte de sortare -\n ");
        QuickSortAndPartition q1 = new QuickSortAndPartition();
        q1.printArr(a, n);
        q1.quick(a, 0, n - 1);
        System.out.println("\nDupa sortare -\n ");
        q1.printArr(a, n);
        System.out.println();

        System.out.println("-------------------------------End Quick Sort------------------------------------\n\n");


        {
            System.out.println("---------------------------Binary Search Recursive------------------------------------");
            BinarySearch ob = new BinarySearch();
            int arr[] = {2, 3, 4, 10, 40};
            int n1 = arr.length;
            int x = 10;
            int result = ob.binarySearchRecursive(arr, 0, n1 - 1, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element " + x +" found at "
                        + "index " + result);

            System.out.println("------------------------End Binary Search Recursive------------------------------------\n\n");
        }


        {    System.out.println("---------------------------Binary Search Iterative------------------------------------");
            BinarySearch ob = new BinarySearch();
            int arr[] = { 2, 3, 4, 10, 40 };
            int n2 = arr.length;
            int x = 10;
            int result = ob.binarySearchIterative(arr, x);
            if (result == -1)
                System.out.println("Element not present");
            else
                System.out.println("Element " + x +" found at "
                        + "index " + result);

            System.out.println("------------------------End Binary Search Iterative------------------------------------\n\n");
        }

    }
}