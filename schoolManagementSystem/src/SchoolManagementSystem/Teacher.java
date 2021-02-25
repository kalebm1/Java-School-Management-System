package SchoolManagementSystem;

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryPaid;


    public Teacher(int id, String name, int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryPaid = 0;
    }


    public int getId(){
        return id;
    }


    public String getName(){
        return name;
    }


    public int getSalary(){
        return salary;
    }


    public void setSalary(int salary){
        this.salary = salary;
    }


    public void getPaid(int salary){
        salaryPaid+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString(){
        return "Name of teacher: "+name+"\nTotal Salary Earned: $"+salaryPaid;
    }



}
