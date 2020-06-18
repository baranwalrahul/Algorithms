package algorithm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Primitive_Calculator {
   
    private static List<Integer> greedyAlgorithm(int n) {
        List<Integer> sequence = new ArrayList<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 0);
        int i = 1;
        while (i <= n) {
            int valueDivide3 = i % 3 == 0 ? map.get(i / 3) : n;
            int valueDivide2 = i % 2 == 0 ? map.get(i / 2) : n;
            int valueMinusOne = map.get(i - 1);
            int value;
            if (valueDivide3 <= valueDivide2 && valueDivide3 <= valueMinusOne) {
                value = i / 3;

            } else if (valueDivide2 <= valueDivide3 && valueDivide2 <= valueMinusOne) {
                value = i / 2;

            } else {
                value = i - 1;
            }
            int min = map.get(value) + 1;
            map.put(i, min);
            i++;
        }


        while (n > 0){
            int valueDivide3 =n % 3 == 0 ? map.get(n / 3) : n;
            int valueDivide2 = n % 2 == 0 ? map.get(n / 2) : n;
            int valueMinusOne = map.get(n - 1);
            int value;
            if (valueDivide3 <= valueDivide2 && valueDivide3 <= valueMinusOne) {
                value = n / 3;

            } else if (valueDivide2 <= valueDivide3 && valueDivide2 <= valueMinusOne) {
                value = n / 2;

            } else {
                value = n - 1;
            }
            sequence.add(n);
            n = value;
        }

        Collections.reverse(sequence);
        return sequence;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = greedyAlgorithm(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}