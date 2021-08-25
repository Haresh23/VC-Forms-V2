/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualCB;

/**
 *
 * @author HARESHVAR A R
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;
public class emailvaidation {
    private Pattern pattern;
    private  Matcher matcher;

    private static final String name_regex="^([\\w-\\.]+){1,64}@([\\w&&[^_]]+){2,255}.[a-z]{2,}$";
    public   emailvaidation(){
        pattern= Pattern.compile(name_regex);
    }
    public boolean  validator(final String name){
        matcher=pattern.matcher(name);
        return matcher.matches();
    }

}
