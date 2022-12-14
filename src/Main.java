import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        ArrayList<Integer> someList = new ArrayList<>(50);
        Random rand = new Random();
        int step = 50;

        ArrayList<Long> bubble1 = new ArrayList<>();
//        ArrayList<Long> bubble2 = new ArrayList<>();
//        ArrayList<Long> bubble3 = new ArrayList<>();
//        ArrayList<Long> bubble4 = new ArrayList<>();

        ArrayList<Long> insertion1 = new ArrayList<>();
//        ArrayList<Long> insertion2 = new ArrayList<>();
//        ArrayList<Long> insertion3 = new ArrayList<>();
//        ArrayList<Long> insertion4 = new ArrayList<>();

        ArrayList<Long> merge1 = new ArrayList<>();
//        ArrayList<Long> merge2 = new ArrayList<>();
//        ArrayList<Long> merge3 = new ArrayList<>();
//        ArrayList<Long> merge4 = new ArrayList<>();

        ArrayList<Long> quick1 = new ArrayList<>();
//        ArrayList<Long> quick2 = new ArrayList<>();
//        ArrayList<Long> quick3 = new ArrayList<>();
//        ArrayList<Long> quick4 = new ArrayList<>();


        for (int j = 50; j <= 50; j += step) {
            someList.clear();
            for (int i = 0; i < j; i++) {
                someList.add(i, rand.nextInt(10));
            }
            BubbleSort bubbleS = new BubbleSort(someList);
            long startTimeB = System.nanoTime();
            bubbleS.sort();
            long endTimeB = System.nanoTime();
            long durationB = (endTimeB - startTimeB) / 1000;

            InsertionSort insertionI = new InsertionSort(someList);
            long startTimeI = System.nanoTime();
            insertionI.sort();
            long endTimeI = System.nanoTime();
            long durationI = (endTimeI - startTimeI) / 1000;

            MergeSort mergeS = new MergeSort(someList);
            long startTimeM = System.nanoTime();
            mergeS.sortStart();
            long endTimeM = System.nanoTime();
            long durationM = (endTimeM - startTimeM) / 1000;

            QuickSort quickS = new QuickSort(someList);
            long startTimeQ = System.nanoTime();
            quickS.sortStart();
            long endTimeQ = System.nanoTime();
            long durationQ = (endTimeQ - startTimeQ) / 1000;

            /*
            //2nd run
            someList.clear();
            for (int i = 0; i < j; i++) {
                someList.add(i, rand.nextInt());
            }
            BubbleSort bubbleS2 = new BubbleSort(someList);
            long startTimeB2 = System.nanoTime();
            bubbleS2.sort();
            long endTimeB2 = System.nanoTime();
            long durationB2 = (endTimeB2 - startTimeB2) / 1000;

            InsertionSort insertionI2 = new InsertionSort(someList);
            long startTimeI2 = System.nanoTime();
            insertionI2.sort();
            long endTimeI2 = System.nanoTime();
            long durationI2 = (endTimeI2 - startTimeI2) / 1000;

            MergeSort mergeS2 = new MergeSort(someList);
            long startTimeM2 = System.nanoTime();
            mergeS2.sortStart();
            long endTimeM2 = System.nanoTime();
            long durationM2 = (endTimeM2 - startTimeM2) / 1000;

            QuickSort quickS2 = new QuickSort(someList);
            long startTimeQ2 = System.nanoTime();
            quickS2.sortStart();
            long endTimeQ2 = System.nanoTime();
            long durationQ2 = (endTimeQ2 - startTimeQ2) / 1000;

            //3rd run
            someList.clear();
            for (int i = 0; i < j; i++) {
                someList.add(i, rand.nextInt());
            }
            BubbleSort bubbleS3 = new BubbleSort(someList);
            long startTimeB3 = System.nanoTime();
            bubbleS3.sort();
            long endTimeB3 = System.nanoTime();
            long durationB3 = (endTimeB3 - startTimeB3) / 1000;

            InsertionSort insertionI3 = new InsertionSort(someList);
            long startTimeI3 = System.nanoTime();
            insertionI3.sort();
            long endTimeI3 = System.nanoTime();
            long durationI3 = (endTimeI3 - startTimeI3) / 1000;

            MergeSort mergeS3 = new MergeSort(someList);
            long startTimeM3 = System.nanoTime();
            mergeS3.sortStart();
            long endTimeM3 = System.nanoTime();
            long durationM3 = (endTimeM3 - startTimeM3) / 1000;

            QuickSort quickS3 = new QuickSort(someList);
            long startTimeQ3 = System.nanoTime();
            quickS3.sortStart();
            long endTimeQ3 = System.nanoTime();
            long durationQ3 = (endTimeQ3 - startTimeQ3) / 1000;

            //4th run
            someList.clear();
            for (int i = 0; i < j; i++) {
                someList.add(i, rand.nextInt());
            }
            BubbleSort bubbleS4 = new BubbleSort(someList);
            long startTimeB4 = System.nanoTime();
            bubbleS4.sort();
            long endTimeB4 = System.nanoTime();
            long durationB4 = (endTimeB4 - startTimeB4) / 1000;

            InsertionSort insertionI4 = new InsertionSort(someList);
            long startTimeI4 = System.nanoTime();
            insertionI4.sort();
            long endTimeI4 = System.nanoTime();
            long durationI4 = (endTimeI4 - startTimeI4) / 1000;

            MergeSort mergeS4 = new MergeSort(someList);
            long startTimeM4 = System.nanoTime();
            mergeS4.sortStart();
            long endTimeM4 = System.nanoTime();
            long durationM4 = (endTimeM4 - startTimeM4) / 1000;

            QuickSort quickS4 = new QuickSort(someList);
            long startTimeQ4 = System.nanoTime();
            quickS4.sortStart();
            long endTimeQ4 = System.nanoTime();
            long durationQ4 = (endTimeQ4 - startTimeQ4) / 1000;
             */



            System.out.println("------------------------------------------------------------------------");
            System.out.println("bubble sort for array of size " + j + " in micro seconds: " + durationB);
            System.out.println("insertion sort for array of size " + j + " in micro seconds: " + durationI);
            System.out.println("merge sort for array of size " + j + " in micro seconds: " + durationM);
            System.out.println("quick sort for array of size " + j + " in micro seconds: " + durationQ);


            bubble1.add(durationB);
//            bubble2.add(durationB2);
//            bubble3.add(durationB3);
//            bubble4.add(durationB4);

            insertion1.add(durationI);
//            insertion2.add(durationI2);
//            insertion3.add(durationI3);
//            insertion4.add(durationI4);

            merge1.add(durationM);
//            merge2.add(durationM2);
//            merge3.add(durationM3);
//            merge4.add(durationM4);

            quick1.add(durationQ);
//            quick2.add(durationQ2);
//            quick3.add(durationQ3);
//            quick4.add(durationQ4);

            if (j == 50) step = 450;
            if (j == 500) step = 500;
            if (j == 1000) step = 1000;
        }

        /*
        //CSV generator
        StringBuilder stringBuilder = new StringBuilder();
        File myObj = new File("C:\\Users\\Mikolaj\\Desktop\\results.csv");
        myObj.delete();

        stringBuilder.append(";").append("Bubble Sort 1").append(";").append("Bubble Sort 2").append(";").append("Bubble Sort 3").append(";").append("Bubble Sort 4").append(";").append("Insertion Sort 1").append(";").append("Insertion Sort 2").append(";").append("Insertion Sort 3").append(";").append("Insertion Sort 4").append(";").append("Merge Sort 1").append(";").append("Merge Sort 2").append(";").append("Merge Sort 3").append(";").append("Merge Sort 4").append(";").append("Quick Sort 1").append(";").append("Quick Sort 2").append(";").append("Quick Sort 3").append(";").append("Quick Sort 4").append("\n");

        for (int i = 0; i < bubble1.size(); i++) {
            String bbl1 = bubble1.get(i).toString();
            String bbl2 = bubble2.get(i).toString();
            String bbl3 = bubble3.get(i).toString();
            String bbl4 = bubble4.get(i).toString();

            String insert1 = insertion1.get(i).toString();
            String insert2 = insertion2.get(i).toString();
            String insert3 = insertion3.get(i).toString();
            String insert4 = insertion4.get(i).toString();

            String mrg1 = merge1.get(i).toString();
            String mrg2 = merge2.get(i).toString();
            String mrg3 = merge3.get(i).toString();
            String mrg4 = merge4.get(i).toString();

            String qck1 = quick1.get(i).toString();
            String qck2 = quick2.get(i).toString();
            String qck3 = quick3.get(i).toString();
            String qck4 = quick4.get(i).toString();


            step = 1000;
            int a = i  * step;
            if(i==0) a=1050;
            if(i==1) a=1500;
            if(i==2) a=2000;
            stringBuilder.append((a-1000) + "elems").append(";").append(bbl1).append(";").append(bbl2).append(";").append(bbl3).append(";").append(bbl4).append(";").append(insert1).append(";").append(insert2).append(";").append(insert3).append(";").append(insert4).append(";").append(mrg1).append(";").append(mrg2).append(";").append(mrg3).append(";").append(mrg4).append(";").append(qck1).append(";").append(qck2).append(";").append(qck3).append(";").append(qck4).append("\n");
        }

        try (FileWriter writer = new FileWriter("C:\\Users\\Mikolaj\\Desktop\\results.csv")) {
            writer.write(stringBuilder.toString());
            System.out.println("CSV file created");
        } catch (Exception e) {
            System.out.println("File already exists! Close the file and run the program again.");
        }

         */
    }
}