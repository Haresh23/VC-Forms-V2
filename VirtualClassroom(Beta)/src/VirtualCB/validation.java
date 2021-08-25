package VirtualCB;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class validation {
    private Pattern pattern;
    private  Matcher matcher;

    private static final String name_regex="^[a-zA-Z ]{3,15}";
    public   validation(){
        pattern= Pattern.compile(name_regex);
    }
    public boolean  validator(final String name){
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

}
