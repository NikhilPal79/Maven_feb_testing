package apr29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Practice {
    public static void main(String[] args) {

        List<String> name = new ArrayList<>(List.of("bob","","","tom","jon","sam","john","","sammy","peter","peterson","donald"));

        System.out.println(" original list: " + name);

        List<String> filteredName = name.stream().filter(n -> n.length() == 3).distinct().collect(Collectors.toList());

        System.out.println("processed list: " + filteredName);

        long emptyList = name.stream().filter(n -> n.isEmpty()).count();

        System.out.println("empty strings : " + emptyList);


    }
}
