import java.util.*;
import java.math.*;
public class HelloWorld{

     public static void main(String []args){
       BigInteger result =  new BigInteger("1");
        for(int i=2;i<=64;i++)
        {
            result = result.add(result);
        }
        System.out.println("sum of rice bags at 64th box " + result);
     }
}
Output:
sum of rice bags at 64th box 9223372036854775808
