
import java.math.BigInteger;
class Solution {
    public int[] plusOne(int[] digits) {
    StringBuilder sb = new StringBuilder();

    for (int d : digits) {
            sb.append(d);
        }

    BigInteger num = new BigInteger(sb.toString());

      
    num = num.add(BigInteger.ONE);

       
    String ans = num.toString();

    int[] result = new int[ans.length()];
    for (int i = 0; i < ans.length(); i++) {
            result[i] = ans.charAt(i) - '0';
        }

        return result;

        }
}