package iterator;


import org.junit.Before;
import org.junit.Test;


import java.util.Iterator;
import java.util.NoSuchElementException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

class EvenNumbersIteratorTest {

    private Iterator<Integer> it;

    /**
     * Initialize the class EvenNumberIterator.
     */
    @Before
    public void setUp() {

        it = new EvenNumbersIterator(new int[]{2, 3, 4});
    }


    @org.junit.jupiter.api.Test

    /**
     * not even number
     */

    @Test()
    public void notEvenCase() {
        it = new EvenNumbersIterator(new int[]{1,3});
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(false));


    }

    /**
     * if even number in the end of array
     */

    @Test()
    public void evenCase() {
        it = new EvenNumbersIterator(new int[]{2});
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), is(true));


    }

    /**
     * If the array is empty.
     */

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void emptyArray() {
        it = new EvenNumbersIterator(new int[]{});
        assertThat(it.next(), is(1));
        assertThat(it.hasNext(), is(false));


    }

    /**
     * Multiple call hasNext return the same value
     */
    @Test()
    public void multipleCallHasNext() {
        setUp();
        for (int i = 0; i < 10; i++) {
            assertThat(it.hasNext(), is(true));
        }

    }
}






