package com.company;
class Cylinder{
    float radius;
    float height;
    Cylinder(float r, float h ){
       radius = r;
       height= h;
    }
    double calculate(){
        double surfacearea = (22*radius*(radius+height))/7;
        return surfacearea;
    }
    double calculate2(){
        double volume=3.14*(radius*radius)*height;
        return volume;
    }
}
class cube{
    float surfacearea;
    double volume;
    cube(float h ){
        surfacearea = 6*h*h;
        volume= h*h*h;
    }
}
public class ooplabday2
{
    public static void main(String args[])
    {
        Cylinder sample= new Cylinder(2,3);
        System.out.println("Surface Area of Cylinder is: "+sample.calculate());
        System.out.println("volume of Cylinder is "+sample.calculate2());
       cube sample2= new cube(2);
       System.out.println("Surface area of cube is : " + sample2.surfacearea);
       System.out.println("volume of cube is : " + sample2.volume);
    }
}