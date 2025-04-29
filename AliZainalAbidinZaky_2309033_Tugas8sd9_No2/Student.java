/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AliZainalAbidinZaky_2309033_Tugas8sd9_No2;

/**
 *
 * @author Ali Zaky
 */

// Kelas Student (subclass dari Person)
public class Student extends Person {
    public static final String FRESHMAN = "Freshman";
    public static final String SOPHOMORE = "Sophomore";
    public static final String JUNIOR = "Junior";
    public static final String SENIOR = "Senior";

    private String classStatus;

    public Student(String name, String address, String phoneNumber, String email, String classStatus) {
        super(name, address, phoneNumber, email);
        this.classStatus = classStatus;
    }

    public String getClassStatus() {
        return classStatus;
    }

    // Overriding toString method
    @Override
    public String toString() {
        return "Student: " + getName() + ", Status: " + classStatus;
    }
}
