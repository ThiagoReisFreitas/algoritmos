package algoritmos.uteis;

public class Uteis {
    public static void printArray(int[] arr){
        for(int i = 0; i< arr.length; i++){

            if(i == arr.length-1){
                System.out.printf("%d", arr[i]);
            }else{
                System.out.printf("%d, ", arr[i]);
            }
        }
    }
}
