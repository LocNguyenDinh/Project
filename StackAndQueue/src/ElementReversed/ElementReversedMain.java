package ElementReversed;

import java.util.Stack;

public class ElementReversedMain {

    private static void ElementReversed(String element) {
        String[] mWord = element.split("\\s");
        Stack wStack = new Stack();
        for (int i = 0; i < mWord.length; i++) {
            wStack.push(mWord[i]);
        }
        for (int j = 0; j < mWord.length; j++) {
            System.out.print(wStack.pop() + " ");
        }

    }

    public static void main(String[] args) {
        String[] s = new String[]{"Git is a free", "open source distributed version control"};
        for (String element : s) {
            System.out.println(element);
            ElementReversed(element);
            System.out.println();
        }

    }
}
