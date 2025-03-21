import java.util.ArrayList;

public class task1 {
    public static int[] filterEvenIndexOddValue(int[] array) {
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < array.length; i += 2) {
            if (array[i] % 2 != 0) {
                result.add(array[i]);
            }
        }


        int[] filteredArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            filteredArray[i] = result.get(i);
        }

        return filteredArray;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6};
        System.out.println(java.util.Arrays.toString(filterEvenIndexOddValue(arr1)));
    }
}