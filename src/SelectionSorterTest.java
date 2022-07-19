import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SelectionSorterTest {
    SelectionSorter selectionSorter = new SelectionSorter();
    static ArrayList<Integer> ints = new ArrayList<>(Arrays.asList(3, 2, 3, 5, 8));
    static ArrayList<Integer> ascendingInts = new ArrayList<>(Arrays.asList(2, 3, 3, 5, 8));
    static ArrayList<Integer> descendingInts = new ArrayList<>(Arrays.asList(8, 5, 3, 3, 2));

    @org.junit.jupiter.api.Test
    void ascendingSort() {
        assertEquals(selectionSorter.ascendingSort(ints), ascendingInts);
    }

    @org.junit.jupiter.api.Test
    void descendingSort() {
        assertEquals(selectionSorter.descendingSort(ints), descendingInts);
    }
}