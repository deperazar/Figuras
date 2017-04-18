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
public abstract class Shape {
    private int numSides;
    
    public Shape(int numSides){
        this.numSides=numSides;
    }
    
    public int getnumSides(){
        return this.numSides;
    }
    
    public abstract double getArea();
    public abstract double getPerimeter();
    
}
