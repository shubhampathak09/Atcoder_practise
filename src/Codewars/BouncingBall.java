package Codewars;

public class BouncingBall {

    public static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h)
            return -1; // base cases as per problem
        int count = 1;
        double ch = h;
        while (bounce * ch >= window) {
            if (bounce * ch > window) {


                count = count + 2;


            }
            ch = bounce * ch;}
            return count;
        }

        public static void main (String[]args){
            //test case 1
            System.out.println(bouncingBall(3, 0.66, 1.5));
            // test case 2
            System.out.println(bouncingBall(46.0, 0.75, 46.0));
            //test case 3 //assert equal to -1
            System.out.println(bouncingBall(61.0, 1.1, 6.1)); //assert equal to -1
            System.out.println(bouncingBall(2.0, 0.5, 1.0));
            System.out.println(bouncingBall(30.0, 0.66, 1.5));
        }
        // failing for three hidden test cases
        // Added a check ewindow height is exactly equal to bounce height so ball is seen just once and not twice by mother
        //failing for 2 hidden test cases
        //fixing all connditions
    }

