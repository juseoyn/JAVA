import java.util.Scanner;

class Student {
    private int studentId;
    private String name;
    private String major;
    private long phone;

    public Student(int studentId, String name, String major, long phone) {
        this.studentId = studentId;
        this.name = name;
        this.major = major;
        this.phone = phone;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public void printInfo() {
        String phoneStr = Long.toString(phone);
        phoneStr = "010-" + phoneStr.substring(3, 7) + "-" + phoneStr.substring(7);

        System.out.println(studentId + " " + name + " " + major + " " + phoneStr);
    }
}

public class Homework2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Student[] students = new Student[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("학생의 학번, 이름, 전공, 전화번호를 입력하세요: ");

            int studentId = sc.nextInt();
            String name = sc.next();
            String major = sc.next();
            long phone = sc.nextLong();

            students[i] = new Student(studentId, name, major, phone);
        }

        System.out.println();
        System.out.println("입력된 학생들의 정보는 다음과 같습니다..");

        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "번째 학생: ");
            students[i].printInfo();
        }

        sc.close();
    }
}