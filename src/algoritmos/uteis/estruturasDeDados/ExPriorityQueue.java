package algoritmos.uteis.estruturasDeDados;

import java.util.PriorityQueue;

public class ExPriorityQueue {
    public static void main(String[] args){
//fila de prioridade baseada em binary heap onde o valor com maior prioridade é removido antes da lista
        PriorityQueue<Integer> prioridade = new PriorityQueue<>();

        prioridade.add(10);
        prioridade.add(59);
        prioridade.add(39);

        while (!prioridade.isEmpty()){
            System.out.println(prioridade.poll());
        }
    }
}
