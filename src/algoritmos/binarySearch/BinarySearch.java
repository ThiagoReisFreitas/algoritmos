package algoritmos.binarySearch;

public class BinarySearch {
    public static void main(String[] args){
        int[] arr = {2,3,4,10,40,67,78,99};
        String resultBin = binSearch(arr, 99);
        System.out.println("Algoritmo de busca binaria");
        System.out.println(resultBin);

        System.out.println("\n---------------------------------------------------------\n");

        String resultNormal = normalSearch(arr, 99);
        System.out.println("Algoritmo de busca um a um");
        System.out.println(resultNormal);

    }

    //Não é necessario fazer isso pois ja existe uma função binarySearch na biblioteca java.util
    private static String binSearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int counter = 0;
        while(left <= right){
            counter++;
            int mid = (left + right) / 2;
            if (arr[mid] == target)
                return "O indice do numero é "+mid+" e foi achado em "+counter+" iterações";
            else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid -1;
        }
        return "Valor não encontrado";
    }

    private static String normalSearch(int[] arr, int target){
        for(int ind = 0; ind < arr.length; ind++){
            if (arr[ind] == target){
                return "O indice do numero é "+ind+" e foi achado em "+ind+" iterações";
            }
        }
        return "Valor não encontrado";
    }
}
