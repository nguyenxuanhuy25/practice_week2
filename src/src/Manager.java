import java.util.ArrayList;
import java.util.List;
public class Manager extends Employee{
   private List<Employee> managerEmployee = new ArrayList<>();
   public Manager(String employeeID , String fullName , String phoneNumber , int workingDays , double dailySalary ){
       super(employeeID, fullName, phoneNumber, workingDays, dailySalary);
   }

    public List<Employee> getManagerEmployee() {
        return managerEmployee;
    }
    public void addManagerEmployee(Employee employee){
       managerEmployee.add(employee);
    }
    public void removeManagerEmployee(Employee employee){
       managerEmployee.remove(employee);
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Manager{" +
                "employeeid=" + getEmployeeID() +
                ", fullname='" + getFullname() + '\'' +
                ", phoneNumber='" + getPhonenumber()+ '\'' +
                ", workingdays =" + getWorkingdays()+
                ", dailySalary=" + getDailysalary() +
                '}';
    }


}
