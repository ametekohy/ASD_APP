import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class InsertionSortTest {
    private ISorting insertionSort;

    @Before
    public void setUp() throws Exception {
        insertionSort = new InsertionSort();
    }

    @Test
    public void testInsertSorting() {
        int[] unsortedArray = {1, 9, 5, 3, 6, 2, 4, 7, 8};
        int[] result = insertionSort.sort(unsortedArray);
        int[] expected = {1,2,3,4,5,6,7,8,9};

        assertArrayEquals(expected,result);
    }

}