import java.util.ArrayList;
import java.util.List;

// Student class
class Student{

  // Variables
  private String name;
  private int regNo;
  private double mark;

  public Student(String name, int regNo, double mark){
    this.name = name;
    this.regNo = regNo;
    this.mark = mark;
  }

  // getters
  public String getName(){
    return name;
  }

  public int getRegNo(){
    return regNo;
  }

  public double getMark(){
    return mark;
  }

  //function to display info
  public void displayInfo(){
    System.out.println("Name : " + name + " | Registration No. : " + regNo + " | Mark : " + mark + " | " );
  }
}
