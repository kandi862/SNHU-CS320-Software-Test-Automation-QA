
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContactTest {

    @Test
    void testValidContact() {
        Contact c = new Contact("1", "John", "Doe", "1234567890", "Address");
        assertEquals("John", c.getFirstName());
    }

    @Test
    void testInvalidId() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(null, "John", "Doe", "1234567890", "Address");
        });
    }

    @Test
    void testInvalidPhone() {
        assertThrows(IllegalArgumentException.class, () -> {
            new Contact("1", "John", "Doe", "123", "Address");
        });
    }
}
