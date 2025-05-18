public class Intern extends Employee implements Promotable{
    //properties
    int noOfHours;
    int Salary;
    String address;

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public int getSalary() {
        return Salary;
    }

    public void setSalary(int salary) {
        Salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void grantPromotion() {
     System.out.println("Your Hard work Has Paid Off. You have been Promoted to a Junior Software Developer");
    }

    @Override
    public String getNameOfEmployee() {
        return "Intern";
    }
}
