
class BinarySearch {

    int binarySearchRecursive(int arr[], int l, int r, int x)
    {   //l-limita stanga
        //r-limita dreapta
        if (r >= l) {
            int mid = l + (r - l) / 2;


            if (arr[mid] == x)
                return mid;


            if (arr[mid] > x)
                return binarySearchRecursive(arr, l, mid - 1, x);


            return binarySearchRecursive(arr, mid + 1, r, x);
        }


        return -1;
    }

    int binarySearchIterative(int arr[], int x)
    {   //l-limita stanga
        //r-limita dreapta
        int l = 0;
        int r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;


            if (arr[m] == x)
                return m;


            if (arr[m] < x)
                l = m + 1;


            else
                r = m - 1;
        }


        return -1;
    }

}

