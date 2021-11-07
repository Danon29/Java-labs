package ru.bfu.ipmit.ilya;

enum ShapeType
{
    TRIANGLE,
    RECTANGLE,
    ELLIPSE,
    CIRCLE,
    SQUARE
}

class Triangle implements  Shape
{
   double a, b, c;

   Triangle(double a, double b, double c)
   {
       this.a = a;
       this.b = b;
       this.c = c;
   }

   @Override
   public double getArea()
   {
       if (a + b > c && a + c > b && b + c > a)
       {
           return (getPerimetr()*(getPerimetr()-a)*(getPerimetr()-b)*(getPerimetr()-c));
       }
   }

   @Override
   public double getPerimetr()
   {
       return a + b + c;
   }
   @Override
   public ShapeType getType()
   {
       return ShapeType.TRIANGLE;
   }
}

interface  Shape
{
    double getArea();
    double getPerimetr();
    String getType();
}

interface  WithRadius
{
    double getRadius();
}



class Rectangle implements  Shape
{
    double a, b;

    Rectangle()
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea()
    {
        return a*b;
    }

    @Override
    public double getPerimetr()
    {
        return 2*(a+b);
    }

    @Override
    public ShapeType getType()
    {
        return ShapeType.RECTANGLE;
    }
}

class Ellipse implements  Shape
{
    double a, b;

    Ellipse()
    {
        a=0;
        b=0;
    }

    Ellipse(double a, double b)
    {
        this.a = a;
        this.b = b;
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        return 4 * (Math.PI * a * b + Math.pow((a - b), 2)) / (a + b);
    }

    @Override
    public ShapeType getType() {
        return ShapeType.ELLIPSE;
    }
}


class  Circle extends Ellipse implements WithRadius
{
    Circle()
    {
        a = 0;
        b = 0;
    }

    Circle(double r)
    {
        a = r;
        b = r;
    }

    @Override
    public double getRadius()
    {
        return a;
    }

    @Override
    public ShapeType getType()
    {
        return ShapeType.CIRCLE;
    }

    static Circle fromArea(double area)
    {
        double r = Math.sqrt(area / Math.PI);
        return new Circle(r);
    }
}

class Square extends Rectangle
{
    Square()
    {
        a = 0;
        b = 0;
    }

    Square(double a)
    {
        this.a = a;
        this.b = a;
    }

    @Override
    public ShapeType getType()
    {
        return ShapeType.SQUARE;
    }

    public double getArea()
    {
        return super.getArea();
    }

    static Rectangle fromArea(double area)
    {
        double a = Math.sqrt(area);
        return new Rectangle(a, a);
    }
}



interface  ShapeCalculator()
{
    double getArea(Shape[] shapes);
}

class ShapeSumAreas implements ShapeCalculator
{
    @Override
    public double getArea(Shape[] shapes)
    {

        double sum = 0;
        for (Shape shape : shapes)
        {
            sum += shape.getArea();
        }
        return sum;
    }
}

class Main
{

    public static void main(String[] args)
    {
	// write your code here
    }
}
