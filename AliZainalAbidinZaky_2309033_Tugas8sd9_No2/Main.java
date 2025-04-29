package AliZainalAbidinZaky_2309033_Tugas8sd9_No2;

/**
 *
 * @author Ali Zaky
 */
public class Main {
    public static void main(String[] args) {
        // Membuat objek MyDate untuk tanggal
        MyDate hireDate = new MyDate(15, 3, 2020);

        // Membuat objek Person
        Person person = new Person("Isagi Yoichi", "123 Main St", "555-1234", "isagi@example.com");
        
        // Membuat objek Student
        Student student = new Student("Itoshi Sae", "456 Oak St", "555-5678", "sae@example.com", Student.FRESHMAN);
        
        // Membuat objek Employee
        Employee employee = new Employee("Ali Zainal", "789 Pine St", "555-8765", "ali@upi.edu", "Room 404", 50000, hireDate);
        
        // Membuat objek Faculty
        Faculty faculty = new Faculty("Ego Jinpachi", "101 Maple St", "555-4321", "jinpachi@example.com", "Room 542", 70000, hireDate, 40, "Professor");
        
        // Membuat objek Staff
        Staff staff = new Staff("Comot Hambali", "202 Birch St", "555-8765", "comot@example.com", "Room 303", 40000, hireDate, "Administrative Assistant");

        // Menampilkan hasil toString
        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());
    }
    
}
