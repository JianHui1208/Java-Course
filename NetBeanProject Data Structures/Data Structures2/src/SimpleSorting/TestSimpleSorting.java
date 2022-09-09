package SimpleSorting;
import java.util.Arrays;
public class TestSimpleSorting {
    public static void main(String[] args) {
        int[] data = { -2, 45, 0, 11, -9 };
        BubbleSortClass A = new BubbleSortClass();
        A.bubbleSort(data);
        System.out.println("Sorted Array in Ascending Order(Bubble Sort):");
        System.out.println(Arrays.toString(data));
        
        int[] data1 = { 20, 12, 10, 15, 2 };
        SelectionSortClass B = new SelectionSortClass();
        B.selectionSort(data1);
        System.out.println("Sorted Array in Ascending Order(Selection Sort): ");
        System.out.println(Arrays.toString(data1));
        
        int[] data2 = { 9, 5, 1, 4, 3 };
        InsertionSortClass is = new InsertionSortClass();
        is.insertionSort(data2);
        System.out.println("Sorted Array in Ascending Order(Insertion Sort): ");
        System.out.println(Arrays.toString(data2));
    }
}