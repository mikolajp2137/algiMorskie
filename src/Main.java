import java.util.ArrayList;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        ArrayList<Integer> smallList = new ArrayList<>(50);
        ArrayList<Integer> largeList = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 50; i++) {
            smallList.add(i, rand.nextInt(10));
        }
        for (int i = 0; i < 50000; i++) {
            largeList.add(i, rand.nextInt());
        }
        /*
        for (int i = 0; i < 50; i++) {
            System.out.print(largeList.get(i) + " ");
        }*/

        BubbleSort bubbleSmall = new BubbleSort(smallList);
        BubbleSort bubbleLarge = new BubbleSort(largeList);
        bubbleSmall.printIt();
        long startTime = System.nanoTime();
        bubbleSmall.sort();
        long endTime = System.nanoTime();
        long duration = (endTime - startTime)/1000000;
        System.out.println("\n");
        bubbleSmall.printIt();
        System.out.println("\nBubble sort execution time in milliseconds: "+duration);

        long startTime2 = System.nanoTime();
        bubbleLarge.sort();
        long endTime2 = System.nanoTime();
        long duration2 = (endTime2 - startTime2)/1000000;
        System.out.println("\nBubble sort execution time in milliseconds for larger array: "+duration2);
    }
}