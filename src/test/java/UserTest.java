import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class UserTest {
    private String name;
    private String surname;
    private String birthDate;

    @Before
    public void setUp(){
        name = "Jan";
        surname = "Nowak";
        birthDate = "2000-10-05";
    }

    @Test
    public void shouldCreateCorrectUser(){
        //Given
        // When
        User user = new User(name, surname, birthDate);
        //Then
        assertEquals("Jan", user.getName());
        assertEquals("Nowak", user.getSurname());
        assertEquals("2000-10-05", user.getBirthDate());
        assertEquals(null, user.getPhoneNumber());
    }

    @Test
    public void shouldCreateCorrectUserWithPhoneNumber(){
        //Given
        // When
        User user = new User(name, surname, birthDate, "600900300");
        //Then
        assertEquals("Jan", user.getName());
        assertEquals("Nowak", user.getSurname());
        assertEquals("2000-10-05", user.getBirthDate());
        assertEquals("600900300", user.getPhoneNumber());
    }

    @Test
    public void shouldReturnCorrectAge(){
        //Given
        // When
        User user = new User(name, surname, birthDate, "600900300");
        //Then
        assertEquals(new Integer(17), user.getAge());
    }
}
