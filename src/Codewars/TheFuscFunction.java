package Codewars;

import java.math.BigInteger;

public class TheFuscFunction {

    /**
    This Kata is a continuation of Part 1. The fusc function is defined recursively as follows:

    fusc(0) = 0
    fusc(1) = 1
    fusc(2n) = fusc(n)
    fusc(2n + 1) = fusc(n) + fusc(n + 1)
    Your job is to produce the code for the fusc function. In this kata, your function will be tested with large values of n more than 1000 bits ( in JS, LC and PHP: at most 52 bits, in OCaml: at most 64 bits ), so you should be concerned about stack overflow and timeouts.

    Method suggestion:

    Imagine that instead of fusc(n), you were to implement fib(n), which returns the n'th Fibonacci number.

    The function is recursively defined by:
    **/

    public class Fusc {
        public static BigInteger fusc (BigInteger n) {

            return n;
        }

    public static void main(String[] args){


    }
}
