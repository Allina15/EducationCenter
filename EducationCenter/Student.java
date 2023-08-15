package EducationCenter;

import java.time.LocalDate;

public class Student {
    private String name;
    private String surName;
    private String gender;
    private LocalDate dateOfStart;
   private EducationCenter EducationCenter;

    public Student(String name, String surName, String gender, LocalDate dateOfStart, EducationCenter educationCenter) {
        this.name = name;
        this.surName = surName;
        this.gender = gender;
        this.dateOfStart = dateOfStart;
        EducationCenter = educationCenter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDate getDateOfStart() {
        return dateOfStart;
    }

    public void setDateOfStart(LocalDate dateOfStart) {
        this.dateOfStart = dateOfStart;
    }

    public EducationCenter getEducationCenter() {
        return EducationCenter;
    }

    public void setEducationCenter(EducationCenter educationCenter) {
        EducationCenter = educationCenter;
    }

    @Override
    public String toString() {
        return "Student " +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", gender='" + gender + '\'' +
                ", dateOfStart=" + dateOfStart +
                ", EducationCenter=" + EducationCenter +
                '\n';
    }
}
