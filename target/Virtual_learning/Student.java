package src.main.webapp;

import java.util.ArrayList;

public class Student{
    String rollNo;
    String name;
    String email;
    String password;
    String degree;
    String course;
    String year;
    String value;

    public Student() {
    }

    public Student(String rollNo, String name, String email, String password, String degree, String course, String year) {
        this.rollNo = rollNo;
        this.name = name;
        this.email = email;
        this.password = password;
        this.degree = degree;
        this.course = course;
        this.year = year;
    }
    public Student(String rollNo, String name, String degree, String value){
        this.rollNo = rollNo;
        this.name = name;
        this.degree = degree;
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public static Student getByRoll(ArrayList<Student> students, String rollNo){
        for (Student student: students){
            if(student.getRollNo().equals(rollNo)){
                return student;
            }
        }
        return null;
    }


    public java.lang.String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", degree=" + degree +
                ", course='" + course + '\'' +
                ", year=" + year +
                '}';
    }
}
