import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestPeople {
    @Test
    public void testAdd(){
        //Given
        Person person = new Person(2345, "Osoro");
        Person person1 = new Person(6867,"Moundae");
        People people =new People();
        people.add(person);
        people.add(person1);
        int expected =3;
        //when
        people.add(new Person(222, "Lin"));

        //then
        int actual = people.count();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testRemove(){
        //given
        Person person = new Person(2345, "Osoro");
        Person person1 = new Person(6867,"Moundae");
        People people =new People();
        people.add(person);
        people.add(person1);
        int expected =1;
        //when
        people.remove(person);
        //then
        int actual = people.count();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void testFindById(){
        //given
        Person person = new Person(2345, "Osoro");
        Person person1 = new Person(6867,"Moundae");
        People people =new People();
        people.add(person);
        people.add(person1);
       String expected = "Osoro";
        //when
        people.findId(2345);
        //then
        String actual = people.findId(2345).getName();
        Assertions.assertEquals(expected,actual);
    }

}