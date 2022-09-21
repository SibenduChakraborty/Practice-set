package com.company;

class calculateshapes
{
    calculateshapes(float x)
    {
        System.out.println("the area of the square is "+Math.pow(x, 2)+" sq units");
    }
    calculateshapes(float x, float y)
    {
        System.out.println("the area of the rectangle is "+x*y+" sq units");
    }
    calculateshapes(double x)
    {
        double z = 3.14 * x * x;
        System.out.println("the area of the circle is "+z+" sq units");
    }
}
class Overload
{
    public static void main(String args[])
    {
        calculateshapes square = new calculateshapes(5);
        calculateshapes rectangle = new calculateshapes(5,6);
        calculateshapes sphere = new calculateshapes(3.5);
    }
}
