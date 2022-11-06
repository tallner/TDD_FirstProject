import java.util.Locale;

public class GreetingKata {

    public static String greeting(String name) {
        //String returnMessage="";

        if (name == null){
            return "Hello, my friend";
        }

        if (name.toUpperCase().equals(name)){
            return "HELLO " + name + "!";
        }

        return "Hello, " + name;
    }
}
