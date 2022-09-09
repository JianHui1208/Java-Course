public class Coding {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] Array = {20,56,78,15,97,100,3,64,3,94,15,47};
        int minNumber = Array[0];
        for(int i = 1;i < Array.length; i++){
            if(Array[i] < minNumber){
                minNumber = Array[i];
            }
        }
        Class A = new Class();
        int[] Array2 = A.removeMin(Array,minNumber);
        for(int i = 0;i < Array2.length; i++){
            System.out.print(Array2[i] + " ");
        }
    }
    
}
