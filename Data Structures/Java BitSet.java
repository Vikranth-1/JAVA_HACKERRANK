import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();  
        int m = sc.nextInt();  

        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for (int i = 0; i < m; i++) {

            String op = sc.next();
            int set = sc.nextInt();
            int index = sc.nextInt();

            BitSet first = (set == 1) ? b1 : b2;

            if (op.equals("AND")) {
                BitSet second = (index == 1) ? b1 : b2;
                first.and(second);

            } else if (op.equals("OR")) {
                BitSet second = (index == 1) ? b1 : b2;
                first.or(second);

            } else if (op.equals("XOR")) {
                BitSet second = (index == 1) ? b1 : b2;
                first.xor(second);

            } else if (op.equals("FLIP")) {
                first.flip(index);

            } else if (op.equals("SET")) {
                first.set(index);
            }

            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }

        sc.close();
    }
}
