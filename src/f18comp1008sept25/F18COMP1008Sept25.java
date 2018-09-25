
package f18comp1008sept25;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jwright
 */
public class F18COMP1008Sept25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(87);
        numbers.add(99);
        numbers.add(55);
        numbers.add(82);
        numbers.add(90);
        numbers.add(100);
        numbers.add(110);
        numbers.add(3);
        
        System.out.printf("The minimum number of %s is %d%n", numbers, min(numbers));
        System.out.printf("The maximum number of %s is %d%n", numbers, max(numbers));
        System.out.printf("The average of %s is %.1f%n", numbers, avg(numbers));
    }
    
    public static int min(ArrayList<Integer> list)
    {
        int minimum = list.get(0);
        for (Integer number:list)
        {
            if (number < minimum)
                minimum = number;
        }
        return minimum;
    }
    
    public static int max(ArrayList<Integer> list)
    {
        int max = list.get(0);
        for (Integer number:list)
        {
            if (number > max)
                max = number;
        }
        return max;
    }
    
    public static double avg(ArrayList<Integer> list)
    {
        double sum = 0;
        for (Integer number:list)
        {
            sum += number;
        }
        return sum / list.size();
    }
    
}
