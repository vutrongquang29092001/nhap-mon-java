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
public class Square extends Shape{
private float x;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public Square(float x) {
        this.x = x;
    }
    public Square() {
    }

    @Override
    public float area() {
        float Area = (float) pow(this.x,2);
        return Area;
    }

    @Override
    public float circumference() {
      float Circumference = 4*this.x ;
      return Circumference;
    }
    
}
