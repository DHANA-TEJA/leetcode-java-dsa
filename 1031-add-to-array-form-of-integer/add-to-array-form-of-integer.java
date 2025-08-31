import java.util.*;
import java.math.BigInteger;

class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List<Integer> ans = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        // Convert int[] num → String number
        for (int digit : num) {
            sb.append(digit);
        }

        // Convert to BigInteger
        BigInteger sum = new BigInteger(sb.toString());
        sum = sum.add(BigInteger.valueOf(k));

        // Convert back to digits list
        String Sum = sum.toString();
        for (int i = 0; i < Sum.length(); i++) {
            ans.add(Sum.charAt(i) - '0');
        }

        return ans;
    }
}
