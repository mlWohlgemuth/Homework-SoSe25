package Blatt02;

import java.util.ArrayList;

public class Inbox {
    private ArrayList<Mail> mails = new ArrayList<Mail>();

    public Inbox(ArrayList<Mail> mails) {
        this.mails = mails;
    }

    public ArrayList<Mail> getMails() {
        return mails;
    }

    public void addMails(Mail mail) {
        mails.add(mail);
    }

    public Mail getMailindex (int index) {
        return mails.get(index);
    }

    public void printMails() {
        for(Mail mail: mails) {
            System.out.println(mail.isRead() + " | "+ mail.getSubject() + " | " + mail.getAddress() + " | " + mail.getDateTime());
        }
    }
    public void open(int index) {
        if (index < 0 || index >= mails.size()) {
            System.out.println("Index out of bounds.");
            return;
        }
        System.out.println(getMailindex(index).getSubject() + " by: " + getMailindex(index).getAddress() + " at: " + getMailindex(index).getDateTime() +  ": " + getMailindex(index).getMessage());
    }
    public void countUnread() {
        int x=0;
        for(Mail mails: mails) {
            x=x+1;
        }
        System.out.println(Integer.toString(x));
    }

}
