package ValidatePhoneNumber;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberExample {
    private final static String PHONENUMBER_REGEX = "^\\((\\d{2})\\)-\\(([0]\\d{9})\\)$";
    private static Pattern pattern;
    private Matcher matcher;

    public PhoneNumberExample() {
        pattern = Pattern.compile(PHONENUMBER_REGEX);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
