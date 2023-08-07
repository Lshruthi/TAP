package Somana;

import java.util.Scanner;

public class Fraction {
    static int findGCD(int n, int m) {
        int gcd = 1;
        for (int i = n; i >= 1; i--) {
            if (n % i == 0 && m % i == 0) {
                gcd = i;
                break;
            }
        }
        return gcd;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n1 Value : ");
        int n1 = sc.nextInt();
        System.out.print("Enter n2 Value : ");
        int n2 = sc.nextInt();
        sc.close();
        int gcd = findGCD(n1, n2);
        System.out.println("GCD : "+gcd);
        System.out.println("Fraction : "+n1 / gcd + "/" + n2 / gcd);

    }
}
