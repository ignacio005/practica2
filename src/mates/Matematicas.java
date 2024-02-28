/*
Copyright [2024] [Ignacio Tirado Meza]
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */
package mates;
/**
 * Esta clase gestiona las operaciones matemáticas necesarias.
 */
public class Matematicas {
    static double r = 1;
    static int dentro=0;

    /**
     * El método comprueba que puntos están dentro del círculo y calcula la aproximación de pi, mediante recursividad.
     * @param pasos es el total de puntos.
     * @return devuelve la aproximación del número pi.
     */
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


            generarNumeroPiRecursivo(--pasos);
        }
        double pi = 4.0 * dentro / pasos;
        return pi;
    }
}
