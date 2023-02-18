package iterator;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class EvenNumbersIteratorTest {

    @Test
    void printEven() {
        Integer[] array = new Integer[]{2};

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);
        EvenNumbersIterator.iterator = arrayList.iterator();
        int num = arrayList.iterator().next();

            assertEquals(2, num);


    }
}

