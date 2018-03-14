import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class MainTest {
    String path = "C:\\Users\\ExeMed\\Desktop\\Kodilla\\zadaniePlik\\src\\test\\resources";

    @Test
    public void createUserListFromFileWithValidValues(){
        //Given
        // When
        ArrayList<User> usersList = Main.getUserListFromFile(path);
        //Then
        assertEquals("Edyta" ,usersList.get(0).getName());
        assertEquals("Karol" ,usersList.get(1).getName());
        assertEquals("Nowak" ,usersList.get(2).getSurname());
        assertEquals("Nowak" ,usersList.get(3).getSurname());
    }

    @Test
    public void createUserListFromFileWithCorrectSize(){
        //Given
        // When
        ArrayList<User> usersList = Main.getUserListFromFile(path);
        //Then
        assertEquals(8 ,usersList.size());
    }
}
