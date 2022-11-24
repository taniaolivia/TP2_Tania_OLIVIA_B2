/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp2;

/**
 *
 * @author taniaolivia
 */
public class Circle 
{
    private final static double PI = 3.14159265; 
    private double itsDiameter;

    public Circle (double aDiameter)
    { 
        this.itsDiameter = aDiameter;
    }

    public double calculatePerimeter() //La méthode pour calculer le périmètre saisi
    { 
        return PI * this.itsDiameter ;
    }
    
    public double calculateArea() //La méthode pour calculer la surface saisi
    {
        return PI * this.itsDiameter * this.itsDiameter/4;
        
    }

}

