import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPerson {
    @Test
    public void testConstructor() {
        //given
        Long expectedId = 12345l;
        String expectedName = "mem";

        // when
        Person person = new Person(expectedId,expectedName);
        //then
        Long actualId = person.getId();
        String actualName = person.getName();
        Assertions.assertEquals(expectedName,actualName);
        Assertions.assertEquals(expectedId,actualId);

    }
    @Test
    public void testSetName(){
        //given
        Person person= new Person(1234l, "mem");
        String expected = "Mike";
        //when
       person.setName(expected);
        //then
        String actual= person.getName();
        Assertions.assertEquals(expected,actual);
    }
}