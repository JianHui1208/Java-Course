//Name: Willian Gwee Jian Hui
//Students ID: D190067A
//Batch: IT-19A
//Submit Date: 28th February 2020

//1.Add an additional method call removeMin() to existing unordered program that 
//includes duplicated values . The removeMin is used to find the minimum value and 
//remove it from the array. If there are same minimum values in the array, your 
//method should remove all same minimum values.  (15 marks)



public class NewMain {
    public static void main(String[] args) {
        int[] Array = {10,26,38,49,5,42,63,5,14,19};
        int minNumber = Array[0];
        for(int i = 1;i < Array.length; i++){
            if(Array[i] < minNumber){
                minNumber = Array[i];
            }
        }
        int[] Array2 = removeMin(Array,minNumber);
        for(int i = 0;i < Array2.length; i++){
            System.out.print(Array2[i] + " ");
        }
    }
    
    public static int count(int v,int[] Array){
        int count = 0;
        for(int j = 0; j < Array.length; j++){
            if(Array[j] == v){
                count++;
            }
        }
        return count;
    }
    
    public static int[] removeMin(int[] Array1, int A){
        int count = count(A,Array1);
        int[] New_Array = new int[Array1.length - count];
        int index = 0;
        for(int i : Array1){
            if(i != A){
                New_Array[index] = i;
                index++;
            }
        }
        return New_Array;
    }
}

//Question 2
//Show the complexity time by using Big-O notation for your program and justify 
//your answer. (5 marks)

//Ans: O(n). In  my code, i has 10 number in the Array. But maybe the Array[0] frist 
//number was be minimum number.So I would return just 1 time is the for-loop.
//This is best case. Then, if the number at the array[9] or array[8], the for-loop 
//will be return 9 time or 8 time. This is worst case.
//Conclusion,The more my array number, the more time I return.But it was always O(n)
//in my code.The more I repeat the smallest number, the more I delete it.