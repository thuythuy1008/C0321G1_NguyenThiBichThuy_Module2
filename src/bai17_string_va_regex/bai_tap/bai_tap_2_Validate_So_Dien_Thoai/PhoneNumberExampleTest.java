package bai17_string_va_regex.bai_tap.bai_tap_2_Validate_So_Dien_Thoai;

public class PhoneNumberExampleTest {
    private static PhoneNumberExample phoneNumberExample;

    public static final String[] validPhoneNumber = new String[]{"(84)-(0978489648)", "(84)-(0648978489)", "(84)-(0123489648)"};
    public static final String[] invalidPhoneNumber = new String[]{"(a8)-(22222222)", "(aa)-(02222222)", "(84)-(22222222)"};

    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        for (String phoneNumber : validPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }
        for (String phoneNumber : invalidPhoneNumber) {
            boolean isvalid = phoneNumberExample.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }
    }
}
