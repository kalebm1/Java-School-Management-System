package SchoolManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class schoolManagementSystem{

    public static void main(String[] args){
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);


        Student tamasha = new Student(1,"Tamasha",4.0);
        Student rakshith = new Student(2,"Rakshith Vasudev",2.5);
        Student rabbi = new Student(3,"Rabbi",3.0);
        List<Student> studentList = new ArrayList<>();

        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);



        School ghs = new School(teacherList,studentList);

        System.out.println("AVG GPA: "+ghs.getAvgGpa());

        Teacher megan = new Teacher(6,"Megan", 900);

        ghs.addTeacher(megan);


        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $"+ ghs.getTotalMoneyMade());

        System.out.println("------Making SCHOOL PAY SALARY----");
        lizzy.getPaid(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +" and now has $" + ghs.getTotalMoneyMade());

        vanderhorn.getPaid(vanderhorn.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhorn.getName()
                +" and now has $" + ghs.getTotalMoneyMade());


        System.out.println(rakshith);

        mellisa.getPaid(mellisa.getSalary());

        System.out.println(mellisa); 
    }

}