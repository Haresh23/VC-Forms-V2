package VirtualCB;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class passvalidation {
    private Pattern pattern;
    private  Matcher matcher;

    private static final String name_regex="^[a-zA-Z0-9@$]{3,8}";
    public   passvalidation(){
        pattern= Pattern.compile(name_regex);
    }
    public boolean  validator(final String name){
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

}
