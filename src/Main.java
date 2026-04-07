import java.util.ArrayList;
import java.util.Iterator;

class ContactInformation {
    private String name;
    private String email;

    public ContactInformation(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "ContactInformation{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

class CollectionContacts implements Iterable<ContactInformation> {
    private final ArrayList<ContactInformation> contacts = new ArrayList<>();

    public CollectionContacts() {
    }

    @Override
    public boolean equals(Object o) {
        return contacts.equals(o);
    }

    public ContactInformation get(int index) {
        return contacts.get(index);
    }

    public boolean add(ContactInformation contactInformation) {
        return contacts.add(contactInformation);
    }

    @Override
    public Iterator<ContactInformation> iterator() {
        return this.contacts.iterator();
    }
}

public class Main {
    static void main() {
        var newContact = new ContactInformation("Johnny", "apple@gmail.com");
        var newContact2 = new ContactInformation("Kai", "apple@gmail.com");
        var newContact3 = new ContactInformation("Alice", "apple@gmail.com");
        var newContact4 = new ContactInformation("Ben", "apple@gmail.com");
        var contactList = new CollectionContacts();

        contactList.add(newContact);
        contactList.add(newContact2);
        contactList.add(newContact3);
        contactList.add(newContact4);

        for (var contact : contactList) {
            System.out.println(contact);
        }
    }
}