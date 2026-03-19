import java.io.*;
import java.lang.reflect.*;
import java.util.*;

class Add {
    
    public void add(int... numbers) {
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            System.out.print(numbers[i]);

            if (i < numbers.length - 1) {
                System.out.print("+");
            }
        }

        System.out.println("=" + sum);
    }
}

public class Solution {
    public static void main(String[] args) {
        Add obj = new Add();

        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();
        int n4 = sc.nextInt();
        int n5 = sc.nextInt();
        int n6 = sc.nextInt();

        obj.add(n1, n2);
        obj.add(n1, n2, n3);
        obj.add(n1, n2, n3, n4, n5);
        obj.add(n1, n2, n3, n4, n5, n6);
    }
}
