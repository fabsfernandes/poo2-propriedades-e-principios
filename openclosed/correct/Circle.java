/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openclosed.correct;

/**
 *
 * @author fabiola
 */
public class Circle extends Shape {
    
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
    
    public int getArea(){
        return (int) (Math.PI * radius * radius);
    }
    
}
