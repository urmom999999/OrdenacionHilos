import java.util.Arrays;
//Burbuja pero recorre el array en sentido contrario, siendo mas rapido
public class Shaker extends Thread{
    int[] numerosSh;
    public int posicion;
    public Shaker(int[] numeros){
        this.numerosSh=numeros;
    }
    @Override
    public void run(){
        long inicio = System.nanoTime();
        boolean intercambiado = true;
        int inicioIdx = 0;
        int finIdx = numerosSh.length - 1;

        while (intercambiado) {
            intercambiado = false;

            for (int i = inicioIdx; i < finIdx; i++) {
                if (numerosSh[i] > numerosSh[i + 1]) {
                    // Intercambiar
                    int temp = numerosSh[i];
                    numerosSh[i] = numerosSh[i + 1];
                    numerosSh[i + 1] = temp;
                    intercambiado = true;
                }
            }

            if (!intercambiado) {
                break;
            }

            intercambiado = false;
            finIdx--;
            for (int i = finIdx - 1; i >= inicioIdx; i--) {
                if (numerosSh[i] > numerosSh[i + 1]) {

                    int temp = numerosSh[i];
                    numerosSh[i] = numerosSh[i + 1];
                    numerosSh[i + 1] = temp;
                    intercambiado = true;
                }
            }

            inicioIdx++;
        }
        String nombre="Shaker";
        long fin = System.nanoTime();
        long tiempoNano=(fin-inicio);
        //PASAR A MILISEGUNDOS
        double tiempoMs = tiempoNano / 1_000_000.0;
        Puesto.posicion(tiempoMs,nombre,posicion);
        System.out.println("Shaker en "+ (tiempoMs)+ " segundos, datos: "+ Arrays.toString(numerosSh));


    }
}
