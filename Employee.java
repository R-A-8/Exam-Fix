/**
 * Consider this incomplete Employee class to answer some questions of your exam
 *
 * @author Tassia
 * @version 0.1
 */
public class Employee{
    private String fullname;
    private int yearOfBirth;
    private boolean onLeave;
    private double hourlyWage;
    private double unpaidHours;

    public Employee(String fullname, int yearOfBirth, double hourlyWage){
        this.fullname = fullname;
        this.yearOfBirth = yearOfBirth;
        this.hourlyWage = hourlyWage;
        onLeave = false;
        unpaidHours = 0.0;
    }
    
    /**
     * Returns true is an employee is above 16 years old
     */
    private int calculateAge(int currentYear){
        return (currentYear - yearOfBirth);
    }

    /**
     * Returns true is an employee is above 16 years old
     */
    public boolean canDrive(){
        int age = calculateAge(2025);
        if(age >= 16){
            System.out.println("Can drive.");// to be completed
    }
        else{
            System.out.println("You have to wait " + (16 - age) + "years to drive.");
        }
    }
    
    /**
     * Question 11
     */
    public int getYearOfBirth(){
        return yearOfBirth; // getter method question 11
    }

    /**
     * Question 11
     */
    public void setHourlyWage(double hourlyWage){
        this.hourlyWage = hourlyWage; // setter method question 11
    }
    
    /*
     * Returns the net pay for the outstanding unpaid hours
     */
    private double calculatePay(){
        int hoursOfWork;
        double taxes = 0.30;
        double pay;
        double initialSalary;
        initialSalary = (hoursOfWork * unpaidHours) * hourlyWage;
        pay = initialSalary - (initialSalary * taxes);
        return pay;     // Question 13
    }

    /*
     * Output the payment record and resets unpaid hours
     */
    public void paySalary(double pay){
        double pay = calculatedPay;
        System.out.println(fullname + "has received a wire transfer of " + pay + "CAD");
        unpaidHours = 0.0;      // Question 14
    }
}