package search;

public class BinarySearch {

    public static int search(Comparable[] a, Comparable item) {
        if (a == null || a.length <= 0 || item == null) return -1;

        int low = 0;
        int high = a.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            int result = a[mid].compareTo(item);
            if (result == 0) {
                return mid;
            } else if (result < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{ 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        System.out.println(search(arr, 11));
    }
}
