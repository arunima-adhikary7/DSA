package Oops.Encapsulation;

public class StudentMain {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setName("Arunima");
        s1.setAge(18);

        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
    }
}

