import models.Person;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

public class PersonUtilsTest {

    Person person = mock(Person.class, RETURNS_DEEP_STUBS);
    PersonUtils personUtils = new PersonUtils(person);

    @Test
    public void testIsSameManufactureName() {
        String manufactureName = "Ford Motor";
        when(person.getCar().getManufacture().getName()).thenReturn(manufactureName);
        assertTrue(manufactureName, personUtils.isSameManufactureName(manufactureName));
    }

}
