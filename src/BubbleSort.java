import java.util.ArrayList;

public class BubbleSort {
    ArrayList<Integer> toBeSorted = new ArrayList<>();

    public void sort(){
        for(int i=0; i<toBeSorted.size()-1;i++){
            for(int j=0;j<toBeSorted.size()-1;j++){
                if(toBeSorted.get(j)>toBeSorted.get(j+1)){
                    int tmp = toBeSorted.get(j);
                    toBeSorted.set(j, toBeSorted.get(j + 1));
                    toBeSorted.set(j+1,tmp);
                }
            }
        }
    }
    public void printIt(){
        for(int i=0; i<toBeSorted.size();i++){
            System.out.print(toBeSorted.get(i)+" ");
        }
    }

    public BubbleSort(ArrayList<Integer> someList){
        toBeSorted = new ArrayList<Integer>(someList);
    }
}
