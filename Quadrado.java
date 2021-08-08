
package geometria;

public class Quadrado {
    private double lado;
    private static double diag;
    private double area;
    private double perimetro;
    
    public Quadrado(double lado){
        this.lado=lado;
    }
    
    public double getArea(){
        return lado*lado;
    }
    public double getPerimetro(){
        return lado*4 ;
    }
    public double getDiagonal(){
        return lado*diag ;
    }
    
    public static double setDiag(double diag){
        Quadrado.diag=diag;
        return diag;
    }
}
