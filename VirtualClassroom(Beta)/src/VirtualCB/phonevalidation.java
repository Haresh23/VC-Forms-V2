package VirtualCB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class phonevalidation {
    private Pattern pattern;
    private  Matcher matcher;

    private static final String name_regex="^[0-9]{10,10}";
    public   phonevalidation(){
        pattern= Pattern.compile(name_regex);
    }
    public boolean  validator(final String name){
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

}

