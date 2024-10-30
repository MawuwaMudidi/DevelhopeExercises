public class Professor {
    private int professorID;
    private String firstName;
    private String lastName;
    private String course;

    public Professor(int professorID, String firstName, String lastName, String course) {
        this.professorID = professorID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.course = course;
    }
    //
    public Professor(int professorID, String firstName, String lastName) {
        this(professorID, firstName, lastName, null);
    }
    public void setProfessorID(int professorID) {
        this.professorID = professorID;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public int getProfessorID() {
        return professorID;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void assignGrade(Student s, int grade) {
        if(grade >= 18){
            s.getGrades().add((double) grade);
        } else {
            System.out.println(s.getFirstName() + " " + s.getLastName() + " has failed the course");
        }
    }
}
