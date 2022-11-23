public class TypeCasting
{
public static void main(String ar[])
{

double d=32788.93483;
System.out.println("double value ="+d);
System.out.println("~~~~~~~~~~~~~~~~~~~");

float f=(float)d;
System.out.println( " Float = "+ f);

long l=(long)f;
System.out.println("Long ="+l);

int i = (int)l; // 4 byte  654958658 
System.out.println(" Int = "+i);

short ss=(short)i; // 2byte  -32768 to 32767
System.out.println("Short = "+ss);

byte bb=(byte)ss; // 1 byte ( 8 bits ) -128 to 127
System.out.println(" Byte = "+bb);

int i2=bb;
System.out.println(" Bype to int = "+i2);

System.out.println("~~~~~~~~~~~~~~~~~~");

int i4=80;
int i5=100;
97+26+123.
char c4=(char)i4;
char c5=(char)i5;
System.out.println("Int i4= "+i4+" // "+"Char c4 = "+c4);
System.out.println("int i5 = "+i5+" // "+"Char c5 ="+c5);

}
}