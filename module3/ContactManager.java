import java.util.*; 
 
public class ContactManager { 
 
    public static void main(String[] args) { 
 
        HashMap<String, Contact> contacts = new HashMap<>(); 
 
        // Step 4: add contacts here 
        contacts.put("John Doe", new Contact("John Doe", "123-456-7890"));
        contacts.put("Jane Smith", new Contact("Jane Smith", "098-765-4321"));
        contacts.put("Ada Lovelace", new Contact("Ada Lovelace", "+1 617 555 0101"));
        contacts.put("Alan Turing", new Contact("Alan Turing", "+44 20 7946 0958"));
        contacts.put("Grace Hopper", new Contact("Grace Hopper", "+1 212 555 0199"));
 
        // Step 5: look up a contact 
        String nameToLookup = "Ada Lovelace";
        if (contacts.containsKey(nameToLookup)) {
            Contact contactFound = contacts.get(nameToLookup);
            System.out.println(contactFound);
        } else {
            System.out.println("Contact not found: " + nameToLookup);
        }
 
        // Step 6: Sort and print contact list 
        printSortedContacts(contacts);

        // Remove a contact
        String nameToRemove = "John Doe";
        if (contacts.containsKey(nameToRemove)) {
            contacts.remove(nameToRemove);
            System.out.println("\nRemoved contact: " + nameToRemove);
            printSortedContacts(contacts);
        } else {
            System.out.println("\nContact not found: " + nameToRemove);
        }
    } 

    static void printSortedContacts(HashMap<String, Contact> contacts) {
            ArrayList<Contact> sorted = new ArrayList<>(contacts.values());
            sorted.sort((a, b) -> a.getName().compareTo(b.getName()));
            System.out.println("\n=== All Contacts ===");
            for (Contact contact : sorted) {
                System.out.println(contact);
            }
        }
}