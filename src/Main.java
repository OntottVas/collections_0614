import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // LIST interface: sequence, can be duplicates
        List<Integer> arrayNumbList = new ArrayList<>();

        // add elements
        arrayNumbList.add(3);
        arrayNumbList.add(2);

        // remove elements
        arrayNumbList.remove(0);

        // get element on given index
        int firstNumber = arrayNumbList.get(0);

        // check for empty list
        arrayNumbList.isEmpty();

        // get size of the list
        int length = arrayNumbList.size();

        //transform into array
        arrayNumbList.toArray();

        // check if given number contained
        arrayNumbList.contains(3);

        // iterate
        for (Integer number : arrayNumbList) {
            //System.out.println(number);
        }

        // create a list
        List<Integer> numberList = new ArrayList<>();
        // Add 10 elements in to the list
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            numberList.add(random.nextInt(0, 1000));
        }

        // print out every element
        for (Integer i : numberList) {
            System.out.println(i);
        }

        System.out.println("----------------");

        // print out only even numbers
        for (Integer integer : numberList) {
            if (integer % 2 == 0) {
                System.out.println(integer);
            }
        }

        System.out.println("----------------");

        // print out in one line with space between them
        for (Integer integer : numberList) {
            System.out.print(integer + " ");
        }

        // remove first element of the list
        numberList.remove(0);


        // remove last element of the list
        numberList.remove(numberList.size() - 1);
        System.out.println();


        System.out.println("----------------");
        // does it contain 8
        System.out.println(numberList.contains(8));

        // new list
        List<Integer> newList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            newList.add(random.nextInt(-1000, 1000));
        }

        System.out.println("New List: ");
        for (Integer integer : newList) {
            System.out.print(integer + " ");
        }
        System.out.println();

        // average
        int sum = 0;
        double average = 0;
        for (Integer i : newList) {
            sum += i;
        }
        average = (double) sum / newList.size();
        System.out.println("Average: " + average);

        int minIndex = 0;
        for (int i = 1; i < newList.size(); i++) {
            if (newList.get(minIndex) > newList.get(i)) {
                minIndex = i;
            }
        }

        int maxIndex = 0;
        for (int i = 1; i < newList.size() - 1; i++) {
            if (newList.get(maxIndex) < newList.get(i)) {
                maxIndex = i;
            }
        }

        System.out.println("Division: " + (newList.get(maxIndex) + newList.get(minIndex)));

        int sumOfNegatives = 0;
        for (Integer integer : newList) {
            if(integer < 0) {
                sumOfNegatives++;
            }
        }
        System.out.println("Sum of negatives: " + sumOfNegatives);

        // SET interface: no sequence, cannot be duplicates
        // MAP interface: key-value pair, 1 -> "Failed"
    }
}