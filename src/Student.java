import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//Student class and all the attributes
public class Student {
    private int StudentID;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private List<Double> grades;

    //constructor for student class with all attributes
    public Student(int StudentID, String firstName, String lastName, String dateOfBirth) {
        this.StudentID = StudentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.grades = grades != null ? grades : new ArrayList<>();
    }

    //constructor to initialize grades list as empty
    public Student(int StudentID, String firstName, String lastName, String dateOfBirth, List<Double> grades) {
        this(StudentID, firstName, lastName, dateOfBirth);
    }

    //setters and getters
    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades != null ? grades : new ArrayList<>();
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public double calculateAverageGrade() {
        if (grades.isEmpty()) {return 0.0;}
        int sum = 0;
        for (Double grade : grades) {
            sum += grade;
        }
        return (double) sum/ grades.size();
    }

    public boolean isExcellent() {
        for (Double grade : grades) {
            if (grade >= 28) {
                return true;
            }
        }return false;
    }
}
