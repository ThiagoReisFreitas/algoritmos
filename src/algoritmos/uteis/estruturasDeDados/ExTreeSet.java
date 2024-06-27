package algoritmos.uteis.estruturasDeDados;

import java.util.TreeSet;

public class ExTreeSet {
//implementação de conjunto com valores não duplicados
    public static void main (String[] args){
        TreeSet<Integer> conjunto = new TreeSet<>();

        conjunto.add(10);
        conjunto.add(20);
        conjunto.add(30);

        for (int num : conjunto){
            System.out.println(num);
        }
    }
}
