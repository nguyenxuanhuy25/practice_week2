public class Director extends Employee {
    private double ownershipPercentage;
    public Director(String employeeID , String fullName ,
                    String phoneNumber , int workingDays ,
                    double dailySalary , double ownershipPercentage){
        super(employeeID, fullName, phoneNumber, workingDays, dailySalary);
        this.ownershipPercentage = ownershipPercentage;
    }
    public double getOwnershipPercentage(){
        return ownershipPercentage;
    }
    public void setOwnershipPercentage(double ownershipPercentage){
        if(ownershipPercentage >=0 && ownershipPercentage <=100){
            this.ownershipPercentage = ownershipPercentage;
        } else {
            System.out.println("ownershipPercent does not range from 0 to 100");
        }
    }

    @Override
    public double SalaryCalculationMethod() {
        return super.SalaryCalculationMethod();
    }

    // Phương thức toString
    @Override
    public String toString() {
        return "Director{" +
                "employeeid=" + getEmployeeID() +
                ", fullname='" + getFullname() + '\'' +
                ", phoneNumber='" + getPhonenumber() + '\'' +
                ", workingdays =" + getWorkingdays() +
                ", dailySalary=" + getDailysalary() +
                ", ownershipPercentage=" + ownershipPercentage +
                '}';
    }



}

