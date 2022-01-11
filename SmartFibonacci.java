import java.util.*;

public class SmartFibonacci
{
    static ArrayList<Integer> values = new ArrayList<Integer>();
    static int maxSize;
    public static void main(String[] args)
    {
        //for(int i = 0; i < 10; i++)
        //{
        //    System.out.println(fibonacci(i+1) + " ");
        //}
        maxSize = 10;
        System.out.println(fibonacci(maxSize));
    }
    
    public static int fibonacci(int index)
    {
        if (index <= 2)
        {
           return 1;   
        }

        values.add(0, fibonacci(index-1)+fibonacci(index-2));
        return values.get(0);
    }
    
    
}
