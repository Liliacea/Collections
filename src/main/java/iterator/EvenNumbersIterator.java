package iterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.NoSuchElementException;

public  class EvenNumbersIterator implements Iterator {

    static Iterator<Integer> iterator;
    private final int[] values;
    private int index;
    private int evenIndex;


    public EvenNumbersIterator(int[] values) {
        this.values = values;


    }


    @Override
    public boolean hasNext() {
    boolean has = false;
        for (int index = 0; index < values.length; index++) {

            if (values[index] % 2 == 0) {

            evenIndex = index;

                System.out.println("есть");

            } has = true;
        }

        System.out.println("кончились");
        return has;


    }



    @Override
    public ArrayList<Integer> next() throws NoSuchElementException {
    ArrayList<Integer> arrayList = new ArrayList<>();
        for (int index = 0; index < values.length; index++) {

            if (values[index] % 2 == 0) {

                evenIndex = index;
                arrayList.add(values[evenIndex]);
            }

        }
        System.out.println(arrayList);
        return arrayList;

    }

    public static Iterator<Integer> getIterator() {
        return iterator;
    }


}
