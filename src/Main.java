import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};

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
        for (Integer number: arrayNumbList) {
            System.out.println(number);
        }





        // SET interface: no sequence, cannot be duplicates
        // MAP interface: key-value pair, 1 -> "Failed"
    }
}