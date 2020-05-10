import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vallidate_Class {
    final String VALLIDATE_CLASS = "^[CAP]{1}[0-9]{4}[GHIKLM]{1}$";
    Pattern pattern;
    Matcher matcher;

    Vallidate_Class(){
        pattern = Pattern.compile(VALLIDATE_CLASS);
    }

    boolean vallidate(String str){
        matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
