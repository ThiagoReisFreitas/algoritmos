package algoritmos.uteis.estruturasDeDados;

import java.util.ArrayDeque;
import java.util.Deque;

public class ExDeque {
    public static void main(String[] args){
//uma fila porem com um diferencial que elementos podem ser adcionados tanto no começo quanto no final da fila
        Deque<Integer> deque = new ArrayDeque<>();

        deque.offerLast(1);
        deque.offerLast(2);
        deque.offerFirst(3);
        deque.offerFirst(4);

        while(!deque.isEmpty()){
            System.out.println(deque.pollFirst());
        }
    }
}
