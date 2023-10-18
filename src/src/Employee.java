public class Employee {
    private String  employeeID ;
    private String fullName;
    private String phoneNumber ;
    private int workingDays;
    private double dailySalary;

    public Employee(String employeeID, String fullName , String phoneNumber , int workingDays , double dailySalary){
        this.employeeID = employeeID;
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.workingDays = workingDays;
        this.dailySalary = dailySalary;
    }
    // Setter and Getter
    public void setEmloyeeID(String employeeID){
        this.employeeID = employeeID;
    }

    public String getEmployeeID(){
        return employeeID;
    }

    public void setFullName(String fullName){
        this.fullName = fullName;
    }
    public String getFullname(){
        return fullName;
    }

    public void setPhonenumber(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getPhonenumber(){
        return phoneNumber;
    }

    public void setWorkingdays(int workingDays){
        this.workingDays = workingDays;
    }
    public int getWorkingdays(){
        return workingDays;
    }

    public void setDailysalary(double dailySalary){
        this.dailySalary = dailySalary;
    }
    public double getDailysalary(){
        return dailySalary;
    }

    public double SalaryCalculationMethod() {
        return workingDays*dailySalary;
    }

    @Override
    public String toString(){
        return "Employee ID: " + employeeID
            + "\nFull Name: " + fullName
            + "\nPhone Number: " + phoneNumber
            + "\nDays Worked: " + workingDays
            + "\nDaily Salary: " + dailySalary;
    }

    protected void add(Employee employee){
    }
    protected void remove(Employee employee) {
    }
}


