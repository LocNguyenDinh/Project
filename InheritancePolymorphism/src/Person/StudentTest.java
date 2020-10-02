package Person;

public class StudentTest {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Nam", "Nghe An", "History", 2020, 19.5);
        students[1] = new Student("Tu", "Thanh Hoa", "History", 2020, 20.2);

        for (Student st : students) {
            System.out.println(st);
        }
    }
}
