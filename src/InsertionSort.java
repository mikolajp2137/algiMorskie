import java.util.ArrayList;

public class InsertionSort {
    ArrayList<Integer> toBeSorted = new ArrayList<>();

    public void sort() {
        for (int i = 0; i < toBeSorted.size(); i++) {
            int k = toBeSorted.get(i);
            int j = i - 1;
            while (j >= 0 && toBeSorted.get(j) > k) {
                toBeSorted.set(j + 1, toBeSorted.get(j));
                j = j - 1;
            }
            toBeSorted.set(j + 1, k);
        }
    }

    public void printIt() {
        for (int i = 0; i < toBeSorted.size(); i++) {
            System.out.print(toBeSorted.get(i) + " ");
        }
    }

    public InsertionSort(ArrayList<Integer> someList) {
        toBeSorted = new ArrayList<Integer>(someList);
    }
}
