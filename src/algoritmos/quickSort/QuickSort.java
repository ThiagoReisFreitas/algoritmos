package algoritmos.quickSort;

import static algoritmos.uteis.Uteis.printArray;

public class QuickSort {
    public static void main(String[] args){
        int[] lista = {7,65,5,4,3,45,65,8,7,12,1};
        System.out.println("Array antes do quick sort: ");
        printArray(lista);
        quickSort(lista, 0, lista.length-1);
        System.out.println("\n\nArray depois do quick sort: ");
        printArray(lista);
    }

    private static int particao(int[] arr, int low, int high){
        int pivot = arr[high];
        int temp ,ind = low -1;
        for(int i = low; i < high; i++){
            if (arr[i] <= pivot){
                ind++;
                temp = arr[ind];
                arr[ind] = arr[i];
                arr[i] = temp;
            }
        }
        temp = arr[ind+1];
        arr[ind+1] = arr[high];
        arr[high] = temp;
        return ind+1;
    }

    private static void quickSort(int[] arr, int low, int high){
        if (low < high){
            int pi = particao(arr, low, high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
}
