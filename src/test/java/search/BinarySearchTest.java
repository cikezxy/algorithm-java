package search;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BinarySearchTest {

    @Test
    public void testSearchFirst() {
        Integer[] arr = new Integer[]{ 0, 1, 2, 5, 5, 5, 5, 6, 7, 8 };
        Assertions.assertEquals(3, BinarySearch.searchFirst(arr, 5));
        Assertions.assertEquals(2,BinarySearch.searchFirst(arr, 2));
        Assertions.assertEquals(-1,BinarySearch.searchFirst(arr, 9));
    }
}
