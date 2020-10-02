package Person;

public class StaffTest {

    public static void main(String[] args) {
        Staff[] staff = new Staff[2];
        staff[0] = new Staff("Hung", "Nghe An", "Thanh Chuong I HighSchool", 200);
        staff[1] = new Staff("Nam", "Nghe An", "Thanh Chuong III HighSchool", 200);

        for (Staff st : staff) {
            System.out.println(st);
        }
    }
}
