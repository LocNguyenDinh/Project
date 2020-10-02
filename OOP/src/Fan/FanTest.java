package Fan;

public class FanTest {
    public static void main(String[] args) {
        Fan[] fans= new Fan[2];
        fans[0]= new Fan(3,10,"yellow",true);
        fans[1]= new Fan(2,5,"blue",false);

        for(Fan fan: fans){
            System.out.println(fan);
        }
    }
}
