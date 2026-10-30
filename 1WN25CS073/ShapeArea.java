import java.util.Scanner;
abstract class Shape
{
abstract int calculateArea();
}
class Circle extends Shape
{
double pi=3.14;
double r;
void accept_Circle()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter radius:");
r=sc.nextInt();
}
int calculateArea()
{
int area;
area=(int)(pi*r*r);
return area;
}
}
class Rectangle extends Shape
{
int l,b;
void accept_Rec()
{
Scanner sc=new Scanner(System.in);
System.out.println("enter length of rectangle:");
l=sc.nextInt();
System.out.println("enter breadth of rectangle:");
b=sc.nextInt();
}
int calculateArea()
{
int a;
a=l*b;
return a;
}
}
class Demo
{
public static void main(String args[])
{
Circle c=new Circle();
Rectangle r=new Rectangle();
c.accept_Circle();
r.accept_Rec();
System.out.println("Area of circle="+c.calculateArea());
System.out.println("Area of Rectangle="+r.calculateArea());
}
}


