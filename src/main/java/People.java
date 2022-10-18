import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class People implements Iterable<Person>{
    List<Person> personList;

    public People() {
        personList= new ArrayList<>();
    }

    public void add(Person person) {
       personList.add(person);
    }

    public Person findId(long id) {
        Person person1 = null;
        for (Person person : personList) {
            if (id == person.getId()) {
                person1 = person;
            }

        }
        return person1;
    }

    public boolean contains(Person person) {
        return personList.contains(person);
    }

    public void remove(Person person) {
        personList.remove(person);
    }

    public void remove(long id) {
        for (Person person : personList) {
            if (id == person.getId()) {
                personList.remove(person);
            }
        }
    }

    public void removeAll() {
        personList.clear();
    }

    public int count() {
        return personList.size();
    }

    public Person[] toArray() {
        Person[] person = new Person[personList.size()];
        for (Person person1 : personList) {
            for (int x = 0; x < personList.size(); x++) {
                 person[x] = person1;
            }
        }

        return person;
    }

    @Override
    public Iterator<Person> iterator() {
        return personList.iterator();
    }

}
