package algoritmos.uteis.estruturasDeDados;

import java.util.HashSet;

public class ExHashSet {
    public static void main(String[] args){
//implementação de conjunto baseado m tabela de hash, armazena elementos unicos não permite duplicatas
        HashSet<String> conjunto = new HashSet<>();

        conjunto.add("Laranja");
        conjunto.add("Banana");
        conjunto.add("Maça");

        for(String fruit : conjunto){
            System.out.println(fruit);
        }
    }
}
