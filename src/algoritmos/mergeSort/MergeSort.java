package algoritmos.mergeSort;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args){
        int[] num = {7,5,4,6,8,2,1,46,465,79,4,321,87,45,123,12,78,8562,22,2125,24,9,3};
        int[] numero = mergeSort(num);

        System.out.println("Array original:");
        printArray(num);

        System.out.println("\nArray organizado: ");
        printArray(numero);

    }

    private static int[] mergeSort(int[] arr){
        if (arr.length <= 1){
            return arr;
        }
        int meio = arr.length/2;
        int[] left = Arrays.copyOfRange(arr, 0, meio);
        int[] right = Arrays.copyOfRange(arr, meio, arr.length);

        left = mergeSort(left);
        right = mergeSort(right);

        return merge(left, right);
    }

    private static int[] merge(int[] left, int[] right){
        int[] result = new int[left.length + right.length];
        int l = 0, r = 0, k = 0;

        while(l < left.length && r < right.length){
            if(left[l] <= right[r]){
                result[k++] = left[l++];
            }else{
                result[k++] = right[r++];
            }
        }
        while(l<left.length){
            result[k++] = left[l++];
        }
        while(r<right.length){
            result[k++] = right[r++];
        }
        return result;
    }




    //somente para imprimir a lista de maneira correta.
    private static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){

            if(i == arr.length-1){
                System.out.printf("%d", arr[i]);
            }else{
                System.out.printf("%d, ", arr[i]);
            }
        }
    }
}
