/**
 *      Sorting algoritme: Insertionsort.
 */
public class InsertionSort implements ISorting
{
    public int[] sort(int[] array) {
        for(int i=1; i<array.length; i++) {
            //stop item in temp waarde
            int tmp = array[i];
            // hold array positie
            int j = i;
            // als array positie > 0 EN temp kleiner is dan vorige array inhoud, dan dit inhoud is vorige.
            while(j > 0 && tmp < array[j-1]) {
                array[j] = array[j-1];
                j--;
            }
            array[j]=tmp;
        }
        return array;
    }
}
