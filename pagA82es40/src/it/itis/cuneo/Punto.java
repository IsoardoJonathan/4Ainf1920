package it.itis.cuneo;

public class Punto {

    private int x;
    private int y;

    public Punto() { super(); }
    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public Punto(Punto punto){
        this.x = punto.getX();
        this.y = punto.getY();
    }

    public void setX(int x) { this.x = x; }
    public void setY(int y) { this.y = y; }
    public int getX() { return x; }
    public int getY() { return y; }

    public String toString(){
        return "Punto{ \"x\":" + x + ", \"y\":" + y + " }";
    }

    public static void main(String[] args) {
        Punto puntoA = new Punto(3,5);
        Punto puntoB = new Punto(9,10);
        Punto puntoC = puntoA;
        Punto puntoD = new Punto();

        System.out.print("PuntoA >> ");
        System.out.println(puntoA.toString());
        System.out.print("PuntoB >> ");
        System.out.println(puntoB.toString());
        System.out.print("PuntoC >> ");
        System.out.println(puntoC.toString());
        System.out.print("PuntoD >> ");
        System.out.println(puntoD.toString());


    }
}
