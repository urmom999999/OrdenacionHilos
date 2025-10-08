import java.util.Arrays;
//Compara los valores con el siguiente cambiando su posicion
public class Burbuja extends Thread{
    int[] numerosjs;
    public int posicion;
public Burbuja(int[] numeros){
    this.numerosjs=numeros;
}
@Override
public void run(){
    //contar tiempo NANOTIME SI NO DA 0
    long inicio = System.nanoTime();
    
    for (int i = 0; i < numerosjs.length - 1; i++) {
        for (int j = 0; j < numerosjs.length - i - 1; j++) {
            if (numerosjs[j] > numerosjs[j + 1]) {
                int temp = numerosjs[j];
                numerosjs[j] = numerosjs[j + 1];
                numerosjs[j + 1] = temp;
            }
        }
    }

    //TERMINAR DE CONTAR
    long fin = System.nanoTime();
    String nombre="Burbuja";
    long tiempoNano=(fin-inicio);
    //PASAR A MILISEGUNDOS
    double tiempoMs = tiempoNano / 1_000_000.0;
    Puesto.posicion(tiempoMs,nombre,posicion);
    System.out.println("Burbuja en "+ (tiempoMs)+ " segundos, datos: "+Arrays.toString(numerosjs) );



}
}
