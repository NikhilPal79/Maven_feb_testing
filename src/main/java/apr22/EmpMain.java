package apr22;

import java.util.HashMap;
import java.util.Map;

public class EmpMain {
    public static void main(String[] args) {


        Map<Employee, Integer> salary = new HashMap<>();
        salary.put(new Employee(5072,"nikhil","pal"),65000);
        salary.put(new Employee(7544,"harp","ral"),55000);

        System.out.println(salary.get(new Employee(5072, "nikhil", "pal")));


    }
}
