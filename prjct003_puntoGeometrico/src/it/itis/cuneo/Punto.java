package it.itis.cuneo;

public class Punto {

    private double x;
    private double y;

    public Punto() { super(); }
    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }
    public Punto(Punto punto){
        this.x = punto.getX();
        this.y = punto.getY();
    }

    public void setX(double x) { this.x = x; }
    public void setY(double y) { this.y = y; }
    public double getX() { return x; }

    public double getY() { return y; }

    public String toString(){
        return "Punto{ \"x\":" + x + ", \"y\":" + y + " }";
    }

    public boolean equals(Punto punto) {
        boolean ret = false;

        if(this.x == punto.getX() &&  this.y == punto.getY()){
            ret = true;
        }

        return ret;
    }

    public static void main(String[] args) {

    }
}
