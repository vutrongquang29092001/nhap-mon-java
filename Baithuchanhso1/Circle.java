/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithuchanhso1;

import static java.lang.Math.pow;

/**
 *
 * @author vutro
 */
public class Circle extends Shape {
final float PI = 3.14f;
private float x ;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public Circle() {
    }

    public Circle(float x) {
        this.x = x;
    }

  

    @Override
    public float area() {
        
       float Area =   (float) (this.PI * pow(this.x,2)); 
       return Area;
    }

    @Override
    public float circumference() {
        float Circumference = 2*this.PI*this.x;
        return Circumference;
        }

      
    
}
