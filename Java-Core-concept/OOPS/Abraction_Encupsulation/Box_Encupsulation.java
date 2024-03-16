package OOPS.Abraction_Encupsulation;

import OOPS.Inherritence.Boxs;

public class Box_Encupsulation extends Abstraction
{
    private double length;             // private - only accessible in the class
    protected double height;           //  protected - access with in class. from object, it can only accessible by a subclass both(in package and out of package)
    double width;                      // default - like protected but it only accessible with in same package

    public void display()
    {
        System.out.println("length - "+length+".inch");
        System.out.println("height - "+height+".inch");
        System.out.println("width  - "+width+".inch");
    }
    public Box_Encupsulation()
    {
        length = 0.0;
        height = 0.0;
        width = 0.0;
    }

    public void set_size(double same)
    {
        length = same;
        height = same;
        width  = same;
    }

    public void set_size(double length, double height, double width)
    {
        this.length = length;
        this.height = height;
        this.width = width;
    }
    public void copy_sized(Boxs other)
    {
        this.width  = other.width;
        this.length = other.length;
        this.height = other.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

}
