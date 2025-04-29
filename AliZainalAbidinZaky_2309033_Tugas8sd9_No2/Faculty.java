package AliZainalAbidinZaky_2309033_Tugas8sd9_No2;

/**
 *
 * @author Ali Zaky
 */

// Kelas Faculty (subclass dari Employee)
public class Faculty extends Employee{
    private int workHours;
    private String rank;

    public Faculty(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, int workHours, String rank) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.workHours = workHours;
        this.rank = rank;
    }

    public int getWorkHours() {
        return workHours;
    }

    public String getRank() {
        return rank;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Faculty: " + getName() + ", Rank: " + rank + ", Work Hours: " + workHours + ", " + super.toString();
    }
}