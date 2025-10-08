public class Puesto {
    public static int siguientePosicion=0;
public static int posicion(double tiempoMs, String nombre, int posicion){
    siguientePosicion++;
    posicion=siguientePosicion;
    System.out.println(nombre + " terminó en la posicion: "+posicion +"!");
    return posicion;
}
}
