public class Address {
    private String street;
    private String city;
    private int zip;

    public String getCity() {

        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getZip() {
        return zip;
    }

    public void setCity() {
        this.city = city;
    }

    public void setStreet() {
        this.street = street;
    }

    public void setZip() {
        this.zip = zip;
    }

    public Address(Address other) {
        this.city = other.city;
        this.street = other.street;
        this.zip = other.zip;
    }

    public Address(String street, String city, int zip) {
        this.street = street;
        this.city = city;
        this.zip = zip;
    }

    public String toString() {

        return street + " st" + "." + "," + street + " " + zip;
    }

    public boolean equals(Address other) {
        return (this.city == other.city && this.street == other.street && this.zip == other.zip);
    }

    public boolean isInTheSameCity(Address other) {
        return (this.city == other.city);
    }

}
