package com.java.dsa;

import java.util.Scanner;

public class Xinputs {
    public static void main(String[] args){
        Xinputs in = new Xinputs();
        System.out.println(in.sum());
    }
    private int sum() {
        int sum = 0;
        String x = "";
        Scanner s = new Scanner(System.in);
        while (true) {
            x = s.next();
            if(x.matches("x")){
                return sum;
            }else {
                int num = Integer.parseInt(x);
                sum = sum +num;
            }

        }
    }
}
