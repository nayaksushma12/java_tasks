package com.student;

public class StudentMain {
    Student[] students = new Student[5];

    public Student findStudentById(int id){
        for(Student student: students){
            if(student.getId()==id) return student;
        }
        return null;
    }

    public void printArray(){
        for(Student student: students){
            System.out.println(student);
        }
    }

    public void changeNameForId(int id, String name){
        for(Student student: students){
            if(student.getId()==id){
                student.changeName(name);
                System.out.println("After changing name: "+student);
            }
        }
    }

    public static void main(String[] args) {
        StudentMain sm = new StudentMain();

        sm.students = new Student[]{new Student(1, "Sushma", 101),
                new Student(2, "Rashmi BK", 72),
                new Student(3, "Shreya Prabhu", 94),
                new Student(4, "Soumya Bhat", 97),
                new Student(5, "Ramya", 70)};

        System.out.println("Array of student:");
        sm.printArray();

        int searchId=1;

        System.out.println("\nStudent data for id: "+searchId+" is "+ sm.findStudentById(searchId));

        sm.changeNameForId(searchId,"Sushma Nayak");
    }
}
