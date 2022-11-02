public class Employee {
    private String fullName;


    private String department;
    private double salary;
   private int id;
    private static int counter =0;

    public Employee ( String fullName, String department, double salary){
        this.fullName=fullName;
        this.salary=salary;
        this.department=department;
        counter++;
        id=counter;

    }

    public String getFullName() {
        return fullName;
    }
    public String getDepartment() {
        return department;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String department) {
        this.department = department;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString(){
        return id + " " + fullName + " Номер отдела " + department + " Зарпоата: " + salary;
    }




}
