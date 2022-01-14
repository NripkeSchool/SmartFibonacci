import java.util.*;

public class SmartFibonacci
{
    static int maxSize;
    static long[] values;
    public static void main(String[] args)
    {
        long start = System.nanoTime();
        maxSize = 1000;
        values = new long[maxSize];
        System.out.println(fibonacci(maxSize));
        long end = System.nanoTime();
        System.out.println((end-start)/1000000000);
    }
    
    public static long fibonacci(int index)
    {
        if (index <= 2)
        {
           return 1;   
        }
        if (values[index-1] != 0)
        {
            return values[index-1];
        }
        values[index-1] = fibonacci(index-1)+fibonacci(index-2);
        
        return values[index-1];
    }
    
    
}
