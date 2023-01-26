
import static org.junit.Assert.*;
import org.junit.*;
import java.util.ArrayList;
import java.util.List;

public class ListTest {
    List<String> list1 = new ArrayList<String>();
    List<String> list2 = new ArrayList<String>();
    List<String> list3 = new ArrayList<String>();
    List<String> list4 = new ArrayList<String>();
    StringChecker sc = new StringCheckerClass();
    @Before
    public void setUp() throws Exception{
        
        list1.add("cat");
        list1.add("cow");
        list1.add("dog");
        list1.add("fish");
        list1.add("pig");
        list2.add("big");
        list2.add("cop");

        list3.add("big");
        list3.add("cat");
        list3.add("cop");
        list3.add("cow");
        list3.add("dog");
        list3.add("fish");
        list3.add("pig");
        list4.add("cat");
    }
    
    @Test
    public void testFilter(){
        assertEquals(list4, ListExamples.filter(list1, sc));
    }

    @Test
    public void testMerge(){
        assertEquals(list3, ListExamples.merge(list1, list2));
    }
    
}