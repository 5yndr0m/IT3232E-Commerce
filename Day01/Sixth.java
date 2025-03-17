import java.util.ArrayList;
import java.util.List;

// Student class
class Student {

    // Variables
    private String name;
    private int regNo;
    private double mark;

    public Student(String name, int regNo, double mark) {
        this.name = name;
        this.regNo = regNo;
        this.mark = mark;
    }

    // getters
    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public double getMark() {
        return mark;
    }

    //function to display info
    public void displayInfo() {
        System.out.println(
            "Name : " +
            name +
            " | Registration No. : " +
            regNo +
            " | Mark : " +
            mark +
            " | "
        );
    }
}

public class Sixth {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();

        students.add(new Student("Alice", 100, 85));
        students.add(new Student("John", 101, 70));
        students.add(new Student("Mike", 102, 55));
        students.add(new Student("Jane", 103, 43));
        students.add(new Student("Lucy", 104, 64));

        double totalMarks = 0;

        for (Student student : students) {
            totalMarks += student.getMark();
        }

        double averageMarks = totalMarks / students.size();
        System.out.println("Average Marks is : " + averageMarks);

        for (Student student : students) {
            student.displayInfo();
        }
    }
}
