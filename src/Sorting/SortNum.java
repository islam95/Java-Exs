/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sorting;

/**
 *
 * @author islam
 */
public class SortNum {

    private int[] list = {17, 3, 60, 128, 11, 11};
    
    

    public int[] getList() {
        return list;
    }

    public boolean search(int[] arr, int a){
        
        boolean value = false;
        
        for(int num : arr){
            if(num == a){
                System.out.println("\nAn integer " + a + " is in the list.");
                value = true;
            }
        }
        return value;
    }
    
    
    public static void main(String[] args) {

        SortNum array = new SortNum();

        System.out.println("Array before: ");
        for (int num : array.getList()) {
            System.out.print(num + " ");
        }
        System.out.println();

//        array.bubbleSort(array.getList());

//        System.out.println("Array after BubbleSort: ");
//        for (int num : array.getList()) {
//            System.out.print(num + " ");
//        }
        
          array.selectionSort(array.getList());
          
          System.out.println("Array after: ");
          for (int num : array.getList()) {
            System.out.print(num + " ");
          }
          
          array.search(array.getList(), 3);

    }

    public void bubbleSort(int[] array) {

        int n = array.length;
        int temp = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {

                if (array[j - 1] > array[j]) {
                    //swap the elements!
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;
                }

            }
        }
    }

    public void selectionSort(int[] arr) {

        int i, j, minIndex, tmp;
        int n = arr.length;

        for (i = 0; i < n - 1; i++) {
            minIndex = i;

            for (j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            if (minIndex != i) {
                tmp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = tmp;
            }
        }
    }

}
