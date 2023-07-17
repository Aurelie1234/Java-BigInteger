import java.math.BigInteger;


public class Solution {


public static void main(String[] args) {
/* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
Scanner scan = new Scanner(System.in);
BigInteger a = scan.nextBigInteger();
BigInteger b = scan.nextBigInteger();
BigInteger ans = a.add(b);
BigInteger ans2 = a.multiply(b);
scan.close();
System.out.println(ans.toString());
System.out.println(ans2.toString());
}
}
