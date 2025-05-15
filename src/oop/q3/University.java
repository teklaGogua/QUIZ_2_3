package oop.q3;

import java.util.ArrayList;
import java.util.List;

public class University {
    private List<Student> students = new ArrayList<>();
    
    private final Student MY_SELF = new Student(
        "Tekla",
        "Gogua",       
        "Georgia",     
        "01101117065"     
    );
    
    private final String MY_COURSES = "OOP, Calculus, English C-1, Computer Organiztion, MFOC";

    public void addStudent(Student s) {
        students.add(s);
    }

    public boolean removeStudent(Student s) {
        return students.remove(s);
    }

    public void printStudents() {
        for (Student s : students) {
            System.out.println(s.getName() + " " + s.getSurname() + 
                             " from " + s.getCountry());
        }
    }

    public String getStudentInfoStrange(Student s) {
        // Case 1: Student is myself and in university
        if (s.equals(MY_SELF)) {
            if (students.contains(s)) {
                return MY_COURSES;
            } else {
                // Case 2: Student is myself but not in university
                return MY_SELF.getInfo();
            }
        }
        
        // Case 3: Other students
        if (students.contains(s)) {
            return s.getInfo();
        }
        return null;
    }
}