package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public  class EvenNumbersIterator implements Iterator {

    static Iterator<Integer> iterator;



    @Override
    public boolean hasNext() {

        return false;
    }

    @Override
    public Object next() {
        return null;
    }

    public static void printEven(){



            int num = iterator.next();
            if (num % 2 == 0) {
                System.out.println(num);

            }

    }


}
