package SimpleSorting;
public class BubbleSortClass {
    public void bubbleSort(int array[]){
        int size = array.length;
        for(int i = 0;i < size - 1; i++){
            for(int j = 0; j < size - 1; i++){
                //To Sort in descending order, change > to < in this line.
                if(array[j] > array[j + 1]);
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}