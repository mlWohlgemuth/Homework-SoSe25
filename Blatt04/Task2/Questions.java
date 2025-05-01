package Blatt04.Task2;

public class Questions {
    public static void main(String[] args) {
        //Comparing Strings: Explain the difference between == and equals() when comparing String
        //objects in Java. Provide a short example showing why == may not be reliable.

        String String1 = new String("Apfel");
        String String2 = new String("Apfel");

        // Antwort: == überpüft, ob ein Objekt auf genau das selbe Objekt zeigt, wie das andere
        // equals() guckt nur auf den Inhalt
        System.out.println(String1 == String2); //false da sie auf andere Objekte zeigen
        System.out.println(String1.equals(String2)); //true da gleicher Inhalt

        String string1 = "abc ";
        String string2 = "abc ";
        System.out.println(string1 == string2 ); // true
        //Das ist, weil der compiler im String pool erst guckt, ob es "abc " schon einmal gibt. Im Falle vom oberen
        //Beispiel trifft das hier nicht zu, da bei new immer ein neues Objekt erstellt wird, egal ob es schon
        //im String Pool ist.

        //• What happens if you create the second string using new String("abc") instead?
        // In diesem Falle wird wegen new zwangsweise ein neues Objekt erstellt und es wird nicht auf das selbe
        //Objekt gezeigt und es wird false ausgegeben bei ==.
    }


}
