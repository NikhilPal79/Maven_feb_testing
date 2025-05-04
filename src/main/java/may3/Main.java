package may3;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Student student1 = Student.builder().sid(101).firstName("nikhil").lastName("p").grade(64).build();
        Student student2 = Student.builder().sid(103).firstName("ankita").lastName("p").grade(31).build();
        Student student3 = Student.builder().sid(105).firstName("yadav").lastName("g").grade(79).build();
        Student student4 = Student.builder().sid(102).firstName("neeraj").lastName("s").grade(78).build();
        Student student5 = Student.builder().sid(109).firstName("tarak").lastName("s").grade(64).build();


        List<Student> students = new ArrayList<>(List.of(student1,student2,student3,student4,student5));


        /// map is the method of streams which accepts the functions


        students.stream().filter(g -> g.getGrade()>90).filter(l -> l.getLastName().startsWith("s")).map(s -> {
            s.setGrade(s.getGrade()+10);
            return s;

        }).map(s -> s.getFirstName()).forEach( name -> System.out.println(name));







    }
}
