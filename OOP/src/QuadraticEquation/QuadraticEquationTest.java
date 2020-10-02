package QuadraticEquation;

public class QuadraticEquationTest {
    public static void main(String[] args) {
        QuadraticEquation[] quadraticEquations = new QuadraticEquation[2];
        quadraticEquations[0] = new QuadraticEquation(3, 2, -5);
        quadraticEquations[1] = new QuadraticEquation(2, 3, 4);

        for (QuadraticEquation quadraticEquation : quadraticEquations) {
            System.out.println(quadraticEquation);
        }
    }
}
