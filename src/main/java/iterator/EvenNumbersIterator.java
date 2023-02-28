package iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор, который проходит по массиву и возвращает четные значения
 * @author Liliacea
 * @version 1.0
 */
public  class EvenNumbersIterator implements Iterator {

    public static Integer[] iterator;
    private final int[] values;
    private int index;
    private int evenIndex;
 //   boolean has = false;


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


        for (index = index; index < values.length; index++) {
          //  has = false;

            if (values[index] % 2 == 0) {

                evenIndex = index;



               return true;



            } else {
                return false;
            }


        } return false;
        }





    /**
     * метод перебирает элементы массива.
     * @return even values
     *
     */

    @Override
    public Integer next() throws NoSuchElementException  {

/*if(!hasNext()){
    throw new NoSuchElementException("");

}

 */
try {


    if (values[index] % 2 == 0) {

        evenIndex = index;


    }
} catch (NoSuchElementException e){
    return -1;
}
finally {

    index++;
    return values[evenIndex];
    }
}}







