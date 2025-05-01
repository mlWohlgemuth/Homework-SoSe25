package Blatt03;

public class Account {
    public String owner;
    private double balance;
    protected int pin;
    String internalNote;

    public double getBalance() {
        return balance;
    }

    public void changePin(int Pin, int newPin){
        if (this.pin==Pin) this.pin=newPin;
        else return;
    }
}
