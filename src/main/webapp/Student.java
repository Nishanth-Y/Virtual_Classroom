package src.main.webapp;

public class Student{
    String rollNo;
    String name;
    String email;
    String password;
    String degree;
    String course;
    String year;

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
