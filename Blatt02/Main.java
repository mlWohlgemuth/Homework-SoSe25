package Blatt02;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Mail Mail1 = new Mail("1@gmail.com", "Food", "Wanna get some food?", LocalDateTime.now(), false );
        Mail Mail2 = new Mail("benni@gmail.com", "lol", "lass lol?", LocalDateTime.now(), false );
        Mail Mail3 = new Mail("Mama@gmail.com", "Wäsche", "Wasch mal endlich deine waesche junge", LocalDateTime.now(), false );

        Mail1.printMail();

        ArrayList <Mail> eingangsmail = new ArrayList<Mail>();
        eingangsmail.add(Mail1);
        eingangsmail.add(Mail2);
        eingangsmail.add(Mail3);

        Inbox neueInbox = new Inbox(eingangsmail);

        neueInbox.countUnread();
    }

}
