public class Datatype
{
public static void main(String ad[])
{
byte b=127;
short s=32767;
int i=834728;
long l=242837;
float f=298.4f;
double d=234900.27473;

char c='A';   // 65

boolean bl=true;

System.out.println(" Byte =  "+ b);
System.out.println("Short = "+ s);
System.out.println("Int = "+ i);
System.out.println("Long = "+ l);
System.out.println("Float = "+ f);
System.out.println("Double = "+ d);
System.out.println("Character = "+( c + c ));

System.out.println("Boolean = "+bl);

System.out.println(" ________________________________ ");

System.out.println(" All Premitive Data Types =  "+"  "+ b +"  "+s +"   "+ i +"   "+ l +"   "+ f +"    "+d);
System.out.println(" #################################");
System.out.println(b+s+i+l+f+d+" Final Sum ");
System.out.println(" #################################");
System.out.println(" All Variable Multiply =  " + (b*s*i*l*f*d) );

}
}