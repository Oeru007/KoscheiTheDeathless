package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Duck5 {
    @Autowired
    private Needle7 needle;


    @Override
    public String toString() {
        return ", в утке яйцо " + needle.toString();
    }
}
