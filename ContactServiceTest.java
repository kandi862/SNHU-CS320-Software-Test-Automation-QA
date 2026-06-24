
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactServiceTest {

    @Test
    void testAddContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Doe", "1234567890", "Address");

        service.addContact(c);
        assertNotNull(service.getContact("1"));
    }

    @Test
    void testDeleteContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Doe", "1234567890", "Address");

        service.addContact(c);
        service.deleteContact("1");

        assertNull(service.getContact("1"));
    }

    @Test
    void testUpdateContact() {
        ContactService service = new ContactService();
        Contact c = new Contact("1", "John", "Doe", "1234567890", "Address");

        service.addContact(c);
        service.updateFirstName("1", "Jane");

        assertEquals("Jane", service.getContact("1").getFirstName());
    }
}
