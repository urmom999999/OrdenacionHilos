//Recorre todo el array en busca de el menor numero
import java.util.Arrays;

public class Seleccion extends Thread{
    int[] numerossl;
    public Seleccion(int[] numeros){
        this.numerossl=numeros;
    }
    @Override
    public void run(){
        long inicio = System.nanoTime();
        for (int i = 0; i < numerossl.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < numerossl.length; j++) {
                if (numerossl[j] < numerossl[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = numerossl[minIndex];
            numerossl[minIndex] = numerossl[i];
            numerossl[i] = temp;
        }
        long fin = System.nanoTime();
        long tiempoNano=(fin-inicio);
        //PASAR A MILISEGUNDOS
        double tiempoMs = tiempoNano / 1_000_000.0;
        System.out.println("Seleccion en "+ (tiempoMs)+ " segundos, datos:"+Arrays.toString(numerossl));
    }
}

