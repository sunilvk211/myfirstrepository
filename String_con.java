public class String_con
{
public static void main(String arg[])
{

String name="956859";

int i = Integer.parseInt(name);

System.out.println("String Value = "+name+name);

System.out.println("int value = " +( i+i));

float f=Float.parseFloat(name);
System.out.println("float value "+ (f+f));

double d=Double.parseDouble(name);
System.out.println("double value "+(d-d));

System.out.println("~~~~~~~~~~ Number to String ~~~~~~~~~~~~~~~~~~~");

double ff2 = 34839.83;
short sd=3248;
String ss3=String.valueOf(sd);
System.out.println("String value"+ss3);

String ss2=String.valueOf(ff2);
System.out.println("Add = "+(ff2+ff2));
System.out.println("String value = "+ss2+" Add String "+(ss2+ss2));

}
}