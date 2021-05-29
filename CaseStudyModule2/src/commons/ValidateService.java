package commons;

public class ValidateService extends Exception{
    public ValidateService(String message) {
        super(message);
    }
    public static void checkIdVilla(String string) throws ValidateService {
        String regex =  "^(SVVL)-[0-9]{4}$";
        if (!string.matches(regex)){
            throw new ValidateService("Vui lòng nhập id theo đúng yêu cầu!!!");
        }
    }
    public static void checkVerviceName(String string) throws ValidateService{
        String regex =  "^[A-Z][a-z]$";
        if (!string.matches(regex)){
            throw new ValidateService("Vui lòng nhập tên theo đúng yêu cầu!!!");
        }
    }
    public static void checkAcreageUser(String string) throws ValidateService{
        String regex ="[3-9][0-9].\\d{2}$";
        if (!string.matches(regex)){
            throw new ValidateService("Vui lòng nhập diện tích sử dụng theo đúng yêu cầu!!!");
        }
    }
}
