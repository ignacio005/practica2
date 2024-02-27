package mates;

public class Matematicas {
    static int r = 1;
    static int dentro=0;
    public static double generarNumeroPiRecursivo (long pasos){

        if (pasos <= 0){
            return 0;
        }else {

            double x = -r + Math.random() * r;
            double y = -r + Math.random() * r;
            double comprobacion = x * x + y * y;
            if (comprobacion <= r * r) {
                dentro++;
            }

            generarNumeroPiRecursivo(pasos - 1);
            double pi = 4.0 * dentro / pasos;
            return pi;
        }
    }
}
