package edu.upc.dsa;


import edu.upc.dsa.figuras.Rectangle;
import edu.upc.dsa.figuras.Cercle;
import edu.upc.dsa.figuras.Figura;

import java.util.Arrays;

public class GestorClases {

    public static void sort(Figura[] v) {
        Arrays.sort(v);
    }

    public static double suma(Figura[] v) {
        double suma = 0;
        for (Figura f: v) {
            suma += f.area();
        }
        return suma;
    }


    public static void main(String[] args) {
        Figura[] v = new Figura[3];
        v[0] = new Cercle(5);
        v[1] = new Rectangle(2,1);
        v[2] = new Rectangle(2,2);

        double s = GestorClases.suma(v);

        System.out.println(v[0]);

        System.out.println("la suma total de las areas es: Area circulo: " + v[0].area() + " +  Area Cuadrado: " + v[1].area() +  " +  Area Rectangulo: " + v[2].area() + " = " + s);

        System.out.println(Arrays.asList(v));
        GestorClases.sort(v);
        System.out.println(Arrays.asList(v));
    }
}