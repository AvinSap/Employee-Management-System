import java.io.Serializable;

public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nameOfEmployee;
    private int age;
    private String position;
    private int idNumber;

    //Default constructor for default values:
    public Employee(){
        nameOfEmployee = "Unknown";
    }

    //Parameterized Constructor for set values
    public Employee(String nameOfEmployee){
        this.nameOfEmployee = nameOfEmployee;
        // set default age to 5 years
        this.age = 5;
    }

    public String getNameOfEmployee() {
        return nameOfEmployee;
    }

    public void setNameOfEmployee(String nameOfEmployee) {
        this.nameOfEmployee = nameOfEmployee;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
}
