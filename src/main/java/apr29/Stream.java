package apr29;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.*;


public class Stream {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>(List.of(22,511,33,44,66,88,110,151,51,21548,1202,15));

        /*Stream<Integer> numberStream = numbers.stream();
        Predicate<Integer> predicate = n -> n % 2 !=0;*/
        numbers.stream().filter(n-> n %2 ==0 ).filter(n -> n%11 ==0).forEach(n-> System.out.println(n));
        
        /// to add more numbers
        List<Integer> newCollection = numbers.stream().filter(n -> n % 2 == 0).filter(n -> n % 11 == 0).collect(Collectors.toList());
        System.out.println(newCollection);

        /// do not modify the original data set

        /// intermediate method => which returns streams object
        /// terminatory method => do not return stream object


        /*numbers.stream().filter(n -> n%2!=0).*/



    }
}
