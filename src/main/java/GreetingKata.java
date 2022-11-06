import java.util.Locale;

public class GreetingKata {

    public static String greeting(String[] names) {

        if (names == null){
            return "Hello, my friend";
        }



        if (names.length == 1)
        {
            if (names[0].toUpperCase().equals(names[0])){
                return "HELLO " + names[0] + "!";
            }

            return "Hello, " + names[0];
        }
        else if (names.length == 2)
        {
            return "Hello " + names[0] + " and " + names[1] + ".";
        }

        else
        {
            String returnMsg="";
            for (String item:names) {
                returnMsg += item + ", ";
            }
            System.out.println(returnMsg);
            return "Hello " + returnMsg;
        }

    }
}
