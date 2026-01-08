
package com.lambdaExpression;

interface CheckArmstrong {
    boolean check(int n);
}

public class armstrong {
    public static void main(String[] args) {

        CheckArmstrong a = n -> {
            int temp = n, sum = 0;
            while (temp > 0) {
                int r = temp % 10;
                sum += r * r * r;
                temp /= 10;
            }
            return sum == n;
        };

        System.out.println(a.check(153));
    }
}




