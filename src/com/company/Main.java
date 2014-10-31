package com.company;

public class Main {
    //I thought it best to just store all of the prime numbers instead of having to generate them recursively every time.
    //More memory, but less processing.
    //I'm trying to print out the 10001th prime number. since 2 is prime it gets divided by 2 early and isn't inserted...into the array no need to construct a loop every time to check the first element of the array
//So the 9999 position in the array (since array begins counting at 0) is the 10000th prime number, not including 2. So technically it is the 10001th prime number
    public static void main(String[] args) {
        int primeCounter = 0;
        int loop = 2;
        int[] primes = new int[10000];
        boolean isPrime = true;

        while (primeCounter < 10000) {
            if (loop % 2 == 0) {  //if number is even it isn't prime
                loop++;
            } else {
                for (int i = 0; i < primeCounter; i++) {  //if number divisible by a prime it isn't prime
                    if (loop % primes[i] == 0)
                        isPrime = false;
                }
                if (isPrime) {
                    primes[primeCounter] = loop;
                    primeCounter++;
                }
                loop++;
                isPrime = true;
            }
        }
        System.out.println(primes[9999]);
    }
}