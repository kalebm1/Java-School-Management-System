package SchoolManagementSystem;

public class Student {
    private int id;
    private String name;
    private int gpa;
    private int feesPaid;
    private int totalFees;



    public Student(int id, String name, int grade){
        this.feesPaid = 0;
        this.totalFees = 30000;
        this.id = id;
        this.name = name;
        this.gpa = grade;

    }


    public void setGrade(int grade){
        this.gpa = grade;
    }

    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public int getGrade(){
        return gpa;
    }


    public int getTotalFees(){
        return totalFees;
    }

    public int getRemainingFees(){
        return totalFees-feesPaid;
    }


    @Override
    public String toString(){
        return "Student's name: "+name+"\nTotal fees paid: "+feesPaid;
    }


}
