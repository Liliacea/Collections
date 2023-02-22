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

    /**
     * If the item does not exist, an exception is thrown.
     */
    @org.junit.jupiter.api.Test




    @Test(expected = NoSuchElementException.class)
    public void shouldReturnEvenNumbersSequentially() {
        setUp();
        assertThat(it.hasNext(), is (true));
        assertThat(it.next(), is(4));
       // assertThat(it.hasNext(), is (false));
      //  assertThat(it.next(), is(3));


       /* assertThat(it.hasNext(), is(false));
        assertThat(it.next(), is(3));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(4));
        assertThat(it.hasNext(), is(true));
        it.next();

        */


    }

    /**
     * Testing hasNext twice.
     */
    @Test(expected = NoSuchElementException.class)
    public void sequentialHasNextInvocationDoesntAffectRetrievalOrder() {
        setUp();
        assertThat(it.hasNext(), is(true));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.next(), is(4));
        assertThat(it.next(), is(6));
    }

    /**
     * Testing hasNext .
     */
    @Test(expected = NoSuchElementException.class)
    public void shouldReturnFalseIfNoAnyEvenNumbers() {
        it = new EvenNumbersIterator(new int[]{1});
        assertThat(it.hasNext(), is(false));
    }

    /**
     * All numbers are even.
     */
    @Test
    public void allNumbersAreEven() {
        it = new EvenNumbersIterator(new int[]{2, 4, 6, 8});
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(2));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(4));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(6));
        assertThat(it.hasNext(), is(true));
        assertThat(it.next(), is(8));
    }
}

