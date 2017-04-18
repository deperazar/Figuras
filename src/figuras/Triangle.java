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
public class Triangle extends Shape{
    private double width;
    private double height;
    
    public Triangle(int numSides,double width,double height){
        super(numSides);
        this.width=width;
        this.height=height;
    }
    
    @Override
    public double getArea(){
        return this.width*this.height/2;
    }
    
    @Override
    public double getPerimeter(){
        return width+2*Math.sqrt(Math.pow(this.height,2)+Math.pow(this.height/2,2));
    }
    
}
