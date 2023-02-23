package iterator;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * Итератор, который проходит по массиву и возвращает четные значения
 * @author Liliacea
 * @version 1.0
 */
public  class EvenNumbersIterator implements Iterator {

    static Iterator<Integer> iterator;
    private final int[] values;
    private int index;
    private int evenIndex;


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
        boolean has = false;
        for (int index = 0; index < values.length; index++) {
            has = false;

            if (values[index] % 2 == 0) {

                evenIndex = index;

                System.out.println("есть");

                has = true;
            } else {
                System.out.println("нет");
                has = false;
            }


        }



        System.out.println("конец массива");
        return has;
        }





    /**
     * метод перебирает элементы массива.
     * @return even values
     *
     */

    @Override
    public Integer next()  {


        for (int index = 0; index < values.length; index++) {

            if (values[index] % 2 == 0) {

                evenIndex = index;

                System.out.println(values[evenIndex]);
            }


            }



            try {

                return values[evenIndex];

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("пустой массив");
                e.printStackTrace();

            } return 1;


    }


        public static Iterator<Integer> getIterator () {
            return iterator;
        }


    }
