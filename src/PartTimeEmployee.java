import java.io.Serializable;

public class PartTimeEmployee extends Employee implements Taxable,Promotable, Serializable {
    int noOfHours;
    int salary;
    int experience;
    String Address;
    boolean promotion;

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void grantPromotion() {
     System.out.println("Sorry you are not a full time worker." );
    }

    @Override
    public void applyTax() {
        System.out.println("Your total Salary after Taxes is: " + (salary - 75));
        salary -= 50;
    }

    @Override
    public String getNameOfEmployee() {
        return "Part-Time Employee";
    }

    @Override
    public String toString() {
        return "PartTimeEmployee{" +
                "noOfHours=" + noOfHours +
                ", salary=" + salary +
                ", experience=" + experience +
                ", Address='" + Address + '\'' +
                ", promotion=" + promotion +
                '}';
    }
}
