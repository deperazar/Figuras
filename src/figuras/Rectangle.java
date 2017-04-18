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
public class Rectangle extends Shape{
    private double width;
    private double height;
    
    public Rectangle(int numSides,double width,double height){
        super(numSides);
        this.width=width;
        this.height=height;
    }
    
    @Override
    public double getArea(){
        return this.width*this.height;
    }
    
    @Override
    public double getPerimeter(){
        return (2*width)+(2*height);
    }
    
}
