package Blatt05.Task1;

public class ShippingInfo {
    private String city;
    private int zip;
    private String country;

    public ShippingInfo(String city, int zip, String country) throws InvalidShippingInfoException {
        if (city == null) {
            throw new InvalidShippingInfoException("City cannot be empty");
        }
        if (zip <= 0) {
            throw new InvalidShippingInfoException("no negative values");
        }

        this.city = city;
        this.zip = zip;
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
