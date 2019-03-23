package base;

/**
 * Created by xieshangwu on 2019/3/23.
 */
public class base {
    public static void main(String[] args) {
        System.out.println(gcd(8, 12));
    }

    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        int r = p % q;
        return gcd(q, r);
    }
}
