/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package figuras;

/**
 *
 * @author Estudiante
 */
public class Figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Shape rectangulo=new Rectangle(4,15,20);
        /*int l = rectangulo.getnumSides();
        double a = rectangulo.getArea();
        double p= rectangulo.getPerimeter();*/
        Shape triangulo=new Triangle(3,15,20);
        int l = triangulo.getnumSides();
        double a = triangulo.getArea();
        double p= triangulo.getPerimeter();
        
        System.out.println("Número de lados: "+l+" Área: "+a+" Perimetro: "+p);
    }
    
}
