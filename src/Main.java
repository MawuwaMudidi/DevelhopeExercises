public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Maua", "Mudidi", "20/04/2001");
        Student student2 = new Student(2, "Melissa", "Mukundwa", "21/10/2002");
        Student student3 = new Student(3, "Prince", "Matongo","01/01/2000");
        Student student4 = new Student(4, "Peter", "Mwamba","01/01/2005");

        Professor professor1 = new Professor(1, "Osman", "Buyondo", "SQL");
        Professor professor2 = new Professor(2, "Jackson", "Mwisa");

        professor1.assignGrade(student1, 40);
        professor1.assignGrade(student2, 35);
        professor1.assignGrade(student3, 45);
        professor2.assignGrade(student4, 28);

        Student[] students = {student1, student2, student3, student4};
        Professor[] professors = {professor1, professor2};

        System.out.println("Excellent Students: ");
        for(Student student : students){
            if(student.isExcellent()){
                System.out.println(student.getFirstName() + " " + student.getLastName());
            }
        }
        Student topStudent = students[0];
        System.out.println("The top student is: ");
        for (Student student : students) {
            if(student.calculateAverageGrade() > topStudent.calculateAverageGrade()){
                topStudent = student;
                System.out.println(topStudent.getFirstName() + " " + topStudent.getLastName());
            }
        }




    }
}
