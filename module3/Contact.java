public class Contact {
    // Fields
    public String name;
    public String phone;

    // Constructor 
    public Contact(String name, String phone) {
        this.name = name;
        this.phone = phone;
    }

    // Getters
    public String getName() { return this.name; }
    public String getPhone() { return this.phone; }

    // toString
    @Override
    public String toString() {
        return this.name + " | " + this.phone; 
    }
}
