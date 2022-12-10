import java.util.ArrayList;

public class MergeSort {
    ArrayList<Integer> toBeSorted = new ArrayList<>();

    public void sortGiven() {
        sort(0, toBeSorted.size() - 1);
    }

    public void sort(int l, int r) {
        if (l < r && (r - l) >= 1) {
            int m = (r + l) / 2;
            sort(l, m);
            sort(m + 1, r);

            merge(l, m, r);
        }
    }

    public void merge(int l, int m, int r) {
        ArrayList<Integer> sortedStuff = new ArrayList<>();
        int left = l;
        int right = m + 1;

        while (left <= m && right <= r) {
            if (toBeSorted.get(left) <= toBeSorted.get(right)) {
                sortedStuff.add(toBeSorted.get(left));
                left++;
            } else {
                sortedStuff.add(toBeSorted.get(right));
                right++;
            }
        }
        while (left<=m){
            sortedStuff.add(toBeSorted.get(left));
            left++;
        }
        while (right<=r){
            sortedStuff.add(toBeSorted.get(right));
            right++;
        }

        int i=0;
        int j=l;
        while (i<sortedStuff.size()){
            toBeSorted.set(j,sortedStuff.get(i++));
            j++;
        }

    }


    public void printIt() {
        for (int i = 0; i < toBeSorted.size(); i++) {
            System.out.print(toBeSorted.get(i) + " ");
        }
    }

    public MergeSort(ArrayList<Integer> someList) {
        toBeSorted = new ArrayList<Integer>(someList);
    }
}
