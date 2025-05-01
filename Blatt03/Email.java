package Blatt03;

public class Email extends  Message{

    @Override
    public String getType() {
        return "E-mail";
    }

    public void send(){
        System.out.println("E-Mail sent");
    }
}
