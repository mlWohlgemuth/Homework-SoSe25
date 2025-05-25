package Blatt05.Task1;

public class Customer {
    private int id;
    private Profile profile;

    public Customer(Profile profile, int id) throws InvalidCustomerException{
        if (profile == null) {
            throw new InvalidCustomerException("no profile");
        }
        if (id <= 0) {
            throw new InvalidCustomerException("id negative");
        }
        this.id = id;
        this.profile = profile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }
}
