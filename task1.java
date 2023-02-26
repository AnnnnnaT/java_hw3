// 1.Реализовать алгоритм сортировки слиянием

import java.util.Arrays;

public class task1 {
    public static void main(String[] args) {
        int[] arr = new int[]{7, 8, 4, 6, 1, 9, 77, 55, 56, 4378, 1, -6, 3, 2, 5};
        System.out.println(Arrays.toString(arr));
        mergeOfArr(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
        
    }

    public static void mergeOfArr(int[] arr){
            int size = arr.length;
            if (size == 1)
                return;

            int middleOfArray = arr.length / 2;

            int[] arr1 = Arrays.copyOfRange(arr, 0, middleOfArray);
            mergeOfArr(arr1);
            int[] arr2 = Arrays.copyOfRange(arr, middleOfArray, arr.length);
            mergeOfArr(arr2);

            sortOfArr(arr1, arr2, arr);
    } 

    public static void sortOfArr(int[] arr1, int[] arr2, int[] res){

        int arr_1 = 0; 
        int arr_2 = 0; 
        int res_ = 0; 

        while (arr_1 < arr1.length && arr_2 < arr2.length) {
            if (arr1[arr_1] < arr2[arr_2]) {
                res[res_] = arr1[arr_1];
                arr_1++;
                res_++;
            } else {
                res[res_] = arr2[arr_2];
                res_++;
                arr_2++;
            }
        }
        while(arr_1 < arr1.length) {
            res[res_] = arr1[arr_1];
            res_++;
            arr_1++;
        }
        while(arr_2 < arr2.length){
            res[res_] = arr2[arr_2];
            arr_2++;
            res_++;
        }
       
    }
}
