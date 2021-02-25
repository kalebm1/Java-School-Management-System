package SchoolManagementSystem;
import java.util.List;


public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyMade;
    private static int totalMoneySpent;


    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyMade = 0;
        totalMoneySpent = 0;
    }


    public List<Teacher> getTeachers(){
        return teachers;
    }

    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    public List<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public int getTotalMoneyMade(){
        return totalMoneyMade;
    }

    public int getTotalMoneySpent(){
        return totalMoneySpent;
    }

    public static void updateTotalMoneyEarned(int MoneyEarned){
        totalMoneyMade+=MoneyEarned;
    }

    public static void updateTotalMoneySpent(int MoneySpent){
        totalMoneySpent+=MoneySpent;
    }



}
