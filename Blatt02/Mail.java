package Blatt02;

import java.time.LocalDateTime;

public class Mail {
    private String address;
    private String subject;
    private String message;
    private LocalDateTime dateTime;
    private boolean IsRead;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public boolean isRead() {
        return IsRead;
    }

    public void setRead(boolean read) {
        IsRead = read;
    }

    public Mail(String address, String subject, String message, LocalDateTime dateTime, boolean isRead) {
        this.address = address;
        this.subject = subject;
        this.message = message;
        this.dateTime = dateTime;
        this.IsRead = isRead;
    }



    public void printMail() {
        System.out.println(subject + " by: " + address + " at: " + dateTime.toString() + ": " + message);
    }
}
