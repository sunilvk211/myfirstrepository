public class Convert
{
public static void main(String[] arg)
{
byte b=120;
System.out.println(" BYTE : "+ b);
short s=b;
System.out.println("SHORT : "+s);
int i=s;
System.out.println("INT : "+i);
long l=i;
System.out.println("LONG : "+l);
float f=l;
System.out.println("FLOAT : "+ f);
double d=f;
System.out.println("DOUBLE : "+d);
int ii=384472;
double dd=ii;
System.out.println("Double from int "+(dd+43758.8374));
char c='V';
int ifmc=c;
System.out.println("Double from int "+(dd+43758.8374));
System.out.println(" Data type Converted :  "+ b +" "+s+" "+i+" "+l+" "+f+" "+d+" "+dd+" "+ifmc);
}}