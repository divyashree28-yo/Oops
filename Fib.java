class Fib
{
public static void main(String args[])
{
int a=0,b=1,c,i;
System.out.println(a);
System.out.println(b);
for(i=1;i<=8;i++)
{
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}