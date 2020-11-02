/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Baithuchanhso1;

import java.util.Scanner;

/**
 *
 * @author vutro
 */
public class Baithuchanh1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {            
            System.out.println("hinh ban muon dung  ");
            String st = sc.nextLine();
            switch (st){
                case "vuong":
                    Square square = new Square();
                    System.out.println("nhap do dai canh");
                    square.setX(sc.nextFloat());
                    System.out.println("Area = " + square.area());
                    System.out.println("circumference = "+square.circumference());
                    break;
                case "tron":
                    Circle circle =new Circle();
                    System.out.println("nhap ban kinh ");
                    circle.setX(sc.nextFloat());
                    System.out.println("Area = "+ circle.area());
                    System.out.println("circumference = "+ circle.circumference());
                    break;
                    default: return;
            }
            sc.nextLine();
        }
                
    }
    
}
