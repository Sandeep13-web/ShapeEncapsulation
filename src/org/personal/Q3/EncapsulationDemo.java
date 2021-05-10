package org.personal.Q3;

public class EncapsulationDemo {
    public static void main(String[] args) {
        Student student = new Student();
            student.setId(1);
            student.setName("Sandeep Risal");
            student.setSalary(1566.58);
            
            System.out.println("Student ID: " + student.getId());
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student Salary: " + student.getSalary());
            System.out.println("--------------------------------------------------------");
    }
}
