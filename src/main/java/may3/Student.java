package may3;


import lombok.*;

@Data
@Builder ///  is a design pattern
@Getter
@Setter
@ToString
@NoArgsConstructor


/// what is your design pattern ?
/// website ==> refactoring guru
/// you should know a couple of them
/// interview ==> singleton design pattern
/// abstract factory
/// something from behavioural


public class Student {
    private Integer sid;
    private String firstName;
    private String lastName;
    private Integer grade;

    public Student(Integer sid, String firstName, String lastName, Integer grade) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.grade = grade;
    }

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getGrade() {
        return grade;
    }

    public void setGrade(Integer grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", grade=" + grade +
                '}';
    }
}
