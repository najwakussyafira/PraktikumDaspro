package Praktikum12;

public class fibonacci {
    public static void main(String[] args) {

        System.out.println("Fibonacci dengan Rekursif:");
    
        for (int i = 0; i < 12; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        System.out.println("\nFibonacci dengan Iteratif:");
        fibonacciIterative(12);
    }
        public static int fibonacciRecursive(int n) {
            if (n <= 1) {
                return n;
            }
            return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
        }

        public static void fibonacciIterative(int n) {
            int a = 0, b = 1;
            System.out.print(a + " " + b + " ");
            for (int i = 2; i < n; i++) {
                int next = a + b;
                System.out.print(next + " ");
                a = b;
                b = next;
            }
        }
    }   