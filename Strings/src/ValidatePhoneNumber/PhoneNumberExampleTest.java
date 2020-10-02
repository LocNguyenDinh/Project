package ValidatePhoneNumber;

public class PhoneNumberExampleTest {
    private final static String[] validPhoneNumber = new String[]{"(84)-(0978489648)"};
    private final static String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)"};
    private static PhoneNumberExample phoneNumberExample;

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();

        for (String phoneNumber : validPhoneNumber) {
            boolean valid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + valid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean valid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + valid);
        }
    }
}
