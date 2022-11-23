public class Incr
{
public static void main(String[] arg)
{
int i=1;
 // next/pass     1>2   3>       4>     5>    6>    7>         8>    9>
	int j=i++ + ++i + i++ + i++ + ++i + ++i + ++i + i++;
 //current           1   +  3   +  3     +  4  + 6	+  7  +  8  +  8

System.out.println("value of j = "+j);
System.out.println("value of i = "+i);
}
}