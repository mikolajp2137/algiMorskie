import java.util.ArrayList;
import java.util.Random;

public class QuickSort {
    ArrayList<Integer> toBeSorted = new ArrayList<>();

    public void sortStart(){
        sort(0, toBeSorted.size()-1);
    }
    public void sort(int start, int end){
        int q;
        if(start<end){
            q = partition(start, end);
            sort(start,q);
            sort(q+1,end);
        }
    }

    int partition(int start, int end){
        int init = start;
        int len = end;

        Random r = new Random();
        int pivotIndex = nextIntInRange(start,end,r);
        int pivot = toBeSorted.get(pivotIndex);

        while (true){
            while (toBeSorted.get(len)>pivot && len>start){
                len--;
            }
            while (toBeSorted.get(init)<pivot && init<end){
                init++;
            }
            if(init<len){
                int tmp;
                tmp = toBeSorted.get(init);
                toBeSorted.set(init,toBeSorted.get(len));
                toBeSorted.set(len,tmp);
                len--;
                init++;
            }else {
                return len;
            }
        }
    }
    static int nextIntInRange(int min, int max, Random r){
        int diff = max - min;
        if(diff>=0 && diff != Integer.MAX_VALUE){
            return (min + r.nextInt(diff+1));
        }
        int i;
        do{
            i = r.nextInt();
        }while (i<min || i > max);
        return i;
    }


    public void printIt() {
        for (int i = 0; i < toBeSorted.size(); i++) {
            System.out.print(toBeSorted.get(i) + " ");
        }
    }

    public QuickSort(ArrayList<Integer> someList) {
        toBeSorted = new ArrayList<Integer>(someList);
    }
}
