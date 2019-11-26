package sort;

public class InsertSort {

    public static void sort(Comparable[] array) {
        if (array == null || array.length <= 1) {
            return;
        }

        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            Comparable value = array[i];
            for (; j >= 0; j--) {
                if (array[j].compareTo(value) > 0) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j+1] = value;
        }
    }

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{9,8,7,6,5,4,3,2,1};
        sort(arr);
        for (Integer e : arr) {
            System.out.print(e + ",");
        }
    }
}
