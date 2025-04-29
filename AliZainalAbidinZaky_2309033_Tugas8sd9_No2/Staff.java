package AliZainalAbidinZaky_2309033_Tugas8sd9_No2;

/**
 *
 * @author Ali Zaky
 */
public class Staff extends Employee {
    private String title;

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, MyDate hireDate, String title) {
        super(name, address, phoneNumber, email, office, salary, hireDate);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Staff: " + getName() + ", Title: " + title + ", " + super.toString();
    }
}
