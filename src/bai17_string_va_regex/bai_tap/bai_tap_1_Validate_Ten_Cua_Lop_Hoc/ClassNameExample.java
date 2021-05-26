package bai17_string_va_regex.bai_tap.bai_tap_1_Validate_Ten_Cua_Lop_Hoc;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_NAME_REGEX = "^[CAP]+\\d{4}+[GHIKLM]$";

    public ClassNameExample() {
    }

    public boolean validate(String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
