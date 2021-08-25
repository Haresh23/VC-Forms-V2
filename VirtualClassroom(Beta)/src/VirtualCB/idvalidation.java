package VirtualCB;



import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class idvalidation {
    private Pattern pattern;
    private  Matcher matcher;

    private static final String name_regex="^([0-9]){3,3}";
    public   idvalidation(){
        pattern= Pattern.compile(name_regex);
    }
    public boolean  idvalidator(final String name){
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

}

