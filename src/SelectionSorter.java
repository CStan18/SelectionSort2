import java.util.ArrayList;

public class SelectionSorter {
    public ArrayList<Integer> ascendingSort(ArrayList<Integer> ints)
    {
        for (int i = 0; i < ints.size(); ++i)
        {
            int indexSmallest = i;

            for (int j = i + 1; j < ints.size(); ++j)
            {
                if (ints.get(j) < ints.get(indexSmallest))
                {
                    indexSmallest = j;
                }
            }
            int temp = ints.get(i);
            ints.set(i, ints.get(indexSmallest));
            ints.set(indexSmallest, temp);
            System.out.println("\n");
            Main.printInts();
        }
        return ints;
    }

    public ArrayList<Integer> descendingSort(ArrayList<Integer> ints)
    {
        for (int i = 0; i < ints.size(); ++i)
        {
            int indexBiggest = i;

            for (int j = i + 1; j < ints.size(); ++j)
            {
                if ((ints.get(j).compareTo(ints.get(indexBiggest))) > 0)
                {
                    indexBiggest = j;
                }
            }
            int temp = ints.get(i);
            ints.set(i, ints.get(indexBiggest));
            ints.set(indexBiggest, temp);
            System.out.println("\n");
            Main.printInts();
        }
        return ints;
    }
}
