package EducationCenter;

import java.time.LocalDate;
import java.time.Period;
import java.util.Arrays;
import java.util.SplittableRandom;

public class StudentMain {
    public static void main(String[] args) {
        School school = new School("Bilimkana", "Kyrgyzstan", LocalDate.of(2000, 12, 12));
        College college = new College("It academy", "Kyrgyzstan", LocalDate.of(1996, 2, 15));
        University university = new University("KSTU", "Kyrgyzstan", LocalDate.of(1952, 9, 13));
        Student student1 = new Student("Alina", "Akhunova", "Female", LocalDate.of(2020, 9, 1), university);
        Student student2 = new Student("Aziza", "Tynybekova", "Female", LocalDate.of(2020, 9, 1), university);
        Student student3 = new Student("Tunuk", "Zhumabekova", "Female", LocalDate.of(2023, 9, 1), college);
        Student student4 = new Student("Farida", "B", "Female", LocalDate.of(2021, 9, 1), university);
        Student student5 = new Student("Adeliia", "J", "Female", LocalDate.of(2018, 9, 1), university);
        Student student6 = new Student("Alina", "T", "Female", LocalDate.of(2020, 9, 1), school);
        Student student7 = new Student("Kandybek", "Isaev", "Male", LocalDate.of(2023, 9, 1), college);
        Student student8 = new Student("Asel", "A", "Female", LocalDate.of(2020, 9, 1), university);
        Student student9 = new Student("Zalkar", "M", "Male", LocalDate.of(2022, 9, 1), college);
        Student student10 = new Student("Islam", "M", "Male", LocalDate.of(2020, 9, 1), university);
        Student[] students = {student2, student6, student10, student3, student7, student5, student1, student4, student6, student8, student1, student9};
      //  showStudents(students);
        System.out.println(showStudentInfo(students));

    }
    public static void showStudents(Student[]students) {
        for (Student st : students) {
            System.out.println(st);
        }
    }
    public static String showStudentInfo(Student[]students){
        LocalDate currentDate = LocalDate.now();
        for (int i = 0; i < students.length ; i++) {
           Period period = Period.between(students[i].getDateOfStart(),currentDate);
            System.out.println(students[i].getName()+" is "+students[i].getEducationCenter()+" years studying "+period.getYears());
        }
        return null;
    }
}
