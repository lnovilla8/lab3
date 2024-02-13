import static org.junit.Assert.*;
import org.junit.*;

public class LinkedListTests {


    @Test
    public void testAppendTwoElements(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);

        assertEquals(1, list.root.value);
        assertEquals(2, list.root.next.value);
    }

    @Test
    public void testAppendThreeElements(){
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);

        assertEquals(1, list.root.value);
        assertEquals(2, list.root.next.value);
        assertEquals(3, list.root.next.next.value);
    }
}