public class Student {
    private String name;
    private int studentNum;
    private Address studentAddress;

    public String getName() {
        return name;
    }

    public int getStudentNum() {
        return studentNum;
    }

    public Address getStudentAddress() {
        return studentAddress;
    }

    public void setName() {
        this.name = name;
    }

    public void setStudentNum() {
        this.studentNum = studentNum;
    }

    public void setStudentAddress() {
        this.studentAddress = studentAddress;
    }

    public Student(String name, int num, Address studentAddress) {
        this.name = name;
        this.studentNum = studentNum;
        this.studentAddress = studentAddress;

    }

    public Student(Student other) {
        this.name = other.name;
        this.studentNum = other.studentNum;
        this.studentAddress = other.studentAddress;
    }

    public String toString() {
        return "Student " + name + ", " + studentNum + "\n" +
                "Student's Address:" + studentAddress;
    }

    public boolean sameAddress(Student other) {
        return (this.studentAddress = other.studentAddress);

    }

    public boolean isInTheSameCity(Student other) {
        return (this.studentAddress = other.studentAddress);
    }
}