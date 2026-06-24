
import java.util.HashMap;
import java.util.Map;

public class ContactService {
    private Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contact == null || contacts.containsKey(contact.getContactId())) {
            throw new IllegalArgumentException("Invalid contact");
        }
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String contactId) {
        if (!contacts.containsKey(contactId)) {
            throw new IllegalArgumentException("Contact not found");
        }
        contacts.remove(contactId);
    }

    public void updateFirstName(String contactId, String firstName) {
        Contact contact = contacts.get(contactId);
        if (contact == null) throw new IllegalArgumentException();
        contact.setFirstName(firstName);
    }

    public void updateLastName(String contactId, String lastName) {
        Contact contact = contacts.get(contactId);
        if (contact == null) throw new IllegalArgumentException();
        contact.setLastName(lastName);
    }

    public void updatePhone(String contactId, String phone) {
        Contact contact = contacts.get(contactId);
        if (contact == null) throw new IllegalArgumentException();
        contact.setPhone(phone);
    }

    public void updateAddress(String contactId, String address) {
        Contact contact = contacts.get(contactId);
        if (contact == null) throw new IllegalArgumentException();
        contact.setAddress(address);
    }

    public Contact getContact(String contactId) {
        return contacts.get(contactId);
    }
}
