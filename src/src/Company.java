import java.util.ArrayList;
import java.util.List;

public class Company {
    private String companyName;
    private String taxNumber ;
    private double monthlyRevenue;
    private List<Employee> employees = new ArrayList<>();
    private List<Director> directors = new ArrayList<>();

    public Company(String companyName,String taxNumber , double monthlyRevenue){
        this.companyName = companyName;
        this.taxNumber = taxNumber;
        this.monthlyRevenue = monthlyRevenue;
    }
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public String getCompanyName(){
        return companyName;
    }
    public void setTaxNumber(String  taxNumber){
        this.taxNumber = taxNumber;
    }
    public String getTaxNumber(){
        return taxNumber;
    }
    public void setMonthlyRevenue(double monthlyRevenue){
        this.monthlyRevenue = monthlyRevenue;
    }
    public double getMonthlyRevenue(){
        return monthlyRevenue;
    }

    // add 1 element
    public void addEmployees(Employee employees) {
        employees.add(employees);
    }
    public void addDirector(Director director) {
        directors.add(director);
    }
    public List<Director> getDirectors() {
        return directors;
    }
    // delete 1 element
    public void removeEmployees(Employee employees) {
        employees.remove(employees);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

}