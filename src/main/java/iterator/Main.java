package iterator;

import java.util.*;

public class Main {


    public static void main(String[] args) {
        Integer[] array = new Integer[]{1, 2, 2, 4, 7, 8, 5, 4};

        ArrayList<Integer> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, array);


        EvenNumbersIterator.iterator = arrayList.iterator();
        while (EvenNumbersIterator.iterator.hasNext()) {
            EvenNumbersIterator.printEven();

            }

    }
}











