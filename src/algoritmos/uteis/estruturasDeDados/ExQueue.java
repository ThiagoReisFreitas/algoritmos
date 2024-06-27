package algoritmos.uteis.estruturasDeDados;

import java.util.LinkedList;
import java.util.Queue;

public class ExQueue {
    public static void  main(String[] args){
//Fila onde o um elemento inserido vai para o fim da lista e o primeiro elemento é retidado
        Queue<String> fila = new LinkedList<>();
        fila.offer("Primeiro");
        fila.offer("Segundo");
        fila.offer("Terceiro");

        while(!fila.isEmpty()){
            System.out.println(fila.poll());
        }
    }
}
