/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayofaverage;

/**
 *
 * @author William
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] delnum = deleteArray(2, array);
        for (int i = 0; i < delnum.length; i++) {
            System.out.print(delnum[i] + " ");
        }
    }

    public static int[] deleteArray(int v, int[] array)//删除数组中的值
    {
        int[] re_array = new int[array.length - 1];//这是确定集合中要删除几个的情况下
        int index = 0;
        for (int i : array) {
            if (i != v) {
                re_array[index] = i;
                index++;
            }
        }
        return re_array;
    }
}
