import models.Person;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

public class PersonUtilsTest {

    Person person = mock(Person.class, RETURNS_DEEP_STUBS);
    PersonUtils personUtils = new PersonUtils(person);

    @Test
    public void testManufactureName() {
        String manufactureName = "Ford Motor";
        when(person.getCar().getManufacture().getName()).thenReturn(manufactureName);
        assertEquals(manufactureName, personUtils.getManufactureName());
    }

}
