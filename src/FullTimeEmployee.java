public class FullTimeEmployee extends Employee implements Taxable,Promotable{
    //properties:
    int noOfHours;
    int salary;
    int experience;
    String address;
    boolean promotion;

    public int getNoOfHours() {
        return noOfHours;
    }

    public void setNoOfHours(int noOfHours) {
        this.noOfHours = noOfHours;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String getNameOfEmployee() {
        return "Full-Time Employee";
    }

    @Override
    public void grantPromotion() {
        System.out.println("Your total Salary after Promotion is: $" + (salary + 100) );
        salary += 100;
    }

    @Override
    public void applyTax() {
        System.out.println("Your total Salary after Taxes is: $" + (salary - 75) );

    }
}
