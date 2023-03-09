package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор, который проходит по массиву и возвращает четные значения
 *
 * @author Liliacea
 * @version 1.0
 */
public class EvenNumbersIterator implements Iterator {


    private final int[] values;
    private int index;


    public EvenNumbersIterator(int[] values) {
        this.values = values;
    }

    /**
     * метод перебирает элементы массива.
     *
     * @return true в случае, если в цикле еще есть четные значения
     */
    @Override
    public boolean hasNext() {
        while (index < values.length) {
            if (values[index] % 2 == 0) {
                return true;
            } else {
                index++;
               // return false;
            }
        }
        return false;
    }

    /**
     * метод перебирает элементы массива.
     *
     * @return even values
     */
    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException("");
        }

        return values[index++];
    }
}








