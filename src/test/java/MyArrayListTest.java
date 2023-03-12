import com.me.kirilltrosnickii.MyArrayList;
import com.me.kirilltrosnickii.MyList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MyArrayListTest {
    @Test
    void testAdd() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        assertEquals(3, list.size());
        assertEquals("one two three ", getElementsAsString(list));
    }

    @Test
    void testAddWithIndex() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four", 1);

        assertEquals(4, list.size());
        assertEquals("one four two three ", getElementsAsString(list));
    }

    @Test
    void testAddLast() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.addLast("three");

        assertEquals(3, list.size());
        assertEquals("one two three ", getElementsAsString(list));
    }

    @Test
    void testGet() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        assertEquals("two", list.get(1));
    }

    @Test
    void testRemove() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        assertEquals("two", list.remove(1));
        assertEquals(2, list.size());
        assertEquals("one three ", getElementsAsString(list));
    }

    @Test
    void testRemoveLast() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        assertEquals("three", list.removeLast());
        assertEquals(2, list.size());
        assertEquals("one two ", getElementsAsString(list));
    }

    @Test
    void testRemoveFirst() {
        MyList list = new MyArrayList();

        list.add("one");
        list.add("two");
        list.add("three");

        assertEquals("one", list.remove());
        assertEquals(2, list.size());
        assertEquals("two three ", getElementsAsString(list));
    }

    @Test
    void testSize() {
        MyList list = new MyArrayList();

        assertEquals(0, list.size());

        list.add("one");
        list.add("two");
        list.add("three");

        assertEquals(3, list.size());
    }

    private String getElementsAsString(MyList list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i)).append(" ");
        }
        return sb.toString();
    }
}
