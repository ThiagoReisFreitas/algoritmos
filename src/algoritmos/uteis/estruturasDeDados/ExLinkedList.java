package algoritmos.uteis.estruturasDeDados;

import java.util.LinkedList;

public class ExLinkedList {
    public static void main(String[] args){
//Lista duplamente encadeada que permite inserçoes rapidas e flexiveis
        LinkedList<Integer> lista = new LinkedList<>();

        lista.add(10);
        lista.add(20);
        lista.add(30);

        System.out.println("Elementos da linked list: ");

        for(int num : lista){
            System.out.println(num);
        }
    }
}
