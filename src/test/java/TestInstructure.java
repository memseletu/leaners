import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestInstructure {
    @Test
    public void testImplemetation(){
        //given
        Instructor instructor = new Instructor(876l, "Mikaila");
        //when

        //then
        Assertions.assertTrue(instructor instanceof Teacher);
    }
     @Test
    public void testInheritance(){
        //given
         Instructor instructor = new Instructor(563l, "Peter");
         //when

         //then
         Assertions.assertTrue(instructor instanceof Person);
     }
     @Test
    public void testTeach(){
      //given
         Instructor instructor = new Instructor(987l,"Aqil");
         Learner learner = new Student(233l,"Osoro",40);
         Double expected = 50.0;
      //when
         instructor.teach(learner, 10);
      //then
         Double actual = learner.getTotalStudyTime();
        Assertions.assertEquals(expected,actual);
     }
     @Test
    public void testLecture(){
        //given
           Instructor instructor = new Instructor(5678l, "Masood");
           Student student = new Student(345l, "mem", 1);
           Student student1= new Student(657l, "de", 7);
           Learner[] learners = {student,student1};
           Double expected = 9.0;
        //when
         instructor.lecture(learners, 16.0);

        //then
         Double actual = learners[0].getTotalStudyTime();
         Assertions.assertEquals(expected,actual);
     }

}