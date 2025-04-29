package AliZainalAbidinZaky_2309033_Tugas8sd9_No2;

/**
 *
 * @author Ali Zaky
 */

// Kelas MyDate (Untuk tanggal perekrutan)
class MyDate {
    private int day, month, year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "/" + month + "/" + year;
    }
}

public class Employee extends Person {
    private String office;
    private double salary;
    private MyDate hireDate;

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter methods
    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public MyDate getHireDate() {
        return hireDate;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Employee: " + getName() + ", Office: " + office + ", Salary: " + salary + ", Hire Date: " + hireDate;
    }
}
