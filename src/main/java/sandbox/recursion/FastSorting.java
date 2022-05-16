package sandbox.recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FastSorting {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(Arrays.asList(10, 1, 2, 11, 3, 4, 5, 6, 7, 8, -9));

        System.out.println(sort(a));

    }

    public static ArrayList<Integer> sort(ArrayList<Integer> list) {
        if (list.size()  < 2) {
            return list;
        } else {
            int pivot_position = list.size() / 2;
            int pivot = list.get(pivot_position);

            ArrayList<Integer> left = new ArrayList<>();
            ArrayList<Integer> right = new ArrayList<>();

            int pos = 0;

            for (Integer i : list) {
                if (pos != pivot_position) {
                    if (i < pivot) {
                        left.add(i);
                    } else {
                        right.add(i);
                    }
                }
                pos++;
            }

            ArrayList<Integer> result = new ArrayList<>();

            result.addAll(sort(left));
            result.addAll(new ArrayList<>(Arrays.asList(pivot)));
            result.addAll(sort(right));

            return result;
        }
    }
}
