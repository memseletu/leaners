import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestStudent {
    @Test
    public void testImplementation(){
        //given
        Student student = new Student(1234l, "mem", 2);

        //when

        //then
        Assertions.assertTrue(student instanceof Learner);
    }
    @Test
    public void testInheritance(){
        //given
        Student student = new Student(234l,"Saad", 15);
        //when

        //then
        Assertions.assertTrue(student instanceof Person);
    }
    @Test
    public void testLearn(){
        //given
      Student student = new Student(456l, "Derrick", 20);
      Double expected = 15.0;
      //when
      student.setTotalStudyTime(expected);
      //then
        Double actual = student.getTotalStudyTime();
      Assertions.assertEquals(expected,actual);
    }

}