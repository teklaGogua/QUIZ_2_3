package oop.q3;

public class Test {
    public static void main(String[] args) {
        University university = new University();
        
        // Create some students
        Student me = new Student("Tekla", "Gogua", "Georgia", "01101117065");
        Student John_doe = new Student("John", "Doe", "USA", "11111111111");
        Student John_smith = new Student("Jane", "Smith", "UK", "00000000000");
        
        // Test the methods
        System.out.println("Info for John_smith (not added yet):");
        System.out.println(university.getStudentInfoStrange(John_smith));
        
        university.addStudent(John_doe);
        university.addStudent(John_smith);
        
        System.out.println("\nAll students:");
        university.printStudents();
        
        System.out.println("\nInfo for me (not added yet):");
        System.out.println(university.getStudentInfoStrange(me));
        
        System.out.println("\nInfo for John_doe:");
        System.out.println(university.getStudentInfoStrange(John_doe));
        
        university.addStudent(me);
        System.out.println("\nInfo for me (after adding):");
        System.out.println(university.getStudentInfoStrange(me));
    }
}
