package algoritmos.uteis.estruturasDeDados;

import java.util.HashMap;

public class ExHashMap {
    public static void main(String[] args){
//implementação de tabela de hash que armazena pares chave e valor
        HashMap<String, Integer> mapa = new HashMap<>();

        mapa.put("Thiago", 24);
        mapa.put("Deize", 53);

    System.out.println(mapa.get("Thiago"));
    }
}
