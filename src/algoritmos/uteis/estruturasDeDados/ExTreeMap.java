package algoritmos.uteis.estruturasDeDados;

import java.util.TreeMap;

public class ExTreeMap {
//implementação mapa baseada em chave e valor mantendo as chaves em ordem natural
    public static void  main (String[] args){
        TreeMap<String, Integer> mapa = new TreeMap<>();

        mapa.put("A", 1);
        mapa.put("B", 2);
        mapa.put("C", 3);

        for(String chave : mapa.keySet()){
            System.out.println(chave + " : " + mapa.get(chave));
        }
    }
}
