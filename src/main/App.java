package main;

import java.util.ArrayList;

public class App {
    public static int encontre(int[] arrayOrdenado, int num){
        for(int i=0; i<= arrayOrdenado.length - 1; i++){
            if(arrayOrdenado[i] == num){
                return 1;
            } 
        } // pecorre elemento por elemento e vai conferir elemento por elemento
        return 0;
    }

    public static int maior(int[] arrayDesordenado){
        int maior = arrayDesordenado[0]; // considera a maior valor como o primeiro
        for(int i = 0; i <= arrayDesordenado.length -1; i++){
            if(maior < arrayDesordenado[i]){ // se o próximo valor for maior que o anterior ele é substituido 
                maior = arrayDesordenado[i];
            }
        }
        return maior;
    }

    public static Double parMaisProximo(Integer[][] pares){ // mudei para double, pois é valor quebrado
        ArrayList<Double> menorDistancia = new ArrayList<>();  // uma lista que vai guardando as distâncias
        while (true) {
            Integer[] primeiro = pares[0]; // recebe o primeiro par
            for(int i =1 ; i <= pares.length -1; i++){
                Integer[] proximo = pares[i]; // recebe o próximo par
                double tamanho = Math.sqrt(Math.pow((primeiro[0] - proximo[0]),2)  + Math.pow((primeiro[1]- proximo[1]),2)); 
                // modulo da distância
                menorDistancia.add(tamanho); // adicionando na lista
            }
            pares[0] = null; // tirar o que há foi conferido 
            if(pares.length < 2){ // enquanto tiver mais de dois pares vai rodar
                break;
            }
        }
        // mesma lógica do maior lá de cima, mas para o menor valor
        double menor = menorDistancia.get(0);
        for(int i = 0; i <= menorDistancia.size() -1; i++){
            if(menor > menorDistancia.get(i)){
                menor = menorDistancia.get(i);
            }
        }
        return menor;
    }
}
