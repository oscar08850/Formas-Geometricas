package edu.upc.dsa.figuras;


public class Cercle extends Figura {

    private double r;

    public Cercle(double r) {
        this.r = r;
    }

    public double area(){
        return Math.PI * Math.pow(this.r,2);
    }


    public String toString(){
        return "Circulo r: " + this.r + " area: (" + this.area() +")";
    }
}

