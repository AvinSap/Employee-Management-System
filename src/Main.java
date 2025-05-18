import java.util.Scanner;
public class Main {
    public static void main(String [] args){
        //Adding a keyboard prompt:
        Scanner keyboard = new Scanner(System.in);

        //for loop continuation (1) represents truth here
        int continueOuterLoop = 1;
        int continueInnerLoop = 1;

        //for menu options:
        int menuOption = 1;

        do {
            switch (employeeOptionMenu(keyboard)){
                case 1:
                    FullTimeEmployee fullTime = new FullTimeEmployee();
                    System.out.println("The employee that you chose is " + fullTime.getNameOfEmployee());
                    continueInnerLoop =1;
                    do {
                        menuOption = employeeDetailsManipulationMenu(keyboard,fullTime);
                        switch (menuOption) {
                            case 1:
                                System.out.println("Enter ID of Employee");
                                fullTime.setIdNumber(keyboard.nextInt());
                                System.out.println("Enter Number of Hours");
                                fullTime.setNoOfHours(keyboard.nextInt());
                                System.out.println("Enter Salary");
                                fullTime.setSalary(keyboard.nextInt());
                                System.out.println("Enter years of Experience");
                                fullTime.setExperience(keyboard.nextInt());
                                System.out.println("Enter Age Of Employee");
                                fullTime.setAge(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter Position");
                                fullTime.setPosition(keyboard.nextLine());
                                System.out.println("Enter Address");
                                fullTime.setAddress(keyboard.nextLine());

                                System.out.println("The full-time worker with ID number: " + fullTime.getIdNumber() + " is set to work: " + fullTime.getNoOfHours() + " hours, The Salary is set to: $" +
                                        fullTime.getSalary() + ", Experience to: " + fullTime.getExperience() + " years, Position to: "
                                        + fullTime.getPosition() + " and Address to: " + fullTime.getAddress());
                                break;
                            case 2:
                                System.out.println("ID Number : " + fullTime.getIdNumber());
                                System.out.println("Hours per week : " + fullTime.getNoOfHours() + " hours");
                                System.out.println("Salary : $" + fullTime.getSalary());
                                System.out.println("Experience : " + fullTime.getExperience() + " years");
                                System.out.println("Age : " + fullTime.getAge() + "years old");
                                System.out.println("Position : " + fullTime.getPosition());
                                System.out.println("Address : " + fullTime.getAddress());
                                break;
                            case 3:
                                keyboard.nextLine();
                                System.out.println("Did you receive an Email about promotion? (true/false)");
                                fullTime.promotion = Boolean.parseBoolean(keyboard.nextLine());
                                if (fullTime.promotion){
                                    fullTime.grantPromotion();
                                }else {
                                    System.out.println("Sorry No Promotion Available currently");
                                }
                                break;
                            case 4:
                                fullTime.applyTax();
                                break;
                            case 5:
                                System.out.println("Thank you!!");
                                continueInnerLoop = 0;
                                break;
                            default:
                                System.out.println("Sorry Option Not Available");

                        }
                    }while (continueInnerLoop == 1);
                    break;
                case 2:
                    PartTimeEmployee partTime = new PartTimeEmployee();
                    System.out.println("The employee that you chose is " + partTime.getNameOfEmployee());
                    continueInnerLoop =1;
                    do {
                        menuOption = employeeDetailsManipulationMenu(keyboard,partTime);
                        switch (menuOption) {
                            case 1:
                                System.out.println("Enter ID of Employee");
                                partTime.setIdNumber(keyboard.nextInt());
                                System.out.println("Enter Number of Hours");
                                partTime.setNoOfHours(keyboard.nextInt());
                                System.out.println("Enter Salary");
                                partTime.setSalary(keyboard.nextInt());
                                System.out.println("Enter years of Experience");
                                partTime.setExperience(keyboard.nextInt());
                                System.out.println("Enter Age Of Employee");
                                partTime.setAge(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter Position");
                                partTime.setPosition(keyboard.nextLine());
                                System.out.println("Enter Address");
                                partTime.setAddress(keyboard.nextLine());

                                System.out.println("The part-time worker with ID number: " + partTime.getIdNumber() + " is set to work: " + partTime.getNoOfHours() + " hours, The Salary is set to: $" +
                                        partTime.getSalary() + ", Experience to: " + partTime.getExperience() + " years, Position to: "
                                        + partTime.getPosition() + " and Address to: " + partTime.getAddress());
                                break;
                            case 2:
                                System.out.println("ID Number : " + partTime.getIdNumber());
                                System.out.println("Hours per week : " + partTime.getNoOfHours() + " hours");
                                System.out.println("Salary : $" + partTime.getSalary());
                                System.out.println("Experience : " + partTime.getExperience() + " years");
                                System.out.println("Age : " + partTime.getAge() + "years old");
                                System.out.println("Position : " + partTime.getPosition());
                                System.out.println("Address : " + partTime.getAddress());
                                break;
                            case 3:
                                keyboard.nextLine();
                                System.out.println("Are you a Full-Time Employee? (true/false)");
                                partTime.promotion = Boolean.parseBoolean(keyboard.nextLine());
                                if (partTime.promotion){
                                    partTime.grantPromotion();
                                }else {
                                    System.out.println("Sorry No Promotion Available for Part-Time");
                                }
                                break;
                            case 4:
                                partTime.applyTax();
                                break;
                            case 5:
                                System.out.println("Thank you!!");
                                continueInnerLoop = 0;
                                break;
                            default:
                                System.out.println("Sorry Option Not Available");

                        }
                    }while (continueInnerLoop == 1);
                    break;
                case 3:
                    Intern intern = new Intern();
                    System.out.println("The employee that you chose is " + intern.getNameOfEmployee());
                    continueInnerLoop =1;
                    do {
                        menuOption = employeeDetailsManipulationMenu(keyboard,intern);
                        switch (menuOption) {
                            case 1:
                                System.out.println("Enter ID of Employee");
                                intern.setIdNumber(keyboard.nextInt());
                                System.out.println("Enter Number of Hours");
                                intern.setNoOfHours(keyboard.nextInt());
                                System.out.println("Enter Salary");
                                intern.setSalary(keyboard.nextInt());
                                System.out.println("Enter Age Of Employee");
                                intern.setAge(keyboard.nextInt());
                                keyboard.nextLine();
                                System.out.println("Enter Position");
                                intern.setPosition(keyboard.nextLine());
                                System.out.println("Enter Address");
                                intern.setAddress(keyboard.nextLine());

                                System.out.println("The part-time worker with ID number: " + intern.getIdNumber() + " is set to work: " + intern.getNoOfHours() + " hours, The Salary is set to: $" +
                                        intern.getSalary() + ", Position to: "
                                        + intern.getPosition() + " and Address to: " + intern.getAddress());
                                break;
                            case 2:
                                System.out.println("ID Number : " + intern.getIdNumber());
                                System.out.println("Hours per week : " + intern.getNoOfHours() + " hours");
                                System.out.println("Salary : $" + intern.getSalary());
                                System.out.println("Age : " + intern.getAge() + "years old");
                                System.out.println("Position : " + intern.getPosition());
                                System.out.println("Address : " + intern.getAddress());
                                break;
                            case 3:
                                intern.grantPromotion();
                                break;
                            case 4:
                                System.out.println("No taxes for internship roles.");
                                break;
                            case 5:
                                System.out.println("Thank you!!");
                                continueInnerLoop = 0;
                                break;
                            default:
                                System.out.println("Sorry Option Not Available");

                        }
                    }while (continueInnerLoop == 1);
                    break;
                case 4:
                    System.out.println("Thank you for using the Software!!");
                    break;
                default:
                    System.out.println("Sorry Enter Number between 1-4 " );

            }

            System.out.println("Continue main menu? (Enter 1 for yes/ 2 for no):");
            continueOuterLoop = keyboard.nextInt();
        }while(continueOuterLoop == 1);
    }

    private static int employeeOptionMenu(Scanner keyboard){
        int choiceByUser;
            System.out.println("******* EMPLOYEE MENU ******");
            System.out.println("1. Full-time");
            System.out.println("2. Part-Time");
            System.out.println("3. Intern");
            System.out.println("4. Exit...");

            System.out.println("Enter choice of Employee (1-3):");
            choiceByUser = keyboard.nextInt();
            return choiceByUser;
        }

        private static int employeeDetailsManipulationMenu(Scanner keyboard, Employee employee) {
            int choiceByUser;
            System.out.println("******* EMPLOYEE details menu for: " + employee.getNameOfEmployee() + " ******");
            System.out.println("1. Set Profile");
            System.out.println("2. Display Profile");
            System.out.println("3. Display Promotion");
            System.out.println("4. Display Tax");
            System.out.println("5. Go Back to Main Menu");

            System.out.println("Enter choice (1-4):");
            choiceByUser = keyboard.nextInt();
            return choiceByUser;

        }
    }
