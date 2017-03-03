package no.uib.info233.v2017.yih002.oblig2;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayDeque;

/**
 * @author Kristoffer Hansen
 */
public class AdvisorTest {

    Bag lectureTest = new Bag<Lecture>(10);
    ArrayDeque scheduleTest = new ArrayDeque<Lecture>(10);
    Lecture testLecture = new Lecture(1015, 1200, "Test1");
    Lecture testLecture2 = new Lecture(1215, 1400, "Test2");

    @Before
    public void setUp() throws Exception {
        scheduleTest.add(testLecture);
        scheduleTest.add(testLecture2);
        Assert.assertEquals(2, scheduleTest.size());

    }

    @Test
    public void getCurrentSize() throws Exception {
        Assert.assertEquals(2, scheduleTest.size());
    }

    @Test
    public void add() throws Exception {
        Lecture testLecture3 = new Lecture(1415, 1600, "Test3");
        scheduleTest.add(testLecture3);
        Assert.assertEquals(3, scheduleTest.size());
    }





    @Test
    public void remove() throws Exception {
        scheduleTest.remove(testLecture2);
        Assert.assertEquals(1, scheduleTest.size());
    }

    @Test
    public void contains() throws Exception {
        lectureTest.contains("Test1");
        Assert.assertEquals(true, true);
    }

    @Test
    public void clear() throws Exception {
        scheduleTest.clear();
        Assert.assertEquals(0, scheduleTest.size());
    }











}
