
package geometria;


//Carro do ovo
public class GeometriaMain {

    public static void main(String[] args) {
        
        System.out.println("----->QUADRADO COM DIAGONAL 1.41");
        Quadrado.setDiag(1.41);
        Quadrado qua= new Quadrado(2.5);
        System.out.printf("Área: %.3fcm²\n",qua.getArea());
        System.out.printf("Perímetro: %.3fcm\n",qua.getPerimetro());
        System.out.printf("Diagonal: %.3fcm\n",qua.getDiagonal());
        System.out.println("");
        
        System.out.println("-------->QUADRDO COM DIAGONAL MATH");
        Quadrado.setDiag(Math.sqrt(2));
        System.out.printf("Diagonal: %.3fcm\n",qua.getDiagonal());        
        System.out.println("");
        
        System.out.println("-------->Circulo com PI = 3.14");
        Circulo.setPI(3.14);
        Circulo cir=new Circulo(2.5);
        System.out.printf("Área do circulo: %.3fcm²\n",cir.getArea());
        System.out.printf("Circunferencia: %.3fcm\n",cir.getCircunferencia());
        System.out.println("");
        
        System.out.println("-------> Circulo com Math");
        Circulo.setPI(Math.PI);
        System.out.printf("Área do circulo: %.3fcm²\n",cir.getArea());
        System.out.printf("Circunferencia: %.3fcm\n",cir.getCircunferencia());
    }
    
}
