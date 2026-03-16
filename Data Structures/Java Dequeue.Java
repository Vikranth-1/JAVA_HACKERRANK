import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = in.nextInt();

        Deque<Integer> deque = new ArrayDeque<>();
        HashSet<Integer> set = new HashSet<>();
        int max = 0;

        for (int i = 0; i < n; i++) {
         
            deque.addLast(arr[i]);

            if (deque.size() > k)
                deque.removeFirst();

            if (deque.size() == k) {
                set.clear();
                set.addAll(deque);
                max = Math.max(max, set.size());
            }
        }

        System.out.println(max);
    }
}
