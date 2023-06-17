import java.util.Scanner;

class Login {
    //Login Class
    private String username;
    private String password;

    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public boolean authenticate(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
}

class EmployeeDetails {
    //Employee Details Class
    private String name;
    private int age;
    private String designation;

    public EmployeeDetails(String name, int age, String designation) {
        this.name = name;
        this.age = age;
        this.designation = designation;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
    }
}

class HoursWorked {
    //HoursWorked Class
    private double hours;

    public void setHours(double hours) {
        this.hours = hours;
    }

    public double getHours() {
        return hours;
    }
}

class NetWage {
    //NetWage Class
    private double hourlyRate;

    public NetWage(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public double calculateWage(double hours) {
        return hours * hourlyRate;
    }
}

public class Main {
    //Main Class
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter username: ");
        String username = scanner.nextLine();

        System.out.println("Enter password: ");
        String password = scanner.nextLine();

        Login login = new Login("Admin", "Admin");

        if (login.authenticate(username, password)) {
            System.out.println("Login successful!");

            System.out.println("Enter employee details:");
            System.out.println("Name: ");
            String name = scanner.nextLine();
            System.out.println("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine();
            System.out.println("Designation: ");
            String designation = scanner.nextLine();

            EmployeeDetails employee = new EmployeeDetails(name, age, designation);

            System.out.println("Enter hours worked: ");
            double hoursWorked = scanner.nextDouble();

            HoursWorked hours = new HoursWorked();
            hours.setHours(hoursWorked);

            System.out.println("Enter hourly rate: ");
            double hourlyRate = scanner.nextDouble();

            NetWage netWage = new NetWage(hourlyRate);
            double wage = netWage.calculateWage(hours.getHours());

            System.out.println("Employee Details:");
            employee.displayDetails();

            System.out.println("Hours Worked: " + hours.getHours());
            System.out.println("Net Wage: $" + wage);
        } else {
            System.out.println("Invalid username or password. Login failed.");
        }

        scanner.close();
    }
}

