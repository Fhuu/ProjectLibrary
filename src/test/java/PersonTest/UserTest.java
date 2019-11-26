package PersonTest;

import Person.APerson;
import Person.APersonCreator;
import Person.AdminPersonCreator;
import Person.NonAdminPersonCreator;
import org.junit.Test;

import static junit.framework.TestCase.*;

public class UserTest {
    private APersonCreator uc;
    private APerson user;

    @Test
    private void testCreateNonAdminUser() {
        uc = new NonAdminPersonCreator();
        user = uc.createPerson("Diro", "566367", "05/05/1997");
        assertEquals("Diro", user.getName());
        assertEquals("566367", user.getID());
        assertEquals("05/05/1997", user.getBirthday());
        assertFalse(user.isAdmin());
    }

    @Test
    private void testCreateAdminUser() {
        uc = new AdminPersonCreator();
        user = uc.createPerson("Jacq", "123456", "26/09/1997");
        assertEquals("Jacq", user.getName());
        assertEquals("123456", user.getID());
        assertEquals("26/09/1997", user.getBirthday());
        assertTrue(user.isAdmin());
    }
}
