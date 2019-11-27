package sort;

public class CountingSort {

    // 计数排序，a是数组，n是数组大小。假设数组中存储的都是非负整数。
    public static void sort(int[] a) {

        if (a == null || a.length <= 1) {
            return;
        }

        //find value range
        int max = a[0];
        for (int c : a) {
            if (max < c) {
                max = c;
            }
        }

        int[] countingArr = new int[max + 1];
        for (int i = 0; i < countingArr.length; i++) {
            countingArr[i] = 0;
        }

        for (int c : a) {
            countingArr[c]++;
        }

        for (int i = 1; i < countingArr.length; i++) {
            countingArr[i] = countingArr[i - 1] + countingArr[i];
        }

        int[] temp = new int[a.length];
        for (int i = a.length - 1; i >= 0; i--) {
            int index = countingArr[a[i]] - 1;
            temp[index] = a[i];
            countingArr[a[i]]--;
        }

        for (int i = 0; i < temp.length; i++) {
            a[i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[]{9,8,7,6,5,4,2,2,1};
        sort(arr);
        for (int e : arr) {
            System.out.print(e + ",");
        }
    }
}
