package sort;

public class QuickSort {

    public static void sort(Comparable[] a) {
        if (a != null && a.length > 0) {
            sort(a, 0, a.length - 1);
        }
    }

    private static void sort(Comparable[] a, int start, int end) {
        if (start >= end) return;
        int pivot = partition(a, start, end);
        sort(a, start, pivot - 1);
        sort(a, pivot + 1, end);
    }

    private static int partition(Comparable[] a, int start, int end) {
        Comparable pivot = a[end];
        int j = start;
        for (int i = start; i < end; i++) {
            if (a[i].compareTo(pivot) < 0) {
                swap(a, i, j);
                j++;
            }
        }
        swap(a, j, end);
        return j;
    }

    private static void swap(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{9,8,7,6,5,4,3,2,1};
        sort(arr);
        for (Integer e : arr) {
            System.out.print(e + ",");
        }
    }
}
