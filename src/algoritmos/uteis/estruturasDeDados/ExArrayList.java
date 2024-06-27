package algoritmos.uteis.estruturasDeDados;

import java.util.ArrayList;

public class ExArrayList {
    public static void main(String[] args){
//lista redimencional que permite armazenar elementos de forma dinamica
        ArrayList<String> lista = new ArrayList<>();

        lista.add("JavaScript");
        lista.add("C#");
        lista.add("Python");

        System.out.println("Elementos da lista: ");
        for(String elemento : lista){
            System.out.println(elemento);
        }
    }
}
